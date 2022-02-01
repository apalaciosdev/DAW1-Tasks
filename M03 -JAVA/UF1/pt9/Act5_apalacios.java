import java.util.*;
import java.lang.*;

public class Act5_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int tabla[][] = new int[10][5]; // horizontal[filas] - vertical[columnas]

        int sumador = 0;
        int total = 0;

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


        System.out.println("\n_______________________________________________");
        int sumaFila = 0;

        for (int i = 0; i < tabla[1].length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                sumaFila += tabla[j][i];
            }
            System.out.print(sumaFila + "  |  ");
            sumaFila = 0;
        }

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
