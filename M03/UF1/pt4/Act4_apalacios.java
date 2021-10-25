import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act4_apalacios {
    public static void main(String[] args) throws Exception {
        
        /* ------- EJERCICIO 1 ------- */ System.out.println("----- EJERCICIO 1 -----");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la velocidad a la que se circulaba:");
        int velocidadEj1 = teclado.nextInt();

        System.out.println("Introduce la velocidad máxima del tramo:");
        int limiteEj1 = teclado.nextInt();

        while(true){

            if(limiteEj1 == 30){
                if(velocidadEj1 > 30 && velocidadEj1 <=50){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 50 && velocidadEj1 <=60){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 60 && velocidadEj1 <=70){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 80){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 40){
                if(velocidadEj1 > 40 && velocidadEj1 <=60){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 60 && velocidadEj1 <=70){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 80 && velocidadEj1 <=90){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 90){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 50){
                if(velocidadEj1 > 50 && velocidadEj1 <=70){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 80 && velocidadEj1 <=90){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 90 && velocidadEj1 <=100){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 100){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 60){
                if(velocidadEj1 > 60 && velocidadEj1 <=90){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 90 && velocidadEj1 <=100){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 110 && velocidadEj1 <=120){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 120 && velocidadEj1 <=130){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 130){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 70){
                if(velocidadEj1 > 70 && velocidadEj1 <=100){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 100 && velocidadEj1 <=120){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 120 && velocidadEj1 <=130){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 130 && velocidadEj1 <=140){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 140){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 80){
                if(velocidadEj1 > 80 && velocidadEj1 <=110){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 110 && velocidadEj1 <=130){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 130 && velocidadEj1 <=140){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 140 && velocidadEj1 <=150){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 150){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 90){
                if(velocidadEj1 > 90 && velocidadEj1 <=120){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 120 && velocidadEj1 <=140){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 140 && velocidadEj1 <=150){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 150 && velocidadEj1 <=160){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 160){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 100){
                if(velocidadEj1 > 100 && velocidadEj1 <=130){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 130 && velocidadEj1 <=150){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 150 && velocidadEj1 <=160){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 160 && velocidadEj1 <=170){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 170){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 110){
                if(velocidadEj1 > 110 && velocidadEj1 <=140){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 140 && velocidadEj1 <=160){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 160 && velocidadEj1 <=170){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 170 && velocidadEj1 <=180){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 180){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else if(limiteEj1 == 120){
                if(velocidadEj1 > 120 && velocidadEj1 <=150){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 100€ sin retirada de puntos.");
                }
    
                else if(velocidadEj1 > 150 && velocidadEj1 <=170){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 300€ con retirada de 2 puntos.");
                }
    
                else if(velocidadEj1 > 170 && velocidadEj1 <=180){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 400€ con retirada de 4 puntos.");
                }
    
                else if(velocidadEj1 > 180 && velocidadEj1 <=190){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 500€ con retirada de 6 puntos.");
                }
    
                else if(velocidadEj1 > 190){
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción será de 600€ con retirada de 6 puntos.");
                }
    
                else{
                    System.out.println("\nConduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
                }
                break;
            }
    
            else{
                System.out.println("\nIntroduce un límite de velocidad que sea válido (30km/h, 40km/h, 50km/h, 60km/h, 70km/h, 80km/h, 90km/h, 100km/h, 110km/h o 120km/h)");
                limiteEj1 = teclado.nextInt();
            }
        }
        







        /* ------- EJERCICIO 2 ------- */ System.out.println("\n\n----- EJERCICIO 2 -----");
        
        Calendar calendar = Calendar.getInstance();
        int añoActualEj2 = calendar.get(Calendar.YEAR);
        int cursosRepetidosEj2 = 0;
       

        System.out.println("Introduce tu nombre:");
        String nombreEj2 = teclado.next();

        System.out.println("Introduce tu edad:");
        int edadEj2 = teclado.nextInt();

        System.out.println("¿Aprovaste la ESO? [true o false]");
        boolean esoEj2 = teclado.nextBoolean();

        System.out.println("¿Repetiste algún curso? [true o false]");
        boolean cursoEj2 = teclado.nextBoolean();
       
        if(cursoEj2){
            System.out.println("¿Cuántos cursos repetiste?");
            cursosRepetidosEj2 = teclado.nextInt();
        }

        int resultadoEj2 = añoActualEj2 - (edadEj2 - (16 + cursosRepetidosEj2));

        
        if(esoEj2){
            if(!cursoEj2){
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, tiene aprovada la ESO, no repitió ninguna vez y acabó en el año " + resultadoEj2);
            }

            else{
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, tiene aprovada la ESO, repitió " + cursosRepetidosEj2 + " vez/es y acabó en el año " + resultadoEj2);
            }
        }

        else{
            if(!cursoEj2){
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, no tiene aprovada la ESO y no repitió ninguna vez");
            }

            else{
                System.out.println("\n" + nombreEj2 + " tiene " + edadEj2 + " años, no tiene aprovada la ESO y repitió " + cursosRepetidosEj2 + " vez/es");
            }
        }
        







        /* ------- EJERCICIO 3 ------- */ System.out.println("\n\n----- EJERCICIO 3 -----");
        
        float cuentaEj3 = 0;
        ArrayList<String> ingredientes = new ArrayList<String>();
        

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
            ingredientes.add("Extra Queso");
        }

        System.out.println("¿Deseas añadir champiñones? [true o false]");
        boolean complemento2Ej3 = teclado.nextBoolean();
        if(complemento2Ej3){
            cuentaEj3 = cuentaEj3 + 0.5f;
            ingredientes.add("Champiñones");
        }

        System.out.println("¿Deseas añadir salmón? [true o false]");
        boolean complemento3Ej3 = teclado.nextBoolean();
        if(complemento3Ej3){
            cuentaEj3 = cuentaEj3 + 1;
            ingredientes.add("Salmón");
        }

        System.out.println("\nHas pedido una pizza " + pizzaEj3 + " con los siguientes extras:");

        for (int i = 0; i < ingredientes.size(); i++){
            System.out.println("- " + ingredientes.get(i));
        }

        System.out.println("Total: " + cuentaEj3 + "€");
        








        /* ------- EJERCICIO 4 ------- */ System.out.println("\n\n----- EJERCICIO 4 -----");
        
        System.out.println("¿Qué dia de la semana deseas reservar cita?");
        String diaEj4 = teclado.next().toLowerCase();
        

        while(diaEj4.equals("sabado") || diaEj4.equals("domingo") ){
            System.out.println("No damos servicio los fines de semana. Porfavor, introduce otro dia:");
            diaEj4 = teclado.next().toLowerCase();
        }
        
        System.out.println("¿Qué turno prefieres? [mañana o tarde]");
        String turnoEj4 = teclado.next().toLowerCase();

        // entra si la cita es el (martes o el jueves por la tarde) o (fines de semana)
        while((((diaEj4.equals("martes") || diaEj4.equals("jueves")) && turnoEj4.equals("tarde"))) || (diaEj4.equals("sabado") || diaEj4.equals("domingo"))){ 
            
            if(diaEj4.equals("sabado") || diaEj4.equals("domingo")){
                System.out.println("No damos servicio los fines de semana. Porfavor, introduce otro dia:");
                diaEj4 = teclado.next().toLowerCase();
            }

            else if((diaEj4.equals("martes") || diaEj4.equals("jueves")) && turnoEj4.equals("tarde")){
                System.out.println("No damos servicio los " + diaEj4 + " por la tarde. ¿Deseas coger el turno de mañana? [Si o No]:");
                String respuestaTurnoEj4 = teclado.next().toLowerCase();
                
                if(respuestaTurnoEj4.equals("no")){
                    turnoEj4 = "tarde";
                    System.out.println("Introduce otro dia:");
                    diaEj4 = teclado.next().toLowerCase();
                }else{
                    turnoEj4 = "mañana";
                    break;
                }
            }
        }

        System.out.println("¿Qué tipo de animal requiere asistencia?");
        String animalEj4 = teclado.next().toLowerCase();

        while(diaEj4.equals("miercoles") && !animalEj4.equals("perro")){
            System.out.println("Los miercoles solo damos servicio a los perros. Por favor, introduce otro día:");
            diaEj4 = teclado.next().toLowerCase();

            if(diaEj4.equals("martes") || diaEj4.equals("jueves")){
                turnoEj4 = "mañana";
            }
        }

        System.out.println("\n" + "Visita concertada el " + diaEj4 + " por la " + turnoEj4 + " para el animal " + animalEj4);
        








        /* ------- EJERCICIO 5 ------- */ System.out.println("\n\n----- EJERCICIO 5 -----");
        
        float descuentoEj5 = 0;
        float precioDiaEj5 = 0;
        String estadoEj5 = "no tiene";
        
        System.out.println("¿Qué dia de la semana deseas reservar entrada?");
        String diaEj5 = teclado.next().toLowerCase();
        
        System.out.println("Introduce tu edad:");
        int edadEj5 = teclado.nextInt();

        System.out.println("¿Tienes tarjeta de abono? [true o false]");
        boolean abonoEj5 = teclado.nextBoolean();


        if(abonoEj5 == false && (edadEj5 < 8 || edadEj5 > 65)){
            descuentoEj5 = 1.5f;
        }


        if(abonoEj5 && (diaEj5.equals("lunes") || diaEj5.equals("martes") || diaEj5.equals("miercoles") || diaEj5.equals("jueves") || diaEj5.equals("viernes"))){
            if(edadEj5 < 8 || edadEj5 > 65){
                descuentoEj5 = 1.5f; //Prevalece mayor descuento que es el de edad (1,5€)
            }
            else{
                descuentoEj5 = descuentoEj5 + 1;
            }
            estadoEj5 = "tiene";
        }

        else if(abonoEj5 == true && (diaEj5.equals("sabado") || diaEj5.equals("domingo"))){
            if(edadEj5 < 8 || edadEj5 > 65){
                descuentoEj5 = 2; //Prevalece mayor descuento que es el del bono (2€)
            }
            else{
                descuentoEj5 = descuentoEj5 + 2;
            }
            estadoEj5 = "tiene";
        }


        if(diaEj5.equals("lunes") || diaEj5.equals("martes") || diaEj5.equals("miercoles") || diaEj5.equals("jueves") || diaEj5.equals("viernes")){
            precioDiaEj5 = 6;
        }
        
        else if(diaEj5.equals("sabado") || diaEj5.equals("domingo")){
            precioDiaEj5 = 8;
        }

        System.out.println("\n" + "El cliente de " + edadEj5 + " años " + estadoEj5 + " abono y su entrada es para el " + diaEj5 + " con precio de " + (precioDiaEj5 - descuentoEj5) + "€");

        


        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
