from pyexistdb import db
from tabulate import tabulate

class ExistDBTest():
    #Metode Main
    def __init__(self,user,passw,url):
        self.user=user
        self.passw=passw
        self.url=url
        
        
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
               
                break;
                
            elif choice == 4:
                nacionalidadPeli = input("Introduce la nacionalidad de las peliculas: ")
                self.showReport(nacionalidadPeli)
                break;
   
            else:
                print("\n=====================================================")
                print("ERROR, opción seleccionada no válida. Prueba de nuevo")
                print("=====================================================\n")
            
   
    
    def conexionBD(self):
        return db.ExistDB(server_url=self.url,username=self.user,password=self.passw)
    
   
            
   
    
    
    
    
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
        
        
        
        
        
        
        
        
    def showReport (self, nacionalidadPeli):
        self.db = self.conexionBD()

        #Recogemos la data
        #nota: en algunos splits, el carácter a tener en cuenta es '/' por si hay valores (como el titulo) que contengan espacio
        anyo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionalidadPeli) + "' let $anyo:= data($peli/anyo) return $anyo")).split()
        titulo = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionalidadPeli) + "' let $titulo:= data($peli/titulo) return concat($titulo , '/')")).split('/')
        nacionalidad = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionalidadPeli) + "' let $nacionalidad:= data($peli/nacionalidad) return concat($nacionalidad , '/')")).split('/')
        countPelis = str(self.db.query("count(doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula[nacionalidad='" + str(nacionalidadPeli) + "'])"))
           
        taquilla = str(self.db.query("for $peli in doc('/db/APalacios/pelicula.xml')/Pelicules/Pelicula where nacionalidad='" + str(nacionalidadPeli) + "' let $taquilla:= data($peli/taquilla) return $taquilla")).split()
        intTaquilla = [int(float(i)) for i in taquilla] #Convierto el array de taquilla a int para calcular posteriormente
        
        table = [['Año', 'Titulo', 'Nacionalidad']]
        table2 = [["Recaudación"], [sum(intTaquilla)]]
       
        for x in range(0, int(countPelis)):
            append = [anyo[x], titulo[x], nacionalidad[x]]
            table.append(append)
       
        
        print(tabulate(table, headers='firstrow', tablefmt='fancy_grid'))
        print(tabulate(table2, headers='firstrow', tablefmt='fancy_grid'))
           

  
        
        
       
   
        
  
     
        
        
        
      
    
        
y=ExistDBTest("admin","admin","http://localhost:8080/exist")