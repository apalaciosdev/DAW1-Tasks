from pyexistdb import db

class ExistDBTest():
    #Metode Main
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url
        
        # self.removeCollection()
        # self.generateCollection()
        # self.moveFiles()
        self.createNewFile()
        
       
    
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
    
    
    def removeCollection(self):
        self.db = self.conexionBD()
        self.db.removeCollection("Zones");
    
    
    
    
    def generateCollection(self):
        self.db = self.conexionBD()
        
        self.db.createCollection("Zones")
        
        
    def moveFiles(self):
        self.db = self.conexionBD()
        
        if(self.db.hasDocument("/db/Zones/productos.xml") ):
            print("Ya existe el fichero productos.xml")
        else:
            self.db.moveDocument("/db/ColeccionZones", "/db/Zones", "/db/ColeccionZones/productos.xml")
        
        
        # if(self.db.hasDocument("/db/Zones/zonas.xml")):
        #     print("Ya existe el fichero zonas.xml")
        # else:
        #     self.db.moveDocument("/db/ColeccionZones", "/db/Zones", "/db/ColeccionZones/zonas.xml")

        
    def createNewFile(self):
        self.db = self.conexionBD()
   
        qy2 =  "for $prod in /productos/produc where cod_zona='20'return $prod"
        qres2 = self.db.query(qy2)
   
        for x in range(0,len(qres2.results)):
            #Recogemos todos los campos de los productos con cod_zona 20. Lo hago en un bucle por si hay más de un producto
            codProd =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $codProd:= data($prod/cod_prod) return $codProd")
            denominacion =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $denominacion:= data($prod/denominacion) return $denominacion")
            precio =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $precio:= data($prod/precio) return $precio")
            stockActual =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockActual:= data($prod/stock_actual) return $stockActual")
            stockMinimo =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockMinimo:= data($prod/stock_minimo) return $stockMinimo")

            stock =  int(str(stockActual)) - int(str(stockMinimo))
            
            print(stock)
            
            #info de zonas
            nombreZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $nombre:= data($zona/nombre) return $nombre")
            directorZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $director:= data($zona/director) return $director")
            
            # print(directorZona)
            
            
            # print (qres2.results[x].xpath('string()'))
        
        
        
        
        
        
        
        
       # ESTOOOOOO insertQuery =  "update insert <DEP_ROW><DEPT_NO>" + str(numDep) + "</DEPT_NO><DNOMBRE>" + nomDep + "</DNOMBRE><LOC>" + locDep + "</LOC></DEP_ROW> into /departamentos"
        
        # hola = '<jajajaja> \n' + crack + ' \n </jajajaja>'
        # # print(hola)
        
        # self.db.load(hola, "/db/Zones/jajajaja.xml")
        
        
      
            
        

        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")