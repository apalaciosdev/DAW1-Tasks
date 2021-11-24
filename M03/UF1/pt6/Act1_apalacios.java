import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {
        char a = 'a';
        char b = 'b';
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = teclado.next();
        
        System.out.println("La longitud del texto " + texto + " es de " + (texto.length() + 1)+ " posicion/es");
        
        String textoLower = texto.toLowerCase();

        if( texto.contains("a") ){
            System.out.println("La letra A aparece en el texto " + texto);
            System.out.println("La primera A aparece en la posicion " + textoLower.indexOf('a'));
            System.out.println("La última A aparece en la posicion " + textoLower.lastIndexOf('a'));
        }
        
        else{
            System.out.println("No se ha encontrado la letra A en el texto introducido:  " + texto);
        }

        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
