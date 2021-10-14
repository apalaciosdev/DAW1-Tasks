import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.lang.Math;

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
        System.out.println("El resultado calculando el módulo de los números es: " + (numero1Ej1 % numero2Ej2) + "\n");





        //EJERCICIO 2

        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        int numeroTemperaturaEj2 = teclado.nextInt();
        float calculo = (float) ((numeroTemperaturaEj2-32)*5/9);
        
        System.out.printf(numeroTemperaturaEj2 + "F son %.2f ºC \n", calculo);

        



        //EJERCICIO 3

        System.out.println("Introduce los Km recorridos:");
        int kilometrosEj3 = teclado.nextInt();
        float calculoMetrosEj3 = (float) kilometrosEj3 * 1000;

        System.out.println("Introduce el tiempo (en horas) que has tardado:");
        int tiempoHorasEj3 = teclado.nextInt();


        System.out.printf("El coche ha hecho " + kilometrosEj3 + "Km en " + tiempoHorasEj3 + "horas");
        System.out.printf("En una hora a hecho %.2f metros \n", (calculoMetrosEj3/(float)tiempoHorasEj3));
        
        



        //EJERCICIO 4

        System.out.println("Introduce tu nombre:");
        String nombreEj4 = teclado.next();

        System.out.println("Tarea diária por hacer:");
        String tareaEj4 = teclado.next();

        Calendar dataHora = Calendar.getInstance();
        System.out.printf( nombreEj4 + " ha hecho la tarea: " + tareaEj4 + " a las %tT \n", dataHora );
        




        //EJERCICIO 5

        System.out.println("Introduce el número entero:");
        int numeroEj4 = teclado.nextInt();

        System.out.printf("El número entero " + numeroEj4 + " convertido a octal es: %o y convertido a hexadecimal es: %x \n", numeroEj4, numeroEj4);

        





        //EJERCICIO 6

        System.out.println("Introduce el número entero:");
        int numeroEj6 = teclado.nextInt();

        double potencia2Ej6 = Math.pow(numeroEj6, 2);
        double potencia3Ej6 = Math.pow(numeroEj6, 3);
        double potencia5Ej6 = Math.pow(numeroEj6, 5);
        double potencia7Ej6 = Math.pow(numeroEj6, 7);
        double raizEj6 = Math.sqrt(numeroEj6);

        System.out.printf("El número " + numeroEj6 + " elevado al cuadrado es " + (int)potencia2Ej6 +
                           ", elevado al cubo es " + (int)potencia3Ej6 +
                           ", elevado a 5 es " + (int)potencia5Ej6 +
                           ", elevado a 7 es " + (int)potencia7Ej6 + 
                           " y su raíz cuadrada es " + (int)raizEj6 + "\n"
        );
      





        //EJERCICIO 7

        System.out.println("Introduce el radio de la circunferencia:");
        float radioEj7 = teclado.nextFloat();

        double longitudEj7 =  2 * Math.PI * radioEj7;
        double areaEj7 = Math.PI * Math.pow(radioEj7, 2);
    
        System.out.printf("La longitud de una circunferencia de radio %.2fcm es %.2fcm y el área es %.2fcm \n", radioEj7, longitudEj7, areaEj7);
        




        //EJERCICIO 8

        System.out.println("Introduce la base del triángulo:");
        float baseEj8 = teclado.nextFloat();

        System.out.println("Introduce la altura del triángulo:");
        float alturaEj8 = teclado.nextFloat();

        float areaEj8 = (baseEj8 * alturaEj8) / 2;

        System.out.printf("El área de un triángulo de %.1fcm de base y %.1fcm de altura es %.2fcm \n", baseEj8, alturaEj8, areaEj8);
    }



}
