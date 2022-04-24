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
            
      
            if (num == 1 || num == 2 || num == 3) {
                saltosMain(num);
            }

            else if (num == 4) {
                bucle = false;
            }
            
            else {
                System.out.println("OPCIÓN NO VÁLIDA, INTENTALO DE NUEVO");
            }
        }

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }

    
    
    
    

    
    
    public static void saltosMain(int opcionSalto){
        int numeroParticipantes = numeroParticipantes();
        String arrayParticipantes[] = añadirNombresParticipantes(numeroParticipantes);

        float arraySaltos[][] = hacerSaltos(numeroParticipantes, arrayParticipantes, opcionSalto);
        
        // max y min de cada participante
        //puntuajesIndividuales
        funcionSalto.puntuajesIndividuales(arraySaltos, arrayParticipantes, numeroParticipantes);
        
        funcionSalto.printAllResults(arraySaltos, arrayParticipantes, numeroParticipantes);
        // System.out.println(sis);
    }


    public static int numeroParticipantes(){
        
        int cantidadParticipantes = 0;
        
        boolean state = true;
        
        while (state) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("¿Cuantos participantes hay?");
                cantidadParticipantes = sc.nextInt();
                System.out.print("\n");
                
            } catch (InputMismatchException excep) {
                System.out.println("\n-------------------------------------");
                System.out.println("Error, solo puedes introducir números");
                System.out.println("-------------------------------------\n");

            }

            if(cantidadParticipantes < 3){
                System.out.println("\n\nERROR, introduce mínimo 3 participantes para hacer el podiumn\n");
            }

            else{
                state = false;
            }
        }
        
        return cantidadParticipantes;
    }


    public static String[] añadirNombresParticipantes(int cantidadParticipantes){
        String arrayParticipantes[] = new String[cantidadParticipantes];

        for (int i = 0; i < arrayParticipantes.length; i++) {
            System.out.println("\nIntroduce el nombre del participante " + (i+1));
            arrayParticipantes[i] = sc.next();
        }

        return arrayParticipantes;
    }


    public static float[][] hacerSaltos(int numeroParticipantes, String[] nombresParticipantes, int opcionSalto){
        float saltosParticipantes[][] = new float[numeroParticipantes][3];
        boolean statePrimerPart = true;
        boolean statePrimerPart2 = true;
        float saltoParticipante = 0;
        float validOrNot = 0;
        
        for (int i = 0; i < numeroParticipantes; i++) {
            System.out.println("\n\n------------------------");
            System.out.println("Turno del participante " + (i+1));
            System.out.println("------------------------\n");
            
            for (int j = 0; j < 3; j++) {
                // Salto válido o no válido
                validOrNot = funcionSalto.crearRandom(4);
                
                if(validOrNot == 1){ //Si el salto es válido
                    
                    // Primer participante
                    if(i == 0){
                        while (statePrimerPart) {
                            while (statePrimerPart2) {
                                try {
                                    Scanner sc = new Scanner(System.in);
                                    System.out.println("Introduce la distáncia del salto realizado: ");
                                    saltoParticipante = sc.nextFloat();
                                    System.out.print("\n");
                                    statePrimerPart2 = false;
                                    
                                } catch (InputMismatchException excep) {
                                    System.out.println("\n-------------------------------------");
                                    System.out.println("Error, solo puedes introducir números");
                                    System.out.println("-------------------------------------\n");
                    
                                }
                            }
                           
        
                            String validarSalto = funcionSalto.checkIsValid(opcionSalto, saltoParticipante);
                            
                            if(validarSalto.equals("ok")){
                                statePrimerPart = false;
                            }
        
                            else{
                                System.out.println(validarSalto + "\n\n");
                                statePrimerPart2 = true;
                            }
                        }

                        saltosParticipantes[i][j] = saltoParticipante;

                        statePrimerPart = true;
                        statePrimerPart2 = true;
                    }

                    // Resto de participantes
                    else{
                        saltosParticipantes[i][j] = funcionSalto.crearRandom(opcionSalto);
                    }
                }

                else{ //Si el salto no es válido
                    System.out.println("\nSalto no válido \n");
                    saltosParticipantes[i][j] = 0;
                }


            }
        }

        return saltosParticipantes;
    }


}
