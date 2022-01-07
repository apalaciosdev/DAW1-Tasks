import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act5_apalacios {
    public static void main(String[] args) throws Exception {
        
        /* ------- EJERCICIO 5 ------- */ System.out.println("\n\n----- EJERCICIO 5 -----");
        
        Scanner teclado = new Scanner(System.in);
        
        float descuentoEj5 = 0;
        float precioDiaEj5 = 0;
        String estadoEj5 = "no tiene";
        
        System.out.println("¿Qué dia de la semana deseas reservar entrada?");
        String diaEj5 = teclado.next().toLowerCase();
        
        System.out.println("Introduce tu edad:");
        int edadEj5 = teclado.nextInt();

        System.out.println("¿Tienes tarjeta de abono? [true o false]");
        boolean abonoEj5 = teclado.nextBoolean();


        while(true){

            if(abonoEj5 == false && (edadEj5 < 8 || edadEj5 > 65)){
                descuentoEj5 = 1.5f;
                break;
            }
    
    
            if(abonoEj5 && (diaEj5.equals("lunes") || diaEj5.equals("martes") || diaEj5.equals("miercoles") || diaEj5.equals("jueves") || diaEj5.equals("viernes"))){
                if(edadEj5 < 8 || edadEj5 > 65){
                    descuentoEj5 = 1.5f; //Prevalece mayor descuento que es el de edad (1,5€)
                }
                else{
                    descuentoEj5 = descuentoEj5 + 1;
                }
                estadoEj5 = "tiene";
                break;
            }
    
            else if(abonoEj5 && (diaEj5.equals("sabado") || diaEj5.equals("domingo"))){
                if(edadEj5 < 8 || edadEj5 > 65){
                    descuentoEj5 = 2; //Prevalece mayor descuento que es el del bono (2€)
                }
                else{
                    descuentoEj5 = descuentoEj5 + 2;
                }
                estadoEj5 = "tiene";
                break;
            }
            
            else{
                System.out.println("\n" + diaEj5 + "no es un día válido. Introduce un dia de la semana válido");
                diaEj5 = teclado.next().toLowerCase();
            }
        }


        if(diaEj5.equals("lunes") || diaEj5.equals("martes") || diaEj5.equals("miercoles") || diaEj5.equals("jueves") || diaEj5.equals("viernes")){
            precioDiaEj5 = 6; // precio de entre semana
        }
        
        else if(diaEj5.equals("sabado") || diaEj5.equals("domingo")){
            precioDiaEj5 = 8; // precio de fin de semana
        }


        System.out.println("\n" + "El cliente de " + edadEj5 + " años " + estadoEj5 + " abono y su entrada es para el " + diaEj5 + " con precio de " + (precioDiaEj5 - descuentoEj5) + "€");
        


        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
