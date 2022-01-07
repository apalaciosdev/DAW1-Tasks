import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act2_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = teclado.next();
        

        if(Character.isDigit(texto.charAt(2))){
            System.out.println("\nEl tercer carácter del texto es: " + (texto.charAt(2)) + " y SI es un dígito");
        }
        else{
            System.out.println("El tercer carácter del texto es: " + (texto.charAt(2)) + " y NO es un dígito");
        }


        if(texto.endsWith("nt")){
            System.out.println("El texto " + texto + " SÍ acaba en 'nt'");
        }
        else{
            System.out.println("El texto " + texto + " NO acaba en 'nt'");
        }
        
        System.out.println(texto.substring(3, 10));
   
        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
