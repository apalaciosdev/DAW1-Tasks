import java.util.*;
import java.io.File;

public class ActFicheros_apalacios {
  public static Scanner sc = new Scanner(System.in, "UTF-8");

  public static void main(String[] args) throws Exception {
    boolean bucle = true;
    int num = 0;
  
    String filePath = "C:/Users/6002215/Downloads/Test";
    File carpeta = new File(filePath);
    File[] lista = carpeta.listFiles();
  

    while (bucle) {
      System.out.println("\n\n\n\n---------------- MENÚ ----------------");
      System.out.println("1- Borrar solo ficheros");
      System.out.println("2- Borrar solo carpetas");
      System.out.println("3- Borrar todos");
      System.out.println("4- Salir");
      System.out.println("");
      System.out.println("Introduce número: ");
      num = sc.nextInt();

      if(num == 1){
        eliminarFicheros(lista);
        countFilesAndDirectories(lista);
      }
      
      else if(num == 2){
        eliminarCarpetas(lista);
        countFilesAndDirectories(lista);
      }
      
      else if(num == 3){
        eliminarCarpetas(lista);
        countFilesAndDirectories(lista);
      }
    
      else if (num == 4) {
        bucle = false;
      }

      else {
        System.out.println("OPCIÓN NO VÁLIDA, INTENTALO DE NUEVO");
      }
    }

    System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
    System.out.println("----------------- Aaron Palacios -----------------");
  }




  public static void eliminarFicheros(File[] lista){
    for (int i = 0; i < lista.length; i++) {
      if (lista[i].isFile()) {
        lista[i].delete();
      }
    }
  }


  public static void eliminarCarpetas(File[] lista){
    for (int i = 0; i < lista.length; i++) {
      if (lista[i].isDirectory()) {
        for (String temp : lista[i].list()) {
          File fileDelete = new File(lista[i], temp);
          //recursive delete
          fileDelete.delete();
        }
        lista[i].delete();


      }
    }
  }


  public static void countFilesAndDirectories(File[] lista) {

    int filesCount = 0;
    int directoriesCount = 0;

    for (int i = 0; i < lista.length; i++) {
      if (lista[i].isFile()) {
        filesCount++;
      }

      else if (lista[i].isDirectory()) {
        directoriesCount++;
      }

    }
    System.out.println("\n Hay " + filesCount + " archivos");
    System.out.println("\n Hay " + directoriesCount + " carpetas");

  }
}
