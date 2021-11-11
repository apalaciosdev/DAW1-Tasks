import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act3_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int operacionesPositivas = 0;
        int operacionesNegativas = 0;
        int operacionesTotales = 0;
        int i = 0;

        System.out.println("Introduce el saldo inicial:");
        float saldo = teclado.nextFloat();
        float saldoInicial = saldo;
        
        for (i = 0; i > -1; i++) {
            
            System.out.println("Introduce la operación que deseas realizar:");
            float nuevaOpeacion = teclado.nextFloat();

            if(nuevaOpeacion > 0){
                operacionesPositivas ++;
            }

            else if(nuevaOpeacion < 0){
                operacionesNegativas ++;
            }
                
            else{
                operacionesTotales = i;
                i = -2; //cerramos bucle
            }

            saldo = saldo + nuevaOpeacion;
        }
        

        System.out.println("\n\n\nSe han hecho un total de: " + operacionesTotales + " operaciones");
        System.out.println("Se han hecho un total de: " + operacionesPositivas + " operacion/es positiva/s");
        System.out.println("Se han hecho un total de: " + operacionesNegativas + " operacion/es negativa/s");

        if(saldo > 0){
            System.out.println("Tienes un saldo positivo con un total de " + saldo + " euros");
        }

        else if(saldo < 0){
            System.out.println("Tienes un saldo negativo con un total de " + saldo + " euros");
        }

        else{
            System.out.println("Estás pelao. Tienes un saldo total de 0 euros");
        }

        System.out.println("La media total de las operaciones realizadas es: " + ((saldo - saldoInicial) / operacionesTotales) + " euros");


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
