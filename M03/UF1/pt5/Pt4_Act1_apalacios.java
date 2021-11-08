import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Pt4_Act1_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        float distanciaMayor = 0;
        float distanciaMenor = 0;
        float distanciaTotal = 0;
       
        System.out.println("Introduce el número de participantes:");
        int participantes = teclado.nextInt();

        for(int i = 0; i <= participantes; i++){
            System.out.println("Introduce la distáncia total que han recorrido:");
            float distancia = teclado.nextFloat();
            
            if(distancia < distanciaMenor){
                distanciaMenor = distancia;
            }

            if(distancia > distanciaMenor){
                distanciaMayor = distancia;
            }

            distanciaTotal = distanciaTotal + distancia;
        }

        System.out.println(distanciaMayor);
        System.out.println(distanciaMenor);
        System.out.println(distanciaTotal);





        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
