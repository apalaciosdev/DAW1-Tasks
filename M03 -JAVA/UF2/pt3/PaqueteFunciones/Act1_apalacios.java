package PaqueteFunciones;

import java.util.*;
import java.lang.*;
import java.util.InputMismatchException; 


public class Act1_apalacios {
    public static Scanner sc = new Scanner(System.in, "UTF-8");
    public static funcionesSaltos funcionSalto = new funcionesSaltos();


    public static void main(String[] args) throws Exception{
        boolean bucle = true;
        int num = 0;

        while (bucle) {
            System.out.println("\n\n\n\n---------------- MENÚ ----------------");
            System.out.println("1- Salto de longitud");
            System.out.println("2- Salto de altura");
            System.out.println("3- Salto en pértiga");
            System.out.println("4- Salir");
            System.out.println("");
            System.out.println("Introduce número: ");
            num = sc.nextInt();
            
      
            if (num == 1) {
                saltoLongitud();
            }
      
            else if (num == 2) {
                // saltoAltura();
            }
      
            else if (num == 3) {
                // saltoPertiga();
            }
      
            else if (num == 4) {
                bucle = false;
            }
            
            else {
                System.out.println("OPCIÓN NO DISPONIBLE, INTENTALO DE NUEVO");
            }
        }

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }

    
    public static String[] participantes(){
        
        int cantidadParticipantes = 0;
        
        boolean state = true;
        
        while (state) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("¿Cuantos participantes hay?");
                cantidadParticipantes = sc.nextInt();
                System.out.print("\n");
                state = false;
                
            } catch (InputMismatchException excep) {
                System.out.println("\n-------------------------------------");
                System.out.println("Error, solo puedes introducir números");
                System.out.println("-------------------------------------\n");

            }
        }
        

        String arrayParticipantes[] = new String[cantidadParticipantes];

        for (int i = 0; i < arrayParticipantes.length; i++) {
            System.out.println("\nIntroduce el nombre del participante " + (i+1));
            arrayParticipantes[i] = sc.next();
        }
        
        return arrayParticipantes;
    }
    
    
    


    
    public static void saltoLongitud(){
        String arrayParticipantes [] = participantes();
        for (String string : arrayParticipantes) {
            System.out.println(string);
        }

        float sis = funcionSalto.crearRandom(1);
        System.out.println(sis);
    }


}
