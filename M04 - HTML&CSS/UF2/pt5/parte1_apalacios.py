from pymongo import MongoClient
import json
from tabulate import tabulate


conn = MongoClient("mongodb://localhost:27017")
db = conn.pt5_apalacios
productosCollection = db.productos
zonasCollection = db.zonas




for x in collectionEmple.find({"DEPT_NO": dep},{}):
  print(x, "\n") 
  contador = contador +1
  
if(contador == 0):
  print("No hay empleados en el departamento ", dep)
    



