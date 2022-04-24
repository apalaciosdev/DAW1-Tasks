package PaqueteFunciones;

import java.lang.invoke.VarHandle;
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
        float medianaMejoresSaltos = 0;

        for (int i = 0; i < numeroParticipantes; i++) {
            for (int j = 0; j < 3; j++) { //Guardamos los 3 saltos jugador por jugador
                saltosParticipante[j] = arraySaltos[i][j];
            }

            Arrays.sort(saltosParticipante); //Ordenamos todos los resultados de cada participante
            mejoresSaltosIndividuales[i] = saltosParticipante[2]; //salto máximo
            peoresSaltosIndividuales[i] = saltosParticipante[0]; //salto mínimo

            medianaMejoresSaltos = medianaMejoresSaltos + saltosParticipante[2]; //salto máximo

        }


        //Copiamos la array de mejores saltos individuales y ordenamos los saltos en la nueva
        float[] podiumMejoresSaltos = new float[numeroParticipantes];
        float[] podiumPeoresSaltos = new float[numeroParticipantes];
        for (int i = 0; i < numeroParticipantes; i++) {
            podiumMejoresSaltos[i] = mejoresSaltosIndividuales[i];
            podiumPeoresSaltos[i] = peoresSaltosIndividuales[i];
        }
        Arrays.sort(podiumMejoresSaltos);
        Arrays.sort(podiumPeoresSaltos);


        float primeroPuntuacion = podiumMejoresSaltos[podiumMejoresSaltos.length-1];
        float peorPuntuacion = podiumPeoresSaltos[0];

        int posicionPrimero = 0; int posicionPeor = 0;
        
        for (int i = 0; i < numeroParticipantes; i++) {
            if(mejoresSaltosIndividuales[i] == primeroPuntuacion){
                posicionPrimero = i;
            }

            if(peoresSaltosIndividuales[i] == peorPuntuacion){
                posicionPeor = i;
            }
        }


        System.out.println("\n(Peor Salto) " + arrayParticipantes[posicionPeor] + " -> " + peorPuntuacion);
        System.out.println("(Mejor Salto) " + arrayParticipantes[posicionPrimero] + " -> " + primeroPuntuacion);
        System.out.println("(Mediana Mejores Saltos) -> " + (medianaMejoresSaltos/numeroParticipantes));
       
     
    }



    public static void podium(float[][] arraySaltos, String[] arrayParticipantes, int numeroParticipantes){
        float sumaParticipante = 0;
        float[] arraySumaPartipantes = new float[numeroParticipantes];

        for (int i = 0; i < numeroParticipantes; i++) {
            for (int j = 0; j < 3; j++) {
                sumaParticipante = sumaParticipante + arraySaltos[i][j];
            }
            arraySumaPartipantes[i] = sumaParticipante;
            sumaParticipante = 0;
        }


        //Copiamos la array de la suma de puntos y ordenamos los saltos en la nueva
        float[] marcajeOrdenado = new float[numeroParticipantes];
        for (int i = 0; i < numeroParticipantes; i++) {
            marcajeOrdenado[i] = arraySumaPartipantes[i];
        }
        Arrays.sort(marcajeOrdenado);


        float primeroPuntuacion = marcajeOrdenado[marcajeOrdenado.length-1];
        float segundoPuntuacion = marcajeOrdenado[marcajeOrdenado.length-2];
        float terceroPuntuacion = marcajeOrdenado[marcajeOrdenado.length-3];


        int posicionPrimero = 0; int posicionSegundo = 0; int posicionTercero = 0;
        
        for (int i = 0; i < numeroParticipantes; i++) {
            if(arraySumaPartipantes[i] == primeroPuntuacion){
                posicionPrimero = i;
            }

            if(arraySumaPartipantes[i] == segundoPuntuacion){
                posicionSegundo = i;
            }

            if(arraySumaPartipantes[i] == terceroPuntuacion){
                posicionTercero = i;
            }

            
        }

        System.out.println("\n\n-------PODIUM-------");
        System.out.println("\n1.- " + arrayParticipantes[posicionPrimero] + " -> " + primeroPuntuacion);
        System.out.println("\n2.- " + arrayParticipantes[posicionSegundo] + " -> " + segundoPuntuacion);
        System.out.println("\n3.- " + arrayParticipantes[posicionTercero] + " -> " + terceroPuntuacion);
    
        for (float f : arraySumaPartipantes) {
            System.out.println(f);
        }
    }

}
