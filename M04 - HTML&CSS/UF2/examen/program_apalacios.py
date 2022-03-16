from pyexistdb import db
from tabulate import tabulate

# IMPORTANTE: IR A LA ÚLTIMA LÍNEA Y MODIFICAR LOS PARÁMETROS PERTINENTES DE EXISTDB

# nota: Adjunto el fichero pelicula.xml sin carácteres omitidos, ya que si lo ejecutamos con estos problemas, el programa da error de codificación
#       Los archivos xml están en un directorio llamado APalacios, tal como se pedía en el examen

class ExistDBTest():
    #Metode Main
    def __init__(self, user, passw, url, userDestino, passwDestino, urlDestino):
        self.user=user
        self.passw=passw
        self.url=url
        self.userDestino=userDestino
        self.passwDestino=passwDestino
        self.urlDestino=urlDestino
        
        
        while(True): #Mini menú para escoger que función hacer
            print(" 1.- Insertar Colección\n",
                  "2.- Eliminar una película\n",
                  "3.- Hacer migración de archivos\n",
                  "4.- Mostrar información de las películas categorizadas por nacionalidad")
            choice = int(input("\nSelecciona una opción [1-4]: "))
            
            if choice == 1:
                self.autoInsertNewColection()
                break;
            
            elif choice == 2:
                self.deletePelicula() # Tener en cuenta que el archivo pelicula.xml no contiene la ñ y puede dar errores
                break;
                
            elif choice == 3:
                self.migrateFilm()
               
                break;
                
            elif choice == 4:
                nacionality = input("Introduce la nacionalidad de las peliculas (No introduzcas nada si quieres ver todas las peliculas): ")
                self.showReport(nacionality)
                break;
   
            else:
                print("\n=====================================================")
                print("ERROR, opción seleccionada no válida. Prueba de nuevo")
                print("=====================================================\n")
            
   
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
    def conexionBDDestino(self):
        return db.ExistDB(server_url=self.urlDestino,username=self.userDestino,password=self.passwDestino)
    
   
            
   
    
    
    
    
    def autoInsertNewColection(self):
        self.db = self.conexionBD()
        
        # Creamos la colección
        if(self.db.hasCollection("/db/Genere")):
            print("\nYa existe la colección Zones")
        else:
            self.db.createCollection("Genere")
        
        
        # Creamos el fichero
        mainTag = '<generos> \n </generos>'
        self.db.load(mainTag, "/db/Genere/generos.xml")
        
        
        # Recogemos todos los códigos de género
        genero = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula let $genero:= data($peli/genero) return $genero")).split() 
        countPelis = str(self.db.query("count(doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula)"))
        
        checked = []
        checkedNames = []
        
        for x in range(0,int(countPelis)):
            
            if(genero[x] in checked): # Comprobamos si el genero ya se ha utilizado
                pass
            
            else: # Si el genero no se ha utilizado...
                nuevoGenero = input("Introduce el nombre del género: " )

                while(nuevoGenero in checkedNames): # Comprobamos que el nombre no se haya introducido
                    print("El nombre introducido existe. Prueba otro")
                    nuevoGenero = input("Introduce el nombre del género: " )
                    
                    
                insertData =  "update insert <genero><idGenere>" + str(genero[x]) + "</idGenere><nom>" + str(nuevoGenero) + "</nom></genero> into /generos"
                self.db.query(insertData)
                
                # Añadimos los últimos géneros usados para garantizar que no se usen
                checked.append(genero[x])
                checkedNames.append(nuevoGenero)
            
    
      
        
    
            
            
         

        
    
    def deletePelicula(self):
        self.db = self.conexionBD()
        
        # Imprimimos las peliculas para que el usuario pueda escoger
        pelis = self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula return $peli")
        for x in range(0,len(pelis.results)):
            print (pelis.results[x].xpath('string()'))
  
  
        codPelicula = int(input("Introduce el código de la pelicula que deseas eliminar: "))
       
  
        countPelis = self.db.query("count(doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula[codpelicula='" + str(codPelicula) + "'])")
        if str(countPelis) == '0':
            print("** No existe la pelicula introducida ** ")
        
        else:  
            self.db.query("update delete doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula[codpelicula='" + str(codPelicula) + "']")
            print("\nLa pelicula con codigo " + str(codPelicula) + " ha sido eliminada")
                
            
    
      
        
    
            
            
         

        
    
    def migrateFilm (self):
        localdb = self.conexionBD() # Nos conectamos a la DB origen de la migración
  
        archivosPorMigrar = ["actores", "directores", "ganapremio", "participa", "pelicula", "premio"]
        
        for i in range(0, len(archivosPorMigrar)):
            localdb = self.conexionBD()
            xqy = "for $peli in doc('/db/APalacios/" + str(archivosPorMigrar[i]) + ".xml') return $peli"
            qres = localdb.executeQuery(xqy)
            if str(qres) == "":
                print("** LA CONSULTA NO DEVUELVE NADA **")
            
            else:
                print("\n\nCreando fichero " + archivosPorMigrar[i] + ".xml en local...")
                f = open(str(archivosPorMigrar[i]) + ".xml", "w")
                f.write("<?xml version='1.0' encoding='ISO-8859-1'?> \n")
            
                print("Añadiendo datos al fichero " + archivosPorMigrar[i] + ".xml ...")
                hits = localdb.getHits(qres)
                for x in range(hits):
                    f.write(str(localdb.retrieve(qres, x)) + "\n")
                f.close()
            
            
            localdb = self.conexionBDDestino() # Nos conectamos a la DB destino de la migración
            
            print("Subiendo fichero " + archivosPorMigrar[i] + ".xml a la DB local...")
            f = open(archivosPorMigrar[i] + ".xml")
            localdb.load(f.read(), "ficherosMigracion/" + archivosPorMigrar[i] + ".xml")
            f.close()

            print("\n---Fichero " + archivosPorMigrar[i] + ".xml subido con éxito---\n")
        
        
        
        
        
        
        
        
    def showReport (self, nacionality):
        self.db = self.conexionBD()

        #Recogemos la data
        #nota: en algunos splits, el carácter a tener en cuenta es '/' por si hay valores (como el titulo) que contengan espacio
        # print(self.db.getDocument('/db/APalacios/pelicula.xml'))
        countPelis = 0
        table = [['Año', 'Titulo', 'Nacionalidad']]
        
        if(nacionality == ""):
            anyo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula let $anyo:= data($peli/anyo) return $anyo")).split()
            titulo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula let $titulo:= data($peli/titulo) return concat($titulo , '/')")).split('/')
            nacionalidad = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula let $nacionalidad:= data($peli/nacionalidad) return concat($nacionalidad , '/')")).split('/')
            countPelis = str(self.db.query("count(doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula)"))
            
            taquilla = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula let $taquilla:= data($peli/taquilla) return $taquilla")).split()
            intTaquilla = [int(float(i)) for i in taquilla] #Convierto el array de taquilla a int para calcular posteriormente
        
        
        else:
            anyo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionality) + "' let $anyo:= data($peli/anyo) return $anyo")).split()
            titulo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionality) + "' let $titulo:= data($peli/titulo) return concat($titulo , '/')")).split('/')
            nacionalidad = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionality) + "' let $nacionalidad:= data($peli/nacionalidad) return concat($nacionalidad , '/')")).split('/')
            countPelis = str(self.db.query("count(doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula[nacionalidad='" + str(nacionality) + "'])"))
            
            taquilla = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionality) + "' let $taquilla:= data($peli/taquilla) return $taquilla")).split()
            intTaquilla = [int(float(i)) for i in taquilla] #Convierto el array de taquilla a int para calcular posteriormente
        
        
        
        for x in range(0, int(countPelis)):
            append = [anyo[x], titulo[x], nacionalidad[x]]
            table.append(append)
        
        table2 = [["Recaudación"], [sum(intTaquilla)]]
       
       
        print(tabulate(table, headers='firstrow', tablefmt='fancy_grid'))
        print(tabulate(table2, headers='firstrow', tablefmt='fancy_grid'))
           



  
        
        
#             | ----------------SERVER ABRAHAM------------- | | ----------------SERVER DESTINO--------------- |     
    
#               user    pass           server Abraham           user     pass       Server destino migración
y=ExistDBTest("admin", "admin", "http://localhost:8080/exist", "admin", "admin", "http://localhost:8080/exist")