package PaqueteFunciones;

import java.util.Arrays;

public class funcionesSaltos {

    public static float crearRandom(int tipo) {
        Double randomNumber = (double) 0;
        Double numeroRedondeado = (double) 0;
        float randomFloat = 0;

        switch (tipo) {
            case 1: //Salto longitud
                randomNumber = (Math.random() * (9.0f - 1.0f)) + 1.0f;
                numeroRedondeado = Math.round(randomNumber * 100.0) / 100.0;
                randomFloat = numeroRedondeado.floatValue();
                break;

            case 2: //Salto altura
                randomNumber = (Math.random() * (1.50f - 0.80f)) + 0.80f;
                numeroRedondeado = Math.round(randomNumber * 100.0) / 100.0;
                randomFloat = numeroRedondeado.floatValue();
                break;

            case 3: //Salto pértiga
                randomNumber = (Math.random() * (6.30f - 3.00f)) + 3.00f;
                numeroRedondeado = Math.round(randomNumber * 100.0) / 100.0;
                randomFloat = numeroRedondeado.floatValue();
                break;
            
            case 4: //Salto válido o no válido
                randomFloat = (float) ((float) Math.floor(Math.random() * (1 - 0 + 1)) + 0);
                break;

            default:
                break;
        }

        return randomFloat;
    }
    

    public static String checkIsValid(int tipo, float saltoIntroducido) {
        String message = "ok";
        switch (tipo) {
            case 1: //Salto longitud
                if(saltoIntroducido < 1 || saltoIntroducido > 9){
                    message = "ERROR, Introduce un número del 1 al 9";
                }
                break;
                
            case 2: //Salto altura
                if(saltoIntroducido < 0.8 || saltoIntroducido > 1.5){
                    message = "ERROR, Introduce un número del 0.8 al 1.5";
                }
                break;
                
            case 3: //Salto pértiga
                if(saltoIntroducido < 3 || saltoIntroducido > 6.3){
                    message = "ERROR, Introduce un número del 3 al 6.3";
                }
                break;
            
            default:
                break;
        }

        return message;
    }



    public static void printAllResults(float[][] arraySaltos, String[] arrayParticipantes, int numeroParticipantes){
        System.out.println("\n\n");
        for (int i = 0; i < numeroParticipantes; i++) {
            System.out.println("\nParticipante " + (i+1) + " llamado " + arrayParticipantes[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println("Salto " + (i+j) + ": " + arraySaltos[i][j]);
            }
        }
    }



    public static void puntuajesIndividuales(float[][] arraySaltos, String[] arrayParticipantes, int numeroParticipantes){
        float saltosParticipante[] = new float[3];
        float mejoresSaltosIndividuales[] = new float[numeroParticipantes];
        float peoresSaltosIndividuales[] = new float[numeroParticipantes];
        float podiumMejoresSaltos[] = new float[numeroParticipantes];
        float podiumPeoresSaltos[] = new float[numeroParticipantes];

        int primerPuesto = 0;
        int segundoPuesto = 0;
        int tercerPuesto = 0;
        int peorPuesto = 0;
        
        System.out.println("\n\n---------Mejores saltos individuales---------");
        
        for (int i = 0; i < numeroParticipantes; i++) {
            for (int j = 0; j < 3; j++) { //Guardamos los 3 saltos jugador por jugador
                saltosParticipante[j] = arraySaltos[i][j];
            }

            Arrays.sort(saltosParticipante); //Ordenamos todos los resultados de cada participante
            mejoresSaltosIndividuales[i] = saltosParticipante[2]; //salto máximo
            peoresSaltosIndividuales[i] = saltosParticipante[0]; //salto mínimo
        }

        podiumMejoresSaltos = mejoresSaltosIndividuales; podiumPeoresSaltos = peoresSaltosIndividuales;

        Arrays.sort(podiumMejoresSaltos); //Ordenamos todos los resultados de cada participante
        Arrays.sort(podiumPeoresSaltos); //Ordenamos todos los resultados de cada participante

        boolean podiumState = true;
        int podiumCont = -1;
        int doneTasks = 0;

        boolean checkedFirst = false;
        boolean checkedSecond = false;
        boolean checkedThird = false;

        System.out.println("--------");
        for (float f : mejoresSaltosIndividuales) {
            System.out.println(f);
        }
        System.out.println("--------");

        while (podiumState) {
            podiumCont ++;
            System.out.println("vuelta " + podiumCont);

            System.out.println("nose" + mejoresSaltosIndividuales[podiumCont]);
            if(mejoresSaltosIndividuales[podiumCont] == podiumMejoresSaltos[podiumMejoresSaltos.length-1] && checkedFirst == false){
                System.out.println("Jugador " + arrayParticipantes[podiumCont] + " -> " + podiumMejoresSaltos[podiumMejoresSaltos.length-1]);
                System.out.println("primero\n");
                primerPuesto = podiumCont;
                podiumCont = -1;
                checkedFirst = true;
            }
            
            else if(mejoresSaltosIndividuales[podiumCont] == podiumMejoresSaltos[podiumMejoresSaltos.length-2] && checkedSecond == false){
                System.out.println("Jugador " + arrayParticipantes[podiumCont] + " -> " + podiumMejoresSaltos[podiumMejoresSaltos.length-2]);
                System.out.println("segundo\n");
                segundoPuesto = podiumCont;
                podiumCont = -1;
                checkedSecond = true;
            }
            
            else if(mejoresSaltosIndividuales[podiumCont] == podiumMejoresSaltos[podiumMejoresSaltos.length-3] && checkedThird == false){
                System.out.println("Jugador " + arrayParticipantes[podiumCont] + " -> " + podiumMejoresSaltos[podiumMejoresSaltos.length-3]);
                System.out.println("tercero\n");
                tercerPuesto = podiumCont;
                podiumCont = -1;
                checkedThird = true;
            }

            // if(podiumMejoresSaltos[0] == mejoresSaltosIndividuales[podiumCont]){
            //     peorPuesto = podiumCont;
            //     podiumCont = -1;
            //     doneTasks ++;
            // }

            if(checkedFirst == true && checkedSecond == true && checkedThird == true){
                podiumState = false;
            }

        }
        /*
        for (int i = 0; i < numeroParticipantes; i++) {
            if(podiumMejoresSaltos[podiumMejoresSaltos.length-1] == mejoresSaltosIndividuales[i]){
                primerPuesto = i;
            }
            
            else if(podiumMejoresSaltos[podiumMejoresSaltos.length-2] == mejoresSaltosIndividuales[i]){
                segundoPuesto = i;
            }

            else if(podiumMejoresSaltos[podiumMejoresSaltos.length-3] == mejoresSaltosIndividuales[i]){
                tercerPuesto = i;
            }

            else if(podiumMejoresSaltos[podiumMejoresSaltos.length-0] == mejoresSaltosIndividuales[i]){
                peorPuesto = i;
            }
        }
        */

        System.out.println("\n\n\n=========PODIUM=========");
     
    
        System.out.println("1.- " + arrayParticipantes[primerPuesto] + " -> " + podiumMejoresSaltos[primerPuesto] + " metros");
        System.out.println("2.- " + arrayParticipantes[segundoPuesto] + " -> " + podiumMejoresSaltos[segundoPuesto] + " metros");
        System.out.println("3.- " + arrayParticipantes[tercerPuesto] + " -> " + podiumMejoresSaltos[tercerPuesto] + " metros");
        
 
        System.out.println(podiumMejoresSaltos[podiumMejoresSaltos.length-1]);
        System.out.println(podiumMejoresSaltos[podiumMejoresSaltos.length-2]);
        System.out.println(podiumMejoresSaltos[podiumMejoresSaltos.length-3]);
        
        // System.err.println("peores");
        // System.out.println("mejores");


        // //saber en que posicion de la antigua array estaba

        // System.out.println("\n\n-----Mejor salto-----");
    }

}
