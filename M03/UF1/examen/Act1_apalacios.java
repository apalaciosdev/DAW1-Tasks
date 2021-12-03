import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        //valores iniciales
        int numIncidencias = 0;
        String estadoAviso = "verde";
        
        

        //valores por teclado de cada agente contaminante
        System.out.println("Introduce el valor de PM2_5:");
        double pm2_5 = teclado.nextDouble();

        System.out.println("Introduce el valor de PM10:");
        double pm10 = teclado.nextDouble();
        
        System.out.println("Introduce el valor de O3:");
        double o3 = teclado.nextDouble();
        
        System.out.println("Introduce el valor de NO2:");
        double no2 = teclado.nextDouble();
        
        System.out.println("Introduce el valor de SO2:");
        double so2 = teclado.nextDouble();
        
        

        //condicionales para comprobar si se excede algún límite
        if(pm2_5 > 25){
            numIncidencias ++;
        }
        
        if(pm10 > 50){
            numIncidencias ++;
        }
        
        if(o3 > 100){
            numIncidencias ++;
        }
        
        if(no2 > 200){
            numIncidencias ++;
        }
        
        if(so2 > 20){
            numIncidencias ++;
        }
        
        
        
        //nº de veces que se han infringido los límites
        if(numIncidencias == 1){
            estadoAviso = "naranja";
        }
        
        else if(numIncidencias == 2){
            estadoAviso = "rojo";
        }
        
        else if(numIncidencias > 2){
            estadoAviso = "morado";
        }

        System.out.println("\n---------------");
        System.out.println("Nivel "+ estadoAviso);
        System.out.println("---------------\n");
        
        
        
        
        //caso en el que el estado del aviso esté en rojo o morado
        if(estadoAviso.equals("rojo") || estadoAviso.equals("morado")){
            System.out.println("Introduce el año de antigüedad del coche: ");
            int añosCoche = teclado.nextInt();
            
            if(añosCoche > 14){
                System.out.println("\n------------------------------------");
                System.out.println("No se puede circular hoy.");
            }

            else{
                System.out.println("\n------------------------------------");
                System.out.println("Puede circular.");
            }
        }
        

        //caso de que esté en verde o naranja
        else{
            System.out.println("\n------------------------------------");
            System.out.println("No hay retricciones.");
        }
        
        
       
        //cálculo de la media de los valores introducidos
        double calculoMedia = (pm2_5 + pm10 + o3 + no2 + so2)/5;
        System.out.printf("Mediana de la contaminación: %.2f", calculoMedia);
        System.out.println("\n------------------------------------\n");
        
        
        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
