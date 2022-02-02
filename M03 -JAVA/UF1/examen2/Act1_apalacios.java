import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in, "UTF-8");   
        
        //1ra parte
        float ingresosSemana[] = new float [7];
        boolean isWrong = false;
        
        //2da parte
        ArrayList <ArrayList> datosVendedores = new ArrayList<>();
        boolean state = true;
        int contadorVendedores = 0; 
        



        //Introducimos las ganancias de cada dia
        for (int i = 0; i < ingresosSemana.length; i++) {
            System.out.println("¿Cuantos euros ha ganado hoy?");
            float dineroDia = teclado.nextFloat();
            
            //Si la cantidad introducida es negativa, devuelve error
            while(dineroDia<0){
                System.out.println("ERROR, cantidad no válida. Introduce de nuevo. ¿Cuantos euros ha ganado hoy?");
                dineroDia = teclado.nextFloat();
            }
        
            ingresosSemana[i] = dineroDia;
        }
        

        
        
        //Imprimimos el array
        System.out.println("\n\n__________Ganancias de esta semana__________");
        for (int i = 0; i < ingresosSemana.length; i++) {
            String nombreDia[]={"Dia 1: ", "Dia 2: ", "Dia 3: ", "Dia 4: ", "Dia 5: ", "Dia 6: ", "Dia 7: "};
            System.out.printf(nombreDia[i] + "%.2f\n", ingresosSemana[i]);
        }
        System.out.println("____________________________________________\n\n");
        
        
        
        
        //Modificar dia
        System.out.println("Si algún valor es erróneo pulsa R para rectificar. En caso contrario, pulsa cualquier tecla:");
        String eleccion = teclado.next().toLowerCase();
        
        if(eleccion.equals("r")){
            isWrong = true;
        }
        
        while(isWrong){
            System.out.println("Que dia deseas modificar ( 1, 2, 3, 4, 5, 6 o 7 )");
            int diaAModificar = teclado.nextInt()-1;
            
            System.out.println("Introduce el nuevo total de euros ha ganados ese dia?");
            float dineroDia = teclado.nextFloat();
            
            ingresosSemana[diaAModificar] = dineroDia;



            //Imprimimos el array
            System.out.println("\n\n__________Ganancias de esta semana__________");
            for (int i = 0; i < ingresosSemana.length; i++) {
                String nombreDia[]={"Dia 1: ", "Dia 2: ", "Dia 3: ", "Dia 4: ", "Dia 5: ", "Dia 6: ", "Dia 7: "};
                System.out.printf(nombreDia[i] + "%.2f\n", ingresosSemana[i]);
            }
            System.out.println("____________________________________________\n\n");


            
            System.out.println("Si algún valor es erróneo pulsa R para rectificar. En caso contrario, pulsa cualquier tecla:");
            eleccion = teclado.next().toLowerCase();
            
            //Si se pulsa cualquier tecla que no sea R, se cierra el bucle
            if(!eleccion.equals("r")){
                isWrong = false;
            }     
        }    
        
        
        

        //Datos vendedores
        teclado.nextLine();
        
        while(state){
            System.out.println("Introduce el nombre del vendedor:");
            String nombreVendedor = teclado.nextLine();
            
            //Si el nombre está vacío, no entra al bucle
            if(nombreVendedor.equalsIgnoreCase("")){
                state = false;
            }
            
            else{
                datosVendedores.add(new ArrayList());
                datosVendedores.get(contadorVendedores).add(nombreVendedor);
                
                System.out.println("Introduce los apellidos del vendedor:");
                String apellidosVendedor = teclado.nextLine();
                datosVendedores.get(contadorVendedores).add(apellidosVendedor);
                
                System.out.println("Introduce la edad del vendedor:");
                int edadVendedor = teclado.nextInt();
                datosVendedores.get(contadorVendedores).add(edadVendedor);
                
                System.out.println("Introduce el teléfono del vendedor:");
                int telefonoVendedor = teclado.nextInt();
                datosVendedores.get(contadorVendedores).add(telefonoVendedor);
                
                teclado.nextLine();
                System.out.println("Introduce la población del vendedor:");
                String poblacionVendedor = teclado.nextLine();
                datosVendedores.get(contadorVendedores).add(poblacionVendedor);
                
                contadorVendedores ++;
            }
        }
        
        
        
        
        //Mostramos todos los vendedores con sus respectivos datos y, si hay un vendedor como mínimo, cambio el teléfono del primer vendedor:
        if(datosVendedores.size() == 0){
            System.out.println("\n----------------------");
            System.out.println("No hay ningún vendedor");
            System.out.println("----------------------\n");
        }

        else{
            System.out.println("\n\nEn total hay " + datosVendedores.size() + " vendedores");
            
            for (int i = 0; i < datosVendedores.size(); i++) {
                System.out.println("\n####################");
                System.out.println("Datos del vendedor " + (i+1));
                
                for (int j = 0; j < 5; j++) {
                    String titulares[]={"NOMBRE: ", "APELLIDOS: ", "EDAD: ", "TELÉFONO: ", "POBLACIÓN: "};
                    System.out.println(titulares[j] + datosVendedores.get(i).get(j));
                }
                System.out.println("####################\n");
            }
    
            //Cambio del teléfono del primer empleado e impresión de sus datos
            System.out.println("Introduce el nuevo teléfono del primer vendedor:");
            int nuevoTelefonoVendedor = teclado.nextInt();
            datosVendedores.get(0).remove(3);
            datosVendedores.get(0).add(3, nuevoTelefonoVendedor);
    
            //Imprimo los datos del primer vendedor
            System.out.println("\n####################");
            System.out.println("Datos del vendedor 1");
            for (int j = 0; j < 5; j++) {
                String titulares[]={"NOMBRE: ", "APELLIDOS: ", "EDAD: ", "TELÉFONO: ", "POBLACIÓN: "};
                System.out.println(titulares[j] + datosVendedores.get(0).get(j));
            }
            System.out.println("####################\n");
        }

        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
