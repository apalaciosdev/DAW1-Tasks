import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Act1_apalacios {
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
    
            else{ // si ningún limite de velocidad es válido, introduce uno que lo sea y repite el bucle para validarlo
                System.out.println("\nIntroduce un límite de velocidad que sea válido (30km/h, 40km/h, 50km/h, 60km/h, 70km/h, 80km/h, 90km/h, 100km/h, 110km/h o 120km/h)");
                limiteEj1 = teclado.nextInt();
            }
        }
        
        

        System.out.println("---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
