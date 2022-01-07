import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act3_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        System.out.println("Introduce un texto:");
        String texto = teclado.next().toLowerCase();
        
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == 'a'){
                countA ++;
            }

            else if(texto.charAt(i) == 'e'){
                countE ++;
            }

            else if(texto.charAt(i) == 'i'){
                countI ++;
            }

            else if(texto.charAt(i) == 'o'){
                countO ++;
            }

            else if(texto.charAt(i) == 'u'){
                countU ++;
            } 
        }

        System.out.println("\nLa vocal A se repite " + countA + " vez/es");
        System.out.println("La vocal E se repite " + countE + " vez/es");
        System.out.println("La vocal I se repite " + countI + " vez/es");
        System.out.println("La vocal O se repite " + countO + " vez/es");
        System.out.println("La vocal U se repite " + countU + " vez/es");


        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
