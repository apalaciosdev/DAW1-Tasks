from pymongo import MongoClient
import json
from tabulate import tabulate


conn = MongoClient("mongodb://localhost:27017")
db = conn.pt5_apalacios
productosCollection = db.productos
zonasCollection = db.zonas


jugador = []
equipos = []


class Equipo():
  def __init__(self, nombre, ciudad, entrenador, jugadores):
    self.nombre = nombre
    self.ciudad = ciudad
    self.entrenador = entrenador
    self.jugadores = jugadores
        
    

class Jugador():
  def __init__(self, posicion, nombre, nacionalidad):
    self.posicion = posicion
    self.nombre = nombre
    self.nacionalidad = nacionalidad

    

class Jugadores():
  def __init__(self, jugador):
    self.jugador = jugador



class Equipos():
  def __init__(self, equipo):
    self.equipo = equipo

  
class Total():
  def __init__(self, total):
    self.equipos_de_futbol = total




def menu():
  while True:  # Mini menú para escoger que función hacer
    print(" 1.- Subir ficheros a MongoDB\n",
      "2.- Crear fichero zones20.json\n"
    )
    
    choice = int(input("\nSelecciona una opción [1 o 2]: "))

    if choice == 1:
      crearObjetos()
      break

    elif choice == 2:
      insertarEquipo()
      break

    else:
        print("\n=====================================================")
        print("ERROR, opción seleccionada no válida. Prueba de nuevo")
        print("=====================================================\n")



def crearObjetos():
    
  jug1 = Jugador("delantero", "david villa", "españa")
  jug2 = Jugador("delantero", "david villa", "españa")
  jugador.append(jug1.__dict__)
  jugador.append(jug2.__dict__)
  
  total = Jugadores(jugador)
  
  
  equipito1 = Equipo("sporting", "gijon", "ernesto", total.__dict__)
  equipos.append(equipito1.__dict__)
  jugador.clear()
 
  
  
  
  
  
  jug1 = Jugador("delantero", "messi", "españa")
  jug2 = Jugador("delantero", "messi", "españa")
  jugador.append(jug1.__dict__)
  jugador.append(jug2.__dict__)
  
  total = Jugadores(jugador)
  
  
  equipito2 = Equipo("barcelona", "barcelona", "pepe", total.__dict__)
  equipos.append(equipito2.__dict__)
  equipazos = Total(Equipos(equipos).__dict__)
  
  

  
  json1 = json.dumps(equipazos.__dict__, indent=2)
  print(json1)
  
  
  
  
  
  
  
def insertarEquipo():
  pass
  
menu()



