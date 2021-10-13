import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // EJERCICIO 1
        
        Scanner tecladoEj1 = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1Ej1 = tecladoEj1.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2Ej2 = tecladoEj1.nextInt();

        System.out.println("El resultado sumando los números es: " + (numero1Ej1 + numero2Ej2));
        System.out.println("El resultado restando los números es: " + (numero1Ej1 - numero2Ej2));
        System.out.println("El resultado multiplicando los números es: " + (numero1Ej1 * numero2Ej2));
        System.out.println("El resultado dividiendo los números es: " + (numero1Ej1 / numero2Ej2));
        System.out.println("El resultado calculando el módulo de los números es: " + (numero1Ej1 % numero2Ej2));




        //EJERCICIO 2
        Scanner tecladoEj2 = new Scanner(System.in);

        System.out.println("Introduce la temperatura en grados Fahrenheit:");
        int numeroTemperaturaEj2 = tecladoEj2.nextInt();
        float calculo = ((numeroTemperaturaEj2-32)*5/9);
        
        System.out.printf(numeroTemperaturaEj2 + "F son %.2f ºC\n", calculo);

        



    }



}
