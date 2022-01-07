import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act4_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int respuesta = 0;
        int n1 = 0;
        int n2 = 0;


        while(true){
            System.out.println("¿Qué operacion deseas realizar?" + 
                                "\n  1.- Suma de 2 números" + 
                                "\n  2.- Resta de 2 números" + 
                                "\n  3.- Multiplicació de 2 números" + 
                                "\n  4.- División de 2 números" + 
                                "\n  5.- Finalizar" +
                                "\n\nSelecciona un número");

            respuesta = teclado.nextInt();
           

            if(respuesta == 5){
                System.out.println("---------------- FIN DEL PROGRAMA ----------------");
                System.out.println("----------------- Aaron Palacios -----------------");
                break;
            }


            else if(respuesta > 0 && respuesta < 6){

                System.out.println("\nIntroduce el primer número:");
                n1 = teclado.nextInt();
                
                System.out.println("\nIntroduce el segundo número:");
                n2 = teclado.nextInt();
    
    
                if(respuesta == 1){
                    System.out.println("\n" + n1 + "+" + n2 + " es igual a " + (n1+n2) + "\n\n");
                }
    
                else if(respuesta == 2){
                    System.out.println("\n" + n1 + "-" + n2 + " es igual a " + (n1-n2) + "\n\n");
                }
    
                else if(respuesta == 3){
                    System.out.println("\n" + n1 + "x" + n2 + " es igual a " + (n1*n2) + "\n\n");
                }
    
                else if(respuesta == 4){
                    System.out.println("\n" + n1 + "/" + n2 + " es igual a " + (n1/n2) + "\n\n");
                }
    
            }


            else{
                System.out.println("\nRespuesta no válida. Por favor, introduce otra correcta:\n");
            }
        }   

    }
}
