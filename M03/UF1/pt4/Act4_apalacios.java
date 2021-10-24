import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.lang.Math;


public class Act4_apalacios {
    public static void main(String[] args) throws Exception {
        
        /* ------- EJERCICIO 1 ------- */ System.out.println("----- EJERCICIO 1 -----");
        
        Scanner teclado = new Scanner(System.in);
        /*
        System.out.println("Introduce la velocidad a la que se circulaba:");
        int velocidadEj1 = teclado.nextInt();

        System.out.println("Introduce la velocidad máxima del tramo:");
        int limiteEj1 = teclado.nextInt();

        
        if(limiteEj1 == 30){
            if(velocidadEj1 > 30 && velocidadEj1 <=50){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 50 && velocidadEj1 <=60){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 60 && velocidadEj1 <=70){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 80){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 40){
            if(velocidadEj1 > 40 && velocidadEj1 <=60){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 60 && velocidadEj1 <=70){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 80 && velocidadEj1 <=90){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 90){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 50){
            if(velocidadEj1 > 50 && velocidadEj1 <=70){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 70 && velocidadEj1 <=80){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 80 && velocidadEj1 <=90){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 90 && velocidadEj1 <=100){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 100){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 60){
            if(velocidadEj1 > 60 && velocidadEj1 <=90){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 90 && velocidadEj1 <=100){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 110 && velocidadEj1 <=120){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 120 && velocidadEj1 <=130){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 130){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 70){
            if(velocidadEj1 > 70 && velocidadEj1 <=100){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 100 && velocidadEj1 <=120){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 120 && velocidadEj1 <=130){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 130 && velocidadEj1 <=140){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 140){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 80){
            if(velocidadEj1 > 80 && velocidadEj1 <=110){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 110 && velocidadEj1 <=130){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 130 && velocidadEj1 <=140){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 140 && velocidadEj1 <=150){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 150){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 90){
            if(velocidadEj1 > 90 && velocidadEj1 <=120){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 120 && velocidadEj1 <=140){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 140 && velocidadEj1 <=150){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 150 && velocidadEj1 <=160){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 160){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 100){
            if(velocidadEj1 > 100 && velocidadEj1 <=130){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 130 && velocidadEj1 <=150){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 150 && velocidadEj1 <=160){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 160 && velocidadEj1 <=170){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 170){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 110){
            if(velocidadEj1 > 110 && velocidadEj1 <=140){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 140 && velocidadEj1 <=160){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 160 && velocidadEj1 <=170){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 170 && velocidadEj1 <=180){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 180){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else if(limiteEj1 == 120){
            if(velocidadEj1 > 120 && velocidadEj1 <=150){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 100€ sin retirada de puntos.");
            }

            else if(velocidadEj1 > 150 && velocidadEj1 <=170){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 300€ con retirada de 2 puntos.");
            }

            else if(velocidadEj1 > 170 && velocidadEj1 <=180){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 400€ con retirada de 4 puntos.");
            }

            else if(velocidadEj1 > 180 && velocidadEj1 <=190){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 500€ con retirada de 6 puntos.");
            }

            else if(velocidadEj1 > 190){
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, la sanción serán de 600€ con retirada de 6 puntos.");
            }

            else{
                System.out.println("Conduciendo a " + velocidadEj1 + "km/h en zona máxima de " + limiteEj1 + "km/h, no habrá sanción ya que no se han excedido los límites de velocidad.");
            }
    
        }

        else{
            System.out.println("Introduce un límite de velocidad que sea válido (30km/h, 40km/h, 50km/h, 60km/h, 70km/h, 80km/h, 90km/h, 100km/h, 110km/h o 120km/h)");
        }*/








        /* ------- EJERCICIO 2 ------- */ System.out.println("\n\n----- EJERCICIO 2 -----");
        /*
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
                System.out.println(nombreEj2 + " tiene " + edadEj2 + ", tiene aprovada la ESO, no repitió ninguna vez y acabó en el año " + resultadoEj2);
            }

            else{
                System.out.println(nombreEj2 + " tiene " + edadEj2 + ", tiene aprovada la ESO, repitió " + cursosRepetidosEj2 + " vez/es y acabó en el año " + resultadoEj2);
            }
        }

        else{
            if(!cursoEj2){
                System.out.println(nombreEj2 + " tiene " + edadEj2 + ", no tiene aprovada la ESO y no repitió ninguna vez");
            }

            else{
                System.out.println(nombreEj2 + " tiene " + edadEj2 + ", no tiene aprovada la ESO y repitió " + cursosRepetidosEj2 + " vez/es");
            }
        }*/








        /* ------- EJERCICIO 3 ------- */ System.out.println("\n\n----- EJERCICIO 3 -----");
        /*
        float cuentaEj3 = 0;
        ArrayList<String> ingredientes = new ArrayList<String>();
        

        System.out.println("¿Qué pizza quieres? Escoje el número: Margarita[1], Boloniesa[2] o 3 quesos[3]");
        int pizzaEj3 = teclado.nextInt();
        String tipoPizza = "";
        
        while (true) {

            if(pizzaEj3 == 1){
                cuentaEj3 = cuentaEj3 + 6;
                tipoPizza = "Margarita";
                break;
            }
    
            else if(pizzaEj3 == 2){
                cuentaEj3 = cuentaEj3 + 8;
                tipoPizza = "Boloniesa";
                break;
            }
    
            else if(pizzaEj3 == 3){
                cuentaEj3 = cuentaEj3 + 9;
                tipoPizza = "3 quesos";
                break;
            }

            else{
            System.out.println("¿Qué pizza quieres? Escoje el número: Margarita[1], Boloniesa[2] o 3 quesos[3]");
            pizzaEj3 = teclado.nextInt();
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

        System.out.println("Has pedido una pizza " + tipoPizza + " con los siguientes extras:");

        for (int i = 0; i < ingredientes.size(); i++){
            System.out.println(ingredientes.get(i));
        }

        System.out.println("Total: " + cuentaEj3 + "€");
        */








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

        System.out.println("Visita concertada el " + diaEj4 + " por la " + turnoEj4 + " para el animal " + animalEj4);

        

        





       
    
    
    
        

        














































        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
