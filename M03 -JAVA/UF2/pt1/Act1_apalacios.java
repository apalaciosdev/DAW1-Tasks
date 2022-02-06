import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in, "UTF-8");
        boolean state = true;
        int eleccionVehiculo;
        ArrayList<Integer> kmPorDia = new ArrayList<Integer>();

        System.out.println("Introduce número de modelos de coche que dispones:");
        int cantidadModelos = teclado.nextInt();


        //creamos el array con el tamaño de cantidad de modelos
        int maxKmCoches[] = new int [cantidadModelos];


        //introducimos los km de cada modelo
        for (int i = 0; i < cantidadModelos; i++) {
            System.out.println("MODELO " + (i + 1));
            System.out.println("¿Cual es la distancia máxima en KM que permite recorrer diáriamente?");
            int kmMaxDiarios = teclado.nextInt();
            maxKmCoches[i] = kmMaxDiarios;
        }


        //imprimimos el array
        System.out.println("\n\n");
        while(state){
            System.out.println("\n\n---Lista de modelos---\n");
            System.out.println("0.- Exit\n");

            for (int i = 0; i < maxKmCoches.length; i++) {
                System.out.println((i+1) + ".- " + maxKmCoches[i] + "\n");
            }
            System.out.println("----------------------");


            System.out.println("Escoge el vehículo:");
            eleccionVehiculo = teclado.nextInt();


            //si la opción escogida es 0 se repite el loop con mensaje de error
            if(eleccionVehiculo < 0 || eleccionVehiculo > maxKmCoches.length){
                System.err.println("\n\n\nERROR, elección no válida. Escoge nuevamente:");
            }


            //si la opción escogida es 0 sale del bucle
            else if(eleccionVehiculo==0){
                state = false;
            }


            //si la opción escogida es la de un vehículo existente entonces entra aquí
            else if(eleccionVehiculo >= 0 && eleccionVehiculo <= maxKmCoches.length){
                System.out.println("\n\n¿Cuántos dias utilizarás el vehículo?");
                int totalDiasVehiculo = teclado.nextInt();

                for(int i = 0; i < totalDiasVehiculo; i++) {
                    System.out.println("\n¿Cuántos km has recorrido en el dia " + (i+1) + "?");
                    int kmDia = teclado.nextInt();

                    //guardamos km diario en arraylist
                    kmPorDia.add(kmDia);

                    //comprobamos si se ha superado la distáncia máxima por dia
                    if(kmDia > maxKmCoches[eleccionVehiculo-1]){
                        System.out.println("\nALERTA, ¡Superaste el límite diario!");
                    }
                }


                //calculos de km totales recorridos
                int totalKmDiarios = 0;
                for (Integer kmDiarioRecorrido : kmPorDia) {
                    totalKmDiarios = totalKmDiarios + kmDiarioRecorrido;
                }
                System.out.println("Distancia total recorrida: " + totalKmDiarios + "km");
                kmPorDia.clear(); //vaciamos lista


                //comprobamos si se ha superado la distáncia total máxima permitida
                int maxDistanciaTotalPermitida =  //maxDistanciaTotalPermitida = kmIntroducidosCoche/dia * diasAlquiler
            }
        }

        /*
        Finalment heu de mostrar la distància total que ha fet l’usuari/a amb el vehicle
        en tot el seu viatge, comparar-ho amb la màxima teòrica que pot recórrer avisant
        si l’han superada. També haurà de mostrar quin dia ha fet més Km i quin dia n’ha
        fet menys.
        */

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
