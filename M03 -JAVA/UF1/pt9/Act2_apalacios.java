import java.util.*;
import java.lang.*;


public class Act2_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);   
        
        int tabla [][] = new int [10][2];  //horizontal[i] - vertical[j]

        int sumador = 0;

        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[0].length; j++) {
                sumador++;
                tabla[i][j] = sumador;    
            }
        }

          
        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            System.out.println();
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }



        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
