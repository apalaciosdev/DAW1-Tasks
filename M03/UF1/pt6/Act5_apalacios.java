import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.lang.Math;

public class Act5_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un texto :");
        String texto = teclado.nextLine();

        int lengthTexto = texto.length();
        
        System.out.println("El mensaje contiene " + lengthTexto + " palabras");
        String mayus = texto.toUpperCase();
        
        String digitos = mayus.replace('0','#').replace('1', '#').replace('2', '#').replace('3', '#').replace('4', '#').replace('5', '#').replace('6', '#').replace('7', '#').replace('8', '#').replace('9', '#');
        System.out.println(digitos);
        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
