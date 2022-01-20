import java.util.*;
import java.lang.*;


public class Act3_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);   


        /*Posiciones del tablero

           H 1 2 3 4 5 6 7 8 9 10
        V
        1    o # o # o # o # o #
        2    # o # o # o # o # o
        3    o # o # o # o # o #
        4    # o # o # o # o # o
        5    o # o # o # o # o #
        6    # o # o # o # o # o
        7    o # o # o # o # o #
        8    # o # o # o # o # o
        9    o # o # o # o # o #
        10   # o # o # o # o # o
        
        */

        
        char [][] tablero = new char [10][10]; //vertical[i] - horizonal[j]

        //Impresión inicial del tablero
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero.length; j++) {
                
                if(i%2 != 0 && j%2 == 0 || i%2 == 0 && j%2 != 0){
                    tablero[i][j] = '#';
                }

                else{
                    tablero[i][j] = 'o';
                }
                System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.println("\n");




        //FICHAS BLANCAS
        System.out.println("\n----------------------------------------");
        System.out.println("Introduce la cantidad de fichas blancas: ");
        System.out.println("----------------------------------------");
        int fichasBlancas = teclado.nextInt();
        
        while(fichasBlancas < 1 || fichasBlancas > 20) {
            System.out.println("\n----------------------------------------------------------");
            System.out.println("Cantidad no válida. Introduce la cantidad de fichas blancas: ");
            System.out.println("----------------------------------------------------------");
            fichasBlancas = teclado.nextInt();
        }

        for (int i = 0; i < fichasBlancas; i++) {
            System.out.println("\nIntroduce la posición vertical de ficha " + (i+1) + ": ");
            int fichaBlancaVertical = teclado.nextInt() - 1;
            
            System.out.println("Introduce su posición horizontal de ficha " + (i+1) + ": ");
            int fichaBlancaHorizontal = teclado.nextInt() - 1;
            
            tablero[fichaBlancaVertical][fichaBlancaHorizontal] = 'B';
        }
        
        
        
        //FICHAS NEGRAS
        System.out.println("\n---------------------------------------");
        System.out.println("Introduce la cantidad de fichas negras: ");
        System.out.println("---------------------------------------");
        int fichasNegras = teclado.nextInt(); //entre 1 y 20
        
        while(fichasNegras < 1 || fichasNegras > 20) {
            System.out.println("\n----------------------------------------------------------");
            System.out.println("Cantidad no válida. Introduce la cantidad de fichas negras: ");
            System.out.println("----------------------------------------------------------");
            fichasNegras = teclado.nextInt();
        }
        
        for (int i = 0; i < fichasNegras; i++) {
            System.out.println("\nIntroduce la posición vertical de ficha " + (i+1) + ": ");
            int fichaNegraVertical = teclado.nextInt() - 1;
            
            System.out.println("Introduce su posición horizontal de ficha " + (i+1) + ": ");
            int fichaNegraHorizontal = teclado.nextInt() - 1;

            tablero[fichaNegraVertical][fichaNegraHorizontal] = 'N';
        }


        
        //Impresión final del tablero
        System.out.println("\n\n\n--RESULTADO FINAL--");
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }
      

        System.out.println("\n\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}

            