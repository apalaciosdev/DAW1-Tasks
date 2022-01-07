import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act5_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int i = 1;
        int quilos = 0;
        int quilosTotales = 0;
        int viajesTotales = 0;
        int kgMax = 0;
        int kgMin = 99999;
        int errores = 0;
        /* 
            5. Feu un programa per controlar els Kilos de patates que un/una transportista portarà durant una jornada de feina.
            
            El/La transportista acabarà la jornada quan hagi fet 10 viatges  o hagi superat els 5000 Kilos totals. 
            
            Si intenteu introduir un valor negatiu en un viatge, el programa ha de tornar a demanar el valor fins que en poseu un de positiu.
            
            En finalitzar la jornada heu de dir:
                - Quants viatges a fet el/la transportista
                -La mitjana de Kilos de cada viatge
                -El viatge amb més Kilos
                -El viatge amb menys
                -Quantes vegades us heu equivocat posant un número negatiu
        */

        for(i = 1; ((i > 0 && i < 11) && quilosTotales < 5000); i++){
            System.out.println("Este es el viaje nº" + i + ". Introduce los Kg totales que se van a tranportar (" + Math.abs(5000-quilosTotales) + "Kg restantes):");
            quilos = teclado.nextInt();
            
            while(quilos < 0){
                System.out.println("Cantidad no válida. Introduce otra.");
                quilos = teclado.nextInt();
                errores ++;
            }

            while(quilos + quilosTotales > 5000){
                System.out.println("Has sobrepasado el límite de carga por jornada (5000Kg). Te quedan " + Math.abs(5000-quilosTotales) + "Kg disponibles. Introduce una nueva cantidad:");
                quilos = teclado.nextInt();
            }

            if(quilos > kgMax){
                kgMax = quilos;
            }

            if(quilos < kgMin){
                kgMin = quilos;
            }
            
            quilosTotales = quilosTotales + quilos;   
        }

        
        if(quilosTotales == 5000){
            System.out.println("Con esta carga finalmente se han alzanzado los 5000Kg. El transportista transporta la carga y acaba la jornada por hoy.");
        }

        if(viajesTotales > 10){
            System.out.println("Ya se han hecho 10 viajes. El transportista acaba la jornada por hoy."); 
        }

        System.out.println("\n\nSe han transportado " + quilosTotales + "Kg en total esta jornada."); 
        System.out.println("Se han transportado una cantidad promedio de " + (quilosTotales/(i-1)) + "Kg en esta jornada."); 
        System.out.println("La cantidad más grande són: " + kgMax + "Kg."); 
        System.out.println("La cantidad más pequeña són: " + kgMin + "Kg."); 
        System.out.println("Se han transportado una cantidad promedio de " + (quilosTotales/(i-1)) + "Kg en esta jornada."); 
        System.out.println("Te has equivocado " + errores + " vez/es poniendo la cantidad de carga."); 
    }
}
