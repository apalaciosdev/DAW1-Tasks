from pymongo import MongoClient
import json
from tabulate import tabulate


conn = MongoClient("mongodb://localhost:27017")
db = conn.deps
collection = db.deps


def menu():
  while True:  # Mini menú para escoger que función hacer
    print(" 1.- Ver empleados del fichero JSON\n",
      "2.- Insertar un departamento de la DB\n",
      "3.- Eliminar un departamento de la DB\n",
      "4.- Actualizar un departamento de la DB",
    )
    
    choice = int(input("\nSelecciona una opción [1-4]: "))

    if choice == 1:
      verEmple()
      break

    elif choice == 2:
      Insertadep()
      break

    elif choice == 3:
      Borradep()
      break

    elif choice == 4:
      Modificadep()
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
  




def Insertadep():
  dep = input("Introduce el número del nuevo departamento: ")
  depName = input("Introduce el nombre del nuevo departamento: ")
  depDir = input("Introduce la dirección del nuevo departamento: ")
  checkedDeps = []
  
  f=open('empleats.json')
  empjson=json.loads(f.read())
  f.close()
  
  for i in empjson['EMPLEADOS']['EMP_ROW']:
    if(i['DEPT_NO'] in checkedDeps): 
      pass
    
    else:
      checkedDeps.append(i['DEPT_NO'])
    
    
  if(i['DEPT_NO'] == dep):
    print("Ya existe un departamento con este código: ", dep)
  
  else:
    newEntry = {
      "DEPT_NO": dep,
      "DNOMBRE": depName,
      "LOC": depDir
    }
      
    collection.insert_one(newEntry)
    
    print("\n¡Departamento insertado con éxito!")
    
    

  


def Borradep():
  dep = input("Introduce el número del departamento que deseas eliminar: ")
  
  depExists = collection.count_documents({ "DEPT_NO": dep }) > 0  #Comprobamos si el departamento existe o no
  
  if(depExists):
    collection.delete_many({ "DEPT_NO": dep })
    
    print("\n¡Departamento eliminado con éxito!")
  
  else:
    print("El departamento que deseas eliminar no existe")

    



def Modificadep():
  dep = input("Introduce el número del departamento que deseas modificar: ")
  
  depExists = collection.count_documents( { "DEPT_NO": dep} ) > 0  #Comprobamos si el departamento existe o no
  
  if(depExists):
    newDep = input("Introduce el nuevo número del departamento: ")
    newName = input("Introduce el nuevo nombre del departamento: ")
    newLoc = input("Introduce la nueva localización del departamento: ")
    
    collection.update_many({ "DEPT_NO": dep }, { "$set":{ "DEPT_NO": newDep,  "DNOMBRE": newName, "LOC": newLoc }})
    
    print("\n¡Departamento modificado con éxito!")
  
  else:
    print("El departamento que deseas modificar no existe")
  

menu()