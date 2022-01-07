import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.lang.Math;

public class Act4_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[^@]+@[^@]+\\.[a-zA-Z]{2,}");


        System.out.println("Introduce un email:");
        String email = teclado.next();

        Matcher matcher = pattern.matcher(email);
        
        while(matcher.find() == false){
            System.out.println("\nEmail no válido. Introduce un email que lo sea:");
            email = teclado.next();
            matcher = pattern.matcher(email);
            
        }

        if(email.endsWith("gmail.com") || email.endsWith("xtec.cat")){
            System.out.println("Dominio válido. Email correcto.");
        }
        
        else{
            System.out.println("\nDominio no válido. Solo se aceptan '@gmail.com' o '@xtec.cat'");
        }
  

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
