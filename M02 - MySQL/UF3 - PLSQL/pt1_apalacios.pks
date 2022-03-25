CREATE OR REPLACE PROCEDURE pelisNetflix
    IS
        countPelis NUMBER(2);
        
        CURSOR refserieCursor is
        SELECT DISTINCT REFSERIE FROM VISUALITZACIONS GROUP BY REFSERIE;
        
        refserieData refserieCursor%ROWTYPE;
        
    BEGIN
        
        exceptionsProcedure();
        
        SELECT COUNT(DISTINCT REFSERIE) INTO countPelis FROM VISUALITZACIONS;

        IF countPelis <= 2 THEN
            raise_application_error(-20109, 'Hay menos de 4 series que hayan sido vistas');
        
        ELSE
            OPEN refserieCursor;
        
                LOOP
                    FETCH refserieCursor INTO refserieData;
                    EXIT WHEN refserieCursor%NOTFOUND;

                    showSerie(refserieData.REFSERIE);
                        
                    
                END LOOP;
            CLOSE refserieCursor;

        END IF;
 
END pelisNetflix;


/


CREATE OR REPLACE PROCEDURE showSerie(refserieInput VISUALITZACIONS.REFSERIE%TYPE)
    IS
        CURSOR seriesCursor is
        SELECT REFSERIE, NOM, GENERE, DIRECTOR FROM SERIES WHERE REFSERIE = refserieInput;
    
        serieData seriesCursor%ROWTYPE;
        countViews NUMBER(3);
        
    BEGIN
    
        OPEN seriesCursor;
            LOOP
                FETCH seriesCursor INTO serieData;
                EXIT WHEN seriesCursor%NOTFOUND;
                
                SELECT COUNT(REFSERIE) INTO countViews FROM VISUALITZACIONS WHERE REFSERIE=serieData.refserie;
                
                dbms_output.put_line('Nom serie: ' || serieData.REFSERIE || 
                                     ' , Director serie: ' || serieData.DIRECTOR ||
                                     ' , Género serie: ' || serieData.GENERE ||
                                     ' , Número visualizaciones: ' || countViews
                );
                
                showUser(serieData.refserie);
                
                dbms_output.put_line('');
                dbms_output.put_line('');
    
            END LOOP;
        CLOSE seriesCursor;
 
END showSerie;


/


CREATE OR REPLACE PROCEDURE showUser(refserieInput VISUALITZACIONS.REFSERIE%TYPE)
    IS
        CURSOR usersCursor is
        SELECT COD_USUARI, DATA FROM VISUALITZACIONS WHERE REFSERIE = refserieInput;
    
        userData usersCursor%ROWTYPE;
        
    BEGIN
    
        OPEN usersCursor;
            LOOP
                FETCH usersCursor INTO userData;
                EXIT WHEN usersCursor%NOTFOUND;
                
                
                dbms_output.put_line('   · Código usuario: ' || userData.cod_usuari|| ' , Fecha visualización: ' || userData.data);
                
                
            END LOOP;
        CLOSE usersCursor;
 
END showUser;


/


CREATE OR REPLACE PROCEDURE exceptionsProcedure

    IS
        type tablesToCheck is varray(3) of varchar2(20); 
        array tablesToCheck := tablesToCheck('VISUALITZACIONS', 'SERIES', 'USUARIS');

        
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
