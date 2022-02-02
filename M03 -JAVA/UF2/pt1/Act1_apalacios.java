import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in, "UTF-8");   
        float maxKmCoches[] = {};
        
        System.out.println("Introduce número de modelos de coche que dispones:");
        int cantidadModelos = teclado.nextInt();
        
        for (int i = 0; i < cantidadModelos; i++) {
            System.out.println("MODELO " + (i+1));
            System.out.println("¿Cual es la distancia máxima en KM que permite recorrer diáriamente?");
            float kmMaxDiarios = teclado.nextFloat();
            
            maxKmCoches[i] = kmMaxDiarios;
        }
        
    
        


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
