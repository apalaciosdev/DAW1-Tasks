import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // EJERCICIO 1
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1Ej1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2Ej2 = teclado.nextInt();

        System.out.println("El resultado sumando los números es: " + (numero1Ej1 + numero2Ej2));
        System.out.println("El resultado restando los números es: " + (numero1Ej1 - numero2Ej2));
        System.out.println("El resultado multiplicando los números es: " + (numero1Ej1 * numero2Ej2));
        System.out.println("El resultado dividiendo los números es: " + (numero1Ej1 / numero2Ej2));
        System.out.println("El resultado calculando el módulo de los números es: " + (numero1Ej1 % numero2Ej2));




        //EJERCICIO 2

        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        int numeroTemperaturaEj2 = teclado.nextInt();
        float calculo = (float) ((numeroTemperaturaEj2-32)*5/9);
        
        System.out.printf(numeroTemperaturaEj2 + "F son %.2f ºC\n", calculo);

        



        //EJERCICIO 3

        System.out.println("Introduce los Km recorridos:");
        int kilometrosEj3 = teclado.nextInt();
        float calculoMetrosEj3 = (float) kilometrosEj3 * 1000;

        System.out.println("Introduce el tiempo (en horas) que has tardado:");
        int tiempoHorasEj3 = teclado.nextInt();


        System.out.printf("El coche ha hecho " + kilometrosEj3 + "Km en " + tiempoHorasEj3 + "horas \n");
        System.out.printf("En una hora a hecho %.2f metros", (calculoMetrosEj3/(float)tiempoHorasEj3));



       





    }



}
