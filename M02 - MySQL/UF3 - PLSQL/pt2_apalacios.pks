CREATE OR REPLACE PROCEDURE showModulos(inputModulo VARCHAR2)
    IS
        codModulo ASIGNATURES.COD%TYPE;
        
    BEGIN
        SELECT COD INTO codModulo FROM ASIGNATURES WHERE NOM=inputModulo;
    
        dbms_output.put_line('Módulo ' || inputModulo || ' - ' || codModulo);
        showAlumnos(codModulo);
        estadisticaNotas(codModulo);
        minYmax(codModulo);
        
        
        
    
        
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('El módulo introducido no existe');
 
END showModulos;


/


CREATE OR REPLACE PROCEDURE showAlumnos(inputModulo NOTES.COD%TYPE)
    IS
        CURSOR notasAlumnos is
        SELECT A.APENOM, N.NOTA FROM NOTES N, ALUMNES A WHERE N.DNI = A.DNI AND N.COD=inputModulo;
    
        notasData notasAlumnos%ROWTYPE;
        
    BEGIN
    
        OPEN notasAlumnos;
            LOOP
                FETCH notasAlumnos INTO notasData;
                EXIT WHEN notasAlumnos%NOTFOUND;
                
                dbms_output.put_line('Alumno: ' || notasData.APENOM || ' - Nota: ' || notasData.NOTA);
    
            END LOOP;
        CLOSE notasAlumnos;
 
END showAlumnos;


/


CREATE OR REPLACE PROCEDURE estadisticaNotas(inputModulo NOTES.COD%TYPE)
    IS
        CURSOR notasAlumnos is
        SELECT COUNT(CASE WHEN NOTA<5 THEN 1 END) AS SUSPENSOS, 
        COUNT(CASE WHEN NOTA>4 THEN 1 END) AS APROBADOS, 
        COUNT(CASE WHEN NOTA>6 AND NOTA<9 THEN 1 END) AS NOTABLES,
        COUNT(CASE WHEN NOTA>8 THEN 1 END) AS EXCELENTES
        FROM NOTES
        WHERE COD=inputModulo;
    
        notasData notasAlumnos%ROWTYPE;
        
    BEGIN
    
        OPEN notasAlumnos;
            LOOP
                FETCH notasAlumnos INTO notasData;
                EXIT WHEN notasAlumnos%NOTFOUND;
                
                dbms_output.put_line('Suspensos: ' || notasData.SUSPENSOS || ' Aprobados: ' || notasData.APROBADOS || ' Notables: ' || notasData.NOTABLES || ' Excelentes: ' || notasData.EXCELENTES);
    
            END LOOP;
        CLOSE notasAlumnos;
 
END estadisticaNotas;


/


CREATE OR REPLACE PROCEDURE minYmax(inputModulo NOTES.COD%TYPE)
    IS
        notaMinima NOTES.NOTA%TYPE;
        alumnoMinima ALUMNES.APENOM%TYPE;
        
        notaMaxima NOTES.NOTA%TYPE;
        alumnoMaxima ALUMNES.APENOM%TYPE;
        
    BEGIN
    
        SELECT N.NOTA, A.APENOM INTO notaMinima, alumnoMinima FROM NOTES N, ALUMNES A WHERE N.DNI = A.DNI AND N.COD=inputModulo AND N.NOTA=(SELECT MIN(NOTA) FROM NOTES WHERE COD=inputModulo);
        SELECT N.NOTA, A.APENOM INTO notaMaxima, alumnoMaxima FROM NOTES N, ALUMNES A WHERE N.DNI = A.DNI AND N.COD=inputModulo AND N.NOTA=(SELECT MAX(NOTA) FROM NOTES WHERE COD=inputModulo);
 
        dbms_output.put_line('Nota más baja: ' || notaMinima || ' - Nombre alumno: ' || alumnoMinima);
        dbms_output.put_line('Nota más alta: ' || notaMaxima || ' - Nombre alumno: ' || alumnoMaxima);        
    
 
END minYmax;


/


CREATE OR REPLACE PROCEDURE exceptionsProcedure
    IS
        type tablesToCheck is varray(3) of varchar2(20);
        array tablesToCheck := tablesToCheck('NOTES', 'ALUMNES', 'ASIGNATURES');
    BEGIN
        for i in 1..array.count loop
            IF countTables(array(i)) = 0 THEN
               raise_application_error(-20110+i,'tabla ' || array(i) || ' vacia ');
            END IF;
        end loop;
END exceptionsProcedure;


/


CREATE OR REPLACE FUNCTION countTables(tableInput VARCHAR2)
    RETURN NUMBER IS
    result NUMBER;
    
    BEGIN
        execute immediate 'select count(*) from ' || tableInput into result;
        return result;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('La tabla introducida no existe');
END countTables;