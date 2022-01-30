import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in, "UTF-8");   
        
        ArrayList<String> pacientes = new ArrayList<String>();
        boolean state = true;
        int pacientesRegistrados = 0;
        
        
        //Introducimos los 4 primeros pacientes
        for(int i = 0; i < 4; i++){
            System.out.print("Introduce el nombre del paciente "+ (i+1) + ":");
            String nombrePaciente = teclado.nextLine();
            pacientes.add(nombrePaciente);
            pacientesRegistrados ++;
        }
        
        
        
        while(state && pacientesRegistrados < 10){
            
            //Medico trata a paciente
            System.out.print("La doctora cura al paciente "+ pacientes.remove(0) + "\n");
            
            System.out.print("Introduce el nombre del siguiente paciente:");
            String nombrePaciente = teclado.nextLine();
            pacientesRegistrados ++;

            
            //Si no se introduce nada en el input
            if(nombrePaciente.equalsIgnoreCase("")){
                System.out.println("La jornada termina por hoy. La doctora tratará al resto de pacientes.");
                state = false;
            }


            //Colar pacientes
            System.out.print("¿Deseas colar al paciente? (s/n)");
            String opt = teclado.nextLine().toLowerCase();
            if(opt.equals("s")){
                pacientes.add(0, nombrePaciente);
            } else {
                pacientes.add(nombrePaciente);
            }
            
        }
        
        System.out.println("La jornada ha terminado por hoy. La doctora tratará al resto de pacientes.");
        
        
    
        


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
