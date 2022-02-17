from pyexistdb import db

class ExistDBTest():
    #Metode Main
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url
        dep = input("Teclea departamento:")
        numdep=int(dep) # convertimos a numérico
        
        #self.visualizar(dep)
        self.verEmple(numdep)
    '''
    Genera la conexión a la BBDD
    '''
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    '''
    Debe invocar al método visualizar(tipo), que recibe el tipo y 
    visualiza los empleados de los departamentos del tipo indicado. 
    Si no hay empleados o si el tipo no existe se debe visualizar un mensaje indicándolo. 
    Utiliza el documento universidad.xml​
    '''
    def visualizar (self,tipo):
        self.db = self.conexionBD()
        xqy1 = "count(/departamentos/DEP_ROW)"
        qres = self.db.query(xqy1)
        if str(qres) == '0':
            print("** LA CONSULTA NO DEVUELVE NADA, no hay dep de ese tipo. ** ")  
        else:
            print("------- Consulta empleados por tipo de departamento. ------")
            print(" HAY :"+ str(qres)+" empleados de ese tipo de departamento.")
            print("** LOS EMPLEADOS DE DEPARTAMENTOS DEL TIPO: " + tipo + " SON: ")
            
            
            
            
    def verEmple(self, numdep):
        self.db = self.conexionBD()
        
        countEmpleados = "count(/empleados/EMP_ROW[DEPT_NO='" + str(numdep) + "'])"
        
        xqy1 = "count(/empleados/EMP_ROW)"
        xqy2 =  "for $dep in /empleados/EMP_ROW where DEPT_NO='" + str(numdep) + "'return $dep"
       
        qres1 = self.db.query(countEmpleados)
        qres2 = self.db.query(xqy2)
        
        if str(qres1) == '0':
            print("** El departamento introducido no tiene empleados ** ")  
        else:
            print("------- Empleados del departamento " + str(numdep) + " ------")
            print("TOTAL EMPLEADOS " + str(qres1))
            for x in range(0,len(qres2.results)):
                print (qres2.results[x].xpath('string()'))
            
        
        
    
        
        
   
               
            
        
        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")