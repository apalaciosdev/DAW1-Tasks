'''
Created on 3 mar. 2022

@author: agomez
'''
import json

def verEmple():
    with open("empleats.json","r") as archivo:
        for linea in archivo:
            print(linea)
    f=open('empleats.json')
    empjson=json.loads(f.read())
    f.close()
    dpt=insertData('Numero de departamento a buscar empleados')
    for i in empjson['EMPLEADOS']['EMP_ROW']:
        if i['DEPT_NO'] == dpt :
            print(i)
        
def insertDep():
    with open('departaments.json') as json_file: 
        data = json.load(json_file) 
        temp = data['departamentos']['DEP_ROW'] 
        # python object to be appended 
        y = {'dept_no':int(insertData('Departamento')), 
         "dnombre": insertData('Nombre'), 
         "loc": insertData('Localidad')
         } 
        # appending data to emp_details  
        temp.append(y) 
        
    with open('departaments.json','w') as f: 
        json.dump(data, f, indent=4) 
def modifyDep():
    numdpt=insertData("Numero de departamento a modificar")
    with open('departaments.json') as json_file: 
        data = json.load(json_file)
        
    for dpt in data['departamentos']['DEP_ROW']:
        print(dpt)
        if dpt['dept_no'] == int(numdpt) :
            nomdpt=insertData("Nuevo nombre de departamento a modificar")
            dpt['dnombre']=nomdpt
            break
    with open('departaments.json','w') as f: 
        json.dump(data, f, indent=4) 

def delDep():
    numdpt=insertData("Numero de departamento a eliminar")
    with open('departaments.json') as json_file: 
        data = json.load(json_file)
    dpt=data['departamentos']['DEP_ROW'];
    for i in range(len(dpt)):
        if dpt[i]['dept_no'] == int(numdpt):
            dpt.pop(i)
    with open('departaments.json','w') as f: 
        json.dump(data, f, indent=4) 
    

def insertData(fdato):
    # se lee un dato de tipo cadena
    dep = input("Teclea "+fdato+" :")
    return (dep) # convertimos a numerico 
      

def menu():
    print("----------- MAIN MENU -----------")
    print("1. Ver empleados")
    print("2. Insertar Departamentos")
    print("3. Eliminar Departamentos")
    print("4. Llistar Departamentos")
    print("5. Actualizar Departamentos")
    print("6. Exit")
    print("-----------------------------------")
def verDpt():
    f=open('departaments.json')
    empjson=json.loads(f.read())
    f.close()
    for i in empjson['departamentos']['DEP_ROW']:
        print(i)
while True:
    menu()
    opcion = int(input("Selecciona una opcio: "))
    if opcion == 1:
        verEmple()
    elif opcion == 2:
        insertDep()
    elif opcion == 3:
        delDep()
    elif opcion == 4:
        verDpt()
    elif opcion == 5:
        modifyDep()    
    elif opcion == 6:
        break
    else:
        print ("Introdueix un numero entre 1 i 6")    

