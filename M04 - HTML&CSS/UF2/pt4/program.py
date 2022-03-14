from pymongo import MongoClient
import json
from tabulate import tabulate

client = MongoClient("mongodb://localhost:27017")
db = client.deps


def menu():
  while True:  # Mini menú para escoger que función hacer
    print(
      "1.- Ver empleados\n",
      "2.- Eliminar una película\n",
      "3.- Hacer migración de archivos\n",
      "4.- Mostrar información de las películas categorizadas por nacionalidad",
    )
    
    choice = int(input("\nSelecciona una opción [1-4]: "))

    if choice == 1:
      verEmple()
      break

    elif choice == 2:
      # deletePelicula()
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
  dep = input("Teclea departamento: ")
  
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

menu()