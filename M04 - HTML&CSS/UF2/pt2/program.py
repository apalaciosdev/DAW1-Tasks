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
   
        #primero creamos el fichero
        mainTag = '<zones20> \n </zones20>'

        self.db.load(mainTag, "/db/Zones/zones20.xml")
        
        
        qy2 =  "for $prod in /productos/produc where cod_zona='20'return $prod"
        qres2 = self.db.query(qy2)
    
        for x in range(0, 2):
            #Recogemos todos los campos de los productos con cod_zona 20. Lo hago en un bucle por si hay más de un producto
            codProdQuery = self.db.query("for $prod in /productos/produc where cod_zona='20' let $codProd:= data($prod/cod_prod) return $codProd")
            codProd = str(codProdQuery).split()
            
            denominacionQuery =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $denominacion:= data($prod/denominacion) return $denominacion")
            denominacion = str(denominacionQuery).split()
            
            precioQuery =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $precio:= data($prod/precio) return $precio")
            precio = str(precioQuery).split()
            
            stockActualQuery =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockActual:= data($prod/stock_actual) return $stockActual")
            stockActual = str(stockActualQuery).split()
            
            stockMinimoQuery =  self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockMinimo:= data($prod/stock_minimo) return $stockMinimo")
            stockMinimo = str(stockMinimoQuery).split()
            
            stock =  int(stockActual[x]) - int(stockMinimo[x])
            
           
            
            #info de zonas
            nombreZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $nombre:= data($zona/nombre) return $nombre")
            
            directorZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $director:= data($zona/director) return $director")
 
            
            insertData =  "update insert <producto><cod_prod>" + str(codProd[x]) + "</cod_prod><denominacion>" + str(denominacion[x]) + "</denominacion><precio>" + str(precio[x]) + "</precio><nombre_zona>" + str(nombreZona) + "</nombre_zona><director>" + str(directorZona) + "</director><stock>" + str(stock) + "</stock></producto> into /zones20"
            self.db.query(insertData)
           
            # print(directorZona)
            
            
            # print (qres2.results[x].xpath('string()'))
        
        
        
        
        
        
        
        
        
        
        
      
            
        

        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")