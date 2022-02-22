from pyexistdb import db

class ExistDBTest():
    #Metode Main
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url
        
        
        while(True): #Mini menú para escoger que función hacer
            print(" 1.- Ver empleados\n",
                  "2.- Insertar un nuevo departamento\n",
                  "3.- Eliminar un departamento\n",
                  "4.- Modificar un departamento")
            choice = int(input("\nSelecciona una opción [1-4]: "))
            
            if choice == 1:
                self.verEmple()
                break;
            
            elif choice == 2:
                self.Insertadep()
                break;
                
            elif choice == 3:
                self.Borradep()
                break;
                
            elif choice == 4:
                self.Modificadep()
                break;
   
            else:
                print("\n=====================================================")
                print("ERROR, opción seleccionada no válida. Prueba de nuevo")
                print("=====================================================\n")
            
   
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
   
            
    def verEmple(self):
        
        dep = input("Teclea departamento:")
        numdep=int(dep) # convertimos a numérico
        
        self.db = self.conexionBD()
        
        countEmpleados = "count(/empleados/EMP_ROW[DEPT_NO='" + str(numdep) + "'])"
        
        xqy2 =  "for $dep in /empleados/EMP_ROW where DEPT_NO='" + str(numdep) + "'return $dep"
       
        qresCount = self.db.query(countEmpleados)
        qres2 = self.db.query(xqy2)
        
        if str(qresCount) == '0':
            print("** El departamento introducido no tiene empleados ** ")  
        else:
            print("------- Empleados del departamento " + str(numdep) + " ------")
            print("TOTAL EMPLEADOS " + str(qresCount))
            for x in range(0,len(qres2.results)):
                print (qres2.results[x].xpath('string()'))
            
    
    
    
    
    def Insertadep(self):
        self.db = self.conexionBD()
        
        numDep = int(input("Introduce el número del departamento:"))
        nomDep = input("Introduce el nombre del departamento: ")
        locDep = input("Introduce la localidad del departamento: ")
         

        countDepartamentos= "count(/departamentos/DEP_ROW[DEPT_NO='" + str(numDep) + "'])"
        qresCountDepartamentos = self.db.query(countDepartamentos)
        
        
        if str(qresCountDepartamentos) == '0':
            insertQuery =  "update insert <DEP_ROW><DEPT_NO>" + str(numDep) + "</DEPT_NO><DNOMBRE>" + nomDep + "</DNOMBRE><LOC>" + locDep + "</LOC></DEP_ROW> into /departamentos"
            self.db.query(insertQuery)
            
            #realizamos tambien la consulta para mostrar los datos del nuevo departamento creado
            getDataQuery =  "for $dep in /departamentos/DEP_ROW where DEPT_NO='" + str(numDep) + "'return $dep"
            resGetDataQuery = self.db.query(getDataQuery)
            
            print("\nSe introducirá el nuevo departamento " + str(numDep) + "...")
            print("\nResultado de la inserción: ")
            print("\nDepartamento " + str(numDep))
            for x in range(0,len(resGetDataQuery.results)):
                print (resGetDataQuery.results[x].xpath('string()'))
        
        else:  
            print("** El departamento introducido ya existe ** ")
        
        
        
        
        
        
        
    def Borradep(self):
        self.db = self.conexionBD()
        
        numDep = int(input("Introduce el número del departamento que deseas eliminar:"))
        
        countDepartamentos= "count(/departamentos/DEP_ROW[DEPT_NO='" + str(numDep) + "'])"
        qresCountDepartamentos = self.db.query(countDepartamentos)
        
        if str(qresCountDepartamentos) == '0':
            print("** No existe el departamento introducido ** ")
        
        else:  
            xqy2 =  "update delete /departamentos/DEP_ROW[DEPT_NO='" + str(numDep) + "']"
            self.db.query(xqy2)
            print("\nEl departamento " + str(numDep) + " ha sido eliminado")
        
        
        
        
        
        
    def Modificadep(self):
        self.db = self.conexionBD()
         
        numDep = int(input("Introduce el número del departamento que deseas modificar:"))


        countDepartamentos= "count(/departamentos/DEP_ROW[DEPT_NO='" + str(numDep) + "'])"
        qresCountDepartamentos = self.db.query(countDepartamentos)
        
        if str(qresCountDepartamentos) == '0':
            print("** No existe el departamento introducido ** ")
        
        else:  
            print("\nDepartamento seleccionado: " + str(numDep))
            newNumDep = int(input("Introduce el nuevo número del departamento:"))
            newNomDep = input("Introduce el nuevo nombre del departamento: ")
            newLocDep = input("Introduce la nuevo localidad del departamento: ")
            
            #remplazar el número del departamento
            replaceNumDepQuery =  "update replace /departamentos/DEP_ROW[DEPT_NO='" + str(numDep) + "']/DEPT_NO with <DEPT_NO>" + str(newNumDep) + "</DEPT_NO>"
            self.db.query(replaceNumDepQuery)
            
            #remplazar el nombre del departamento
            replaceNomDepQuery =  "update replace /departamentos/DEP_ROW[DNOMBRE='" + str(numDep) + "']/DNOMBRE with <DNOMBRE>" + newNomDep + "</DNOMBRE>"
            self.db.query(replaceNomDepQuery)
            
            #remplazar el lugar del departamento
            replaceLocDepQuery =  "update replace /departamentos/DEP_ROW[LOC='" + str(numDep) + "']/LOC with <LOC>" + newLocDep + "</LOC>"
            self.db.query(replaceLocDepQuery)
            
            
            print("\nSe ha modificado el departamento con éxito")
            
            #realizamos tambien la consulta para mostrar los datos del nuevo departamento creado
            getDataQuery =  "for $dep in /departamentos/DEP_ROW where DEPT_NO='" + str(newNumDep) + "'return $dep"
            resGetDataQuery = self.db.query(getDataQuery)

            print("\nResultado de la actualización: ")
            print("\nDepartamento " + str(newNumDep))
            for x in range(0,len(resGetDataQuery.results)):
                print (resGetDataQuery.results[x].xpath('string()'))
            
        

        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")