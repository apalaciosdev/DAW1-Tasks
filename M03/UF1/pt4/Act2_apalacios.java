import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act2_apalacios {
    public static void main(String[] args) throws Exception {

        /* ------- EJERCICIO 2 ------- */ System.out.println("\n\n----- EJERCICIO 2 -----");
        
        Scanner teclado = new Scanner(System.in);
        
        Calendar calendar = Calendar.getInstance();
        int añoActualEj2 = calendar.get(Calendar.YEAR);
        int cursosRepetidosEj2 = 0;
       

        System.out.println("Introduce tu nombre:");
        String nombreEj2 = teclado.next();

        System.out.println("Introduce tu edad:");
        int edadEj2 = teclado.nextInt();

        System.out.println("¿Aprovaste la ESO? [true o false]");
        boolean esoEj2 = teclado.nextBoolean();

        System.out.println("¿Repetiste algún curso? [true o false]");
        boolean cursoEj2 = teclado.nextBoolean();
        
       
        if(cursoEj2){
            System.out.println("¿Cuántos cursos repetiste?");
            cursosRepetidosEj2 = teclado.nextInt();
        }

        int resultadoEj2 = añoActualEj2 - (edadEj2 - (16 + cursosRepetidosEj2)); 

        

        if(esoEj2){ // si tiene la eso:
            if(!cursoEj2){ // si no repitió:
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, tiene aprovada la ESO, no repitió ninguna vez y acabó en el año " + resultadoEj2);
            }

            else{ // si repitió:
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, tiene aprovada la ESO, repitió " + cursosRepetidosEj2 + " vez/es y acabó en el año " + resultadoEj2);
            }
        }


        else if(esoEj2 == false){  // si no tiene la eso:
            if(!cursoEj2){ // si no repitió:
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, no tiene aprovada la ESO y no repitió ninguna vez");
            }

            else{ // si repitió:
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, no tiene aprovada la ESO y repitió " + cursosRepetidosEj2 + " vez/es");
            }
        }


        



        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
