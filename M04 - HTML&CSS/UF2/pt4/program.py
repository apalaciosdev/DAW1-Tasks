from pymongo import MongoClient
import json
from tabulate import tabulate


conn = MongoClient("mongodb://localhost:27017")
db = conn.deps
collection = db.deps


def menu():
  while True:  # Mini menú para escoger que función hacer
    print("1.- Ver empleados\n",
      "2.- Insertar un departamento\n",
      "3.- Hacer migración de archivos\n",
      "4.- Mostrar información de las películas categorizadas por nacionalidad",
    )
    
    choice = int(input("\nSelecciona una opción [1-4]: "))

    if choice == 1:
      verEmple()
      break

    elif choice == 2:
      insertaDep()
      break

    elif choice == 3:
      # migrateFilm()
      break

    elif choice == 4:
      # showReport(nacionality)
      break

    else:
        print("\n=====================================================")
        print("ERROR, opción seleccionada no válida. Prueba de nuevo")
        print("=====================================================\n")


def verEmple():
  dep = input("Introduce el nuevo departamento: ")
  
  f=open('empleats.json')
  empjson=json.loads(f.read())
  f.close()
  
  print("\n\nEmpleados del departamento ", dep)
  
  table = [['EMP_NO', 'APELLIDO', 'OFICIO', 'DIR', 'FECHA_ALT', 'SALARIO', 'DEPT_NO']]
  
  for i in empjson['EMPLEADOS']['EMP_ROW']:
    if(i['DEPT_NO'] == dep):
      append = [i['EMP_NO'], i['APELLIDO'], i['OFICIO'], i['DIR'], i['FECHA_ALT'], i['SALARIO'], i['DEPT_NO']]
      table.append(append)

  print(tabulate(table, headers='firstrow', tablefmt='fancy_grid', showindex='always'))
  



def insertaDep():
  dep = input("Introduce el número del nuevo departamento: ")
  depName = input("Introduce el nombre del nuevo departamento: ")
  depDir = input("Introduce la dirección del nuevo departamento: ")
  checkedDeps = []
  
  f=open('empleats.json')
  empjson=json.loads(f.read())
  f.close()
  
  for i in empjson['EMPLEADOS']['EMP_ROW']:
    if(i['DEPT_NO'] in checkedDeps): # Comprobamos si el genero ya se ha utilizado
      pass
    
    else:
      checkedDeps.append(i['DEPT_NO'])
    
    
    
  if(i['DEPT_NO'] == dep):
    print("Ya existe un departamento con este código: ", dep)
  
  else:
    newEntry = {
      "name": dep,
      "eid": depName,
      "location": depDir
    }
      
    # Insert Data
    collection.insert_one(newEntry)
    
    


menu()