import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act3_apalacios {
    public static void main(String[] args) throws Exception {
        
        /* ------- EJERCICIO 3 ------- */ System.out.println("\n\n----- EJERCICIO 3 -----");
        
        Scanner teclado = new Scanner(System.in);

        float cuentaEj3 = 0;
        ArrayList<String> ingredientes = new ArrayList<String>(); //array donde van a estar los ingredientes extra
        

        System.out.println("¿Qué pizza quieres? [Margarita, Boloniesa o 3Quesos]:");
        String pizzaEj3 = teclado.next().toLowerCase();
        

        while (true) {

            if(pizzaEj3.equals("margarita")){
                cuentaEj3 = cuentaEj3 + 6;
                pizzaEj3 = "Margarita";
                break;
            }
    
            else if(pizzaEj3.equals("boloniesa")){
                cuentaEj3 = cuentaEj3 + 8;
                pizzaEj3 = "Boloniesa";
                break;
            }
    
            else if(pizzaEj3.equals("3quesos")){
                cuentaEj3 = cuentaEj3 + 9;
                pizzaEj3 = "3 Quesos";
                break;
            }

            else{
            System.out.println("\nTipo de pizza inválida. Introduce una de las siguientes: [Margarita, Boloniesa o 3Quesos]");
            pizzaEj3 = teclado.next();
            }
        }

        
        System.out.println("¿Deseas añadir de extra queso? [true o false]");
        boolean complemento1Ej3 = teclado.nextBoolean();
        if(complemento1Ej3){
            cuentaEj3 = cuentaEj3 + 0.5f;
            ingredientes.add("Extra Queso"); // añadimos este ingrediente extra al array
        }

        System.out.println("¿Deseas añadir champiñones? [true o false]");
        boolean complemento2Ej3 = teclado.nextBoolean();
        if(complemento2Ej3){
            cuentaEj3 = cuentaEj3 + 0.5f;
            ingredientes.add("Champiñones"); // añadimos este ingrediente extra al array
        }

        System.out.println("¿Deseas añadir salmón? [true o false]");
        boolean complemento3Ej3 = teclado.nextBoolean();
        if(complemento3Ej3){
            cuentaEj3 = cuentaEj3 + 1;
            ingredientes.add("Salmón"); // añadimos este ingrediente extra al array
        }


        if(ingredientes.size() == 0){ // si no hay ningún ingrediente extra en el array
            System.out.println("\nHas pedido una pizza " + pizzaEj3 + " sin extras.");
            System.out.println("Total: " + cuentaEj3 + "€");
        }


        else if(ingredientes.size() > 0){ // si hay algún ingrediente extra en el array
            System.out.println("\nHas pedido una pizza " + pizzaEj3 + " con los siguientes extras:");
            for (int i = 0; i < ingredientes.size(); i++){
                    System.out.println("- " + ingredientes.get(i));
                }    
            System.out.println("Total: " + cuentaEj3 + "€");
        }



        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
