#install this library first  ->  pip install tabulate  or install it in eclipse

from pyexistdb import db
from tabulate import tabulate

class ExistDBTest():
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url

        self.showTable()
        
        
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
        
        
    def showTable(self):
        self.db = self.conexionBD()
   
        
        countDeps = self.db.query("count(/deps/departamento)")
        numero = str(self.db.query("for $numero in /deps/departamento/numero return $numero")).split() 
        nombre = str(self.db.query("for $nombre in /deps/departamento/nombre return $nombre")).split()
        localidad = str(self.db.query("for $localidad in /deps/departamento/localidad return $localidad")).split()
           
        table = [['Numero', 'Nombre', 'Localidad']]
        table2 = [["Total dpt"], [countDeps]]
        
        
        for x in range(0, int(str(countDeps))):
            append = [numero[x], nombre[x], localidad[x]]
            table.append(append)
        
        print(tabulate(table, headers='firstrow', tablefmt='fancy_grid'))
        print(tabulate(table2, headers='firstrow', tablefmt='fancy_grid'))
        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")