from pymongo import MongoClient
import json
from tabulate import tabulate


conn = MongoClient("mongodb://localhost:27017")
db = conn.pt5_apalacios
productosCollection = db.productos
zonasCollection = db.zonas



def menu():
  while True:  # Mini menú para escoger que función hacer
    print(" 1.- Subir ficheros a MongoDB\n",
      "2.- Crear fichero zones20.json\n"
    )
    
    choice = int(input("\nSelecciona una opción [1 o 2]: "))

    if choice == 1:
      subirFicheros()
      break

    elif choice == 2:
      generarDocumento()
      break

    else:
        print("\n=====================================================")
        print("ERROR, opción seleccionada no válida. Prueba de nuevo")
        print("=====================================================\n")



def subirFicheros():
  # productos.json
  f=open('productos.json')
  productosJSON=json.loads(f.read())
  f.close()
  
  for i in productosJSON['productos']['produc']:
    prodExists = productosCollection.count_documents({ "cod_prod": i['cod_prod'] }) > 0  #Comprobamos si el producto existe o no
    if(prodExists):
      print("ERROR, el producto con el código " + i['cod_prod'] + " ya existe.")
    
    else:
      productosCollection.insert_one(i)
      print("\nProducto nuevo con código " + i['cod_prod'] + " insertado con éxito")
    
  
  
  # zonas.json
  f=open('zonas.json')
  zonasJSON=json.loads(f.read())
  f.close()
  
  
  for i in zonasJSON['zonas']['zona']:
    zonaExists = zonasCollection.count_documents({ "cod_zona": i['cod_zona'] }) > 0  #Comprobamos si la zona existe o no
    if(zonaExists):
      print("ERROR, la zona con el código " + i['cod_zona'] + " ya existe.")
    
    else:
      print("\nZona nueva con código " + i['cod_zona'] + " insertada con éxito")
      zonasCollection.insert_one(i)

    



def generarDocumento():
  contador = 0  
  arrayObjetos = []
  director = ''
  nombreZona = ''
  
  for x in zonasCollection.find({"cod_zona": "20"},{'_id': False}): # recogemos los dos parámetros de zonas y los guardamos
    director = x['director']
    nombreZona = x['nombre']
    
  
  for x in productosCollection.find({"cod_zona": "20"},{'_id': False}):
    contador = contador +1
    stockTotal = int(x['stock_actual']) - int(x['stock_minimo'])
   
    arrayObjetos.append( # Creamos el objeto del producto
      {
        "cod_prod": x['cod_prod'],
        "denominacion": x['denominacion'],
        "precio": x['precio'],
        "nombre_zona": nombreZona,
        "director": director,
        "stock": stockTotal
      }
    )
 
    
  if(contador == 0):
    print("No existe un producto con código 20")
    
  else:
    productos = {"productos" :{
      "produc": arrayObjetos
    }}
    
    
    with open('zones20.json', 'w') as file:
      json.dump(productos, file, indent=4)

    print("Fichero zones20.json generado con éxito")



menu()



