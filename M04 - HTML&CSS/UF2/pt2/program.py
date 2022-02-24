from pyexistdb import db

class ExistDBTest():
    #Metodo Main
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url
        
        self.generateCollection()
        self.moveFiles()
        self.createNewFile()
        
       
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
    
    
    def generateCollection(self):
        self.db = self.conexionBD()
        
        if(self.db.hasCollection("/db/Zones")):
            print("\nYa existe la colección Zones")
        else:
            self.db.createCollection("Zones", "overwrite")
        
        
        
    def moveFiles(self):
        self.db = self.conexionBD()
        
        
        if(self.db.hasDocument("/db/ColeccionZones/productos.xml") == False):
            print("\nNo existe el fichero productos.xml en la carpeta inicial")
        else:
            if(self.db.hasDocument("/db/Zones/productos.xml") ):
                print("\nYa existe el fichero productos.xml en la carpeta destino")
            else:
                self.db.moveDocument("/db/ColeccionZones", "/db/Zones", "/db/ColeccionZones/productos.xml")
        
        
        if(self.db.hasDocument("/db/ColeccionZones/zonas.xml") == False):
            print("\nNo existe el fichero zonas.xml en la carpeta inicial")
        else:
            if(self.db.hasDocument("/db/Zones/zonas.xml") ):
                print("\nYa existe el fichero zonas.xml en la carpeta destino")
            else:
                self.db.moveDocument("/db/ColeccionZones", "/db/Zones", "/db/ColeccionZones/zonas.xml")
        
       
        
    def createNewFile(self):
        self.db = self.conexionBD()
   
        # Creamos el fichero
        mainTag = '<zones20> \n </zones20>'
        self.db.load(mainTag, "/db/Zones/zones20.xml")
        
        # Comprobamos cuantos productos tienen asignada la zona 20
        countProductos = self.db.query("count(/productos/produc[cod_zona=20])")
    
    
        for x in range(0, int(str(countProductos))):
            # Recogemos todos los campos de los productos con cod_zona 20.
            # Dado que pueden haber más de un producto, almaceno estas querys haciendo un split, ya que si llegan varios valores, el split los separa y los convierte en array
            # ej split(): pasa de esto sin split "BARCELONA TARRAGONA" a esto con split ["BARCELONA", "TARRAGONA"]
        
            codProd = str(self.db.query("for $prod in /productos/produc where cod_zona='20' let $codProd:= data($prod/cod_prod) return $codProd")).split() 
            denominacion = str(self.db.query("for $prod in /productos/produc where cod_zona='20' let $denominacion:= data($prod/denominacion) return $denominacion")).split()
            precio = str(self.db.query("for $prod in /productos/produc where cod_zona='20' let $precio:= data($prod/precio) return $precio")).split()
            stockActual = str(self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockActual:= data($prod/stock_actual) return $stockActual")).split()
            stockMinimo = str(self.db.query("for $prod in /productos/produc where cod_zona='20' let $stockMinimo:= data($prod/stock_minimo) return $stockMinimo")).split()
            stock =  int(stockActual[x]) - int(stockMinimo[x])
               
            # Info de la zona
            nombreZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $nombre:= data($zona/nombre) return $nombre")
            directorZona =  self.db.query("for $zona in /zonas/zona where cod_zona='20' let $director:= data($zona/director) return $director")
 
            # Realizamos la inserción en el documento
            insertData =  "update insert <producto><cod_prod>" + str(codProd[x]) + "</cod_prod><denominacion>" + str(denominacion[x]) + "</denominacion><precio>" + str(precio[x]) + "</precio><nombre_zona>" + str(nombreZona) + "</nombre_zona><director>" + str(directorZona) + "</director><stock>" + str(stock) + "</stock></producto> into /zones20"
            self.db.query(insertData)
            
            
        # Mostramos el resultado
        print("\n\n\n##############################")
        print("Inserción realizada con éxito!")
        print("##############################\n")
        
        print("Resultado:")
        resultadoQuery = self.db.query("for $prod in /productos/produc where cod_zona='20' return $prod")
        for x in range(0,len(resultadoQuery.results)):
                print("\nProducto " + str(x+1))
                print (resultadoQuery.results[x].xpath('string()'))
            
        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")