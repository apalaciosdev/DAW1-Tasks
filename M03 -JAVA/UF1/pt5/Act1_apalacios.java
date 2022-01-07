import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        float distanciaMayor = -1;
        float distanciaMenor = 99999;
        float distanciaTotal = 0;
       
        System.out.println("Introduce el número de participantes:");
        int participantes = teclado.nextInt();

        for(int i = 0; i < participantes; i++){
            System.out.println("Introduce la distáncia total que han recorrido:");
            float distancia = teclado.nextFloat();

            
            if(distancia < distanciaMenor){
                distanciaMenor = distancia;
            }

            if(distancia > distanciaMayor){
                distanciaMayor = distancia;
            }

            distanciaTotal = distanciaTotal + distancia;
        }

        System.out.println("\nLa distáncia más corta es: " + distanciaMenor);
        System.out.println("La distáncia más larga es: " + distanciaMayor);
        System.out.println("La distáncia total de todos los participantes es de: " + distanciaTotal);
        System.out.println("Media total: " + (distanciaTotal/participantes));


        
        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
