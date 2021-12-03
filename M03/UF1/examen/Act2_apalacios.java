import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.lang.Math;

public class Act2_apalacios {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        int respuesta = 0;
        boolean value = true;
        int numeroParticipantes = 0;
        int edades = 0;
        int mediaEdad = 0;

        
        while(value){
            System.out.println("\n\n-------Introduce la operación deseada-------" + 
                                "\n  1.- Introducir el número de participantes" + 
                                "\n  2.- Introducir el año de nacimiento de cada participante" + 
                                "\n  3.- Mostrar la media de la edad de los participantes" + 
                                "\n  4.- Salir del programa" + 
                                "\n\nSelecciona un número");

            respuesta = teclado.nextInt();



            //OPERACIÓN 1
            if(respuesta == 1){
                System.out.println("\n\n--------------------------------------");
                System.out.println("Introduce el número de participantes: ");
                numeroParticipantes = teclado.nextInt();
                
                while(numeroParticipantes < 1 || numeroParticipantes > 10){
                    System.out.println("\n\n-------------------------------------------------------------------");
                    System.out.println("Número de participantes no válido. Introduce un número del 1 al 10: ");
                    System.out.println("-------------------------------------------------------------------");
                    numeroParticipantes = teclado.nextInt();
                }
    
                mediaEdad = 0;
                edades = 0;
                System.out.println("--------------------------------------");
            }



            //OPERACIÓN 2
            else if(respuesta == 2){
                if(numeroParticipantes == 0){
                    System.out.println("\n\n----------------------------------------------------------");
                    System.out.println("ERROR, primero hay que indicar el número de participantes.");
                    System.out.println("----------------------------------------------------------");
                }

                else{
                    System.out.println("\n\n-----------------------------------------------------");
                    System.out.println("Introduce el año de nacimiento de cada participante:");
                    for (int i = 0; i < numeroParticipantes; i++) {
                        System.out.println("Año de nacimiento del participante " + (i+1) + ":");
                        int añoParticipante = teclado.nextInt();

                        //calculamos edad
                        calendar.setTime(date);
                        int dateYear = calendar.get(Calendar.YEAR);
                        int edadParticipante = dateYear - añoParticipante;

                        //guardamos la suma de las edades
                        edades = edades + edadParticipante;
                    }

                    //hacemos la media de las edades
                    mediaEdad = edades / numeroParticipantes;
                    System.out.println("-----------------------------------------------------");
                }
            }



            //OPERACIÓN 3
            else if(respuesta == 3){
                if(mediaEdad > 0){
                    System.out.println("\n\n---------------------------------------------");
                    System.out.println("La media de edad de los participantes es: " + mediaEdad);
                    System.out.println("---------------------------------------------");
                }

                else{
                    System.out.println("\n\n------------------------------------------------");
                    System.out.println("Primero introduce la edad del/los participante/s");
                    System.out.println("------------------------------------------------");
                }
            }



            //OPERACIÓN 4
            else if(respuesta == 4){
                value = false;
            }


            
            //OPERACIÓN NO VÁLDA
            else{
                System.out.println("\n\n----------------------------------------------------------");
                System.out.println("Operación seleccionada no válida. Selecciona otra de nuevo");
                System.out.println("----------------------------------------------------------");
            }
        }

        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
