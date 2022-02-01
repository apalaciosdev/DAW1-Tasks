import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in, "UTF-8");   
        
        int tabla [][] = new int [10][2];  //vertical[i] - horizonal[j]
        

        //introducimos del 1 al 10 en la primera columna
        for (int i = 0; i < tabla.length; i++) {
            
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.println("Introduce el número:");
                int nuevoNum = teclado.nextInt();
                tabla[i][j] = nuevoNum;
              
            }
        }
       

        
        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j]);
            }
        }


        


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
