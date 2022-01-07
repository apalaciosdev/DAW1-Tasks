import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.lang.Math;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Act6_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);//Creamos un objeto de la clase //Scanner para leer por teclado
        int contador = 0;
        String frase = "";
        String palabraParaBuscar = "temps";
        boolean nuevaVuelta = false;

        do {
            contador = 0; //reiniciamos el contador por si el bucle se vuelve a repetir
            
            if(nuevaVuelta == false){
                System.out.println("Introduce una frase: ");
                frase = teclado.nextLine().toLowerCase();
            } 
            else{
                System.out.println("La frase debe de tener, al menos, 3 veces la palabra 'temps'. Introduce una nueva frase:  ");
                frase = teclado.nextLine().toLowerCase();
            }
    

            StringTokenizer tok = new StringTokenizer(frase);
    
            while(tok.hasMoreTokens()){
                if(tok.nextElement().equals(palabraParaBuscar)){
                    contador++;
                }
            }

            nuevaVuelta = true;
        } while (contador < 3);
        
        System.out.println("La frase " + frase + " contine " + contador + " veces la palabra " + palabraParaBuscar);


    
        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }}
