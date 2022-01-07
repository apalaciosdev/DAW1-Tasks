import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act4_apalacios {
    public static void main(String[] args) throws Exception {
                      
        /* ------- EJERCICIO 4 ------- */ System.out.println("\n\n----- EJERCICIO 4 -----");
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué dia de la semana deseas reservar cita?");
        String diaEj4 = teclado.next().toLowerCase();
        

        while(diaEj4.equals("sabado") || diaEj4.equals("domingo") ){ //bucle por si se introduce fines de semana se puede cambiar el dia
            System.out.println("No damos servicio los fines de semana. Porfavor, introduce otro dia:");
            diaEj4 = teclado.next().toLowerCase();
        }

        
        System.out.println("¿Qué turno prefieres? [mañana o tarde]");
        String turnoEj4 = teclado.next().toLowerCase();


        // entra si la cita es el (martes o el jueves por la tarde) o (fines de semana)
        while((((diaEj4.equals("martes") || diaEj4.equals("jueves")) && turnoEj4.equals("tarde"))) || (diaEj4.equals("sabado") || diaEj4.equals("domingo"))){ 
            
            if(diaEj4.equals("sabado") || diaEj4.equals("domingo")){
                System.out.println("No damos servicio los fines de semana. Porfavor, introduce otro dia:");
                diaEj4 = teclado.next().toLowerCase();
            }

            else if((diaEj4.equals("martes") || diaEj4.equals("jueves")) && turnoEj4.equals("tarde")){ //preguntamos de cambiar el turno por la mañana o el dia
                System.out.println("No damos servicio los " + diaEj4 + " por la tarde. ¿Deseas coger el turno de mañana? [Si o No]:");
                String respuestaTurnoEj4 = teclado.next().toLowerCase();
                
                if(respuestaTurnoEj4.equals("no")){
                    turnoEj4 = "tarde";
                    System.out.println("Introduce otro dia:");
                    diaEj4 = teclado.next().toLowerCase();
                }
                else{
                    turnoEj4 = "mañana";
                    break;
                }
            }
        }


        System.out.println("¿Qué tipo de animal requiere asistencia?");
        String animalEj4 = teclado.next().toLowerCase();


        while(diaEj4.equals("miercoles") && !animalEj4.equals("perro")){ //bucle por si se introduce otro animal que no sea perro en miercoles, el usuario pueda cambiar el dia
            System.out.println("Los miercoles solo damos servicio a los perros. Por favor, introduce otro día:");
            diaEj4 = teclado.next().toLowerCase();

            if(diaEj4.equals("martes") || diaEj4.equals("jueves")){
                turnoEj4 = "mañana";
            }
        }


        System.out.println("\n" + "Visita concertada el " + diaEj4 + " por la " + turnoEj4 + " para el animal " + animalEj4);
        


        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
