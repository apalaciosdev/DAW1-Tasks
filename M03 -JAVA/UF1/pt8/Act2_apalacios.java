import java.util.*;
import java.lang.*;


public class Act2_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);   
        
        ArrayList <ArrayList> arraylist1 = new ArrayList<>();
      
        boolean añadirAsistente = false;
        int contadorPacientes = 0;
        
        do {
            arraylist1.add(new ArrayList());
            System.out.println("Introduce el nombre del asistente:");
            String nombreAsistente = teclado.next();
            arraylist1.get(contadorPacientes).add(nombreAsistente);
            
            
            System.out.println("Introduce su edad:");
            int edadAsistente = teclado.nextInt();
            arraylist1.get(contadorPacientes).add(edadAsistente);
            

            System.out.println("Introduce los dias que lleva sin beber:");
            int diasSequiaAsistente = teclado.nextInt();
            arraylist1.get(contadorPacientes).add(diasSequiaAsistente);
            
            
            System.out.println("Quieres añadir a alguien más? (true/false)");
            añadirAsistente = teclado.nextBoolean();
            contadorPacientes ++;
        } while (añadirAsistente);
        
        
        
        System.out.println("\n\nEn total han asistido " + contadorPacientes + " personas.");
        
        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println("\n####################");
            System.out.println("Datos del paciente " + (i+1));
            
            for (int j = 0; j < 3; j++) {
                String titulares[]={"NOMBRE: ", "EDAD: ", "DIAS SECO: "};
                System.out.println(titulares[j] + arraylist1.get(i).get(j));
            }
            System.out.println("####################\n");
        }
        
        
        System.out.println("¿Deseas modificar la lista? (s/n)");
        String modificarLista = teclado.next().toLowerCase();
        
        do {
            
            if(modificarLista.equals("s")){
                System.out.println("¿Que asistente deseas modificar? Introduce el número del paciente:"); 
                int modificacionAsistente = (teclado.nextInt())-1;
                

                System.out.println("Introduce su nombre:");
                String nombreAsistente = teclado.next();
                arraylist1.get(modificacionAsistente).add(0, nombreAsistente);
                
                
                System.out.println("Introduce su edad:");
                int edadAsistente = teclado.nextInt();
                arraylist1.get(modificacionAsistente).add(1, edadAsistente);
                
                
                System.out.println("Introduce los dias que lleva sin beber:");
                int diasSequiaAsistente = teclado.nextInt();
                arraylist1.get(modificacionAsistente).add(2, diasSequiaAsistente);
                

                System.out.println("¿Deseas realizar otra modificación? (s/n)");
                modificarLista = teclado.next().toLowerCase();
            }
            
        } while (modificarLista.equals("s"));
       
       
        System.out.println("¿Deseas borrar algun asistente de la lista? (s/n)");
        String borrarAsistente = teclado.next().toLowerCase();
        
        do {
            
            if(borrarAsistente.equals("s")){
                System.out.println("¿Que asistente deseas borrar? Introduce el número del paciente:");
                int asistenteEliminado = (teclado.nextInt())-1;
                
                arraylist1.remove(asistenteEliminado);

                System.out.println("¿Deseas borrar algun asistente más? (s/n)");
                borrarAsistente = teclado.next().toLowerCase();
            }
            
        } while (borrarAsistente.equals("s"));
        
        
        
        System.out.println("\n\nEn total han asistido " + contadorPacientes + " personas.");
        
        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println("\n####################");
            System.out.println("Datos del paciente " + (i+1));
            
            for (int j = 0; j < 3; j++) {
                String titulares[]={"NOMBRE: ", "EDAD: ", "DIAS SECO: "};
                System.out.println(titulares[j] + arraylist1.get(i).get(j));
            }
            System.out.println("####################\n");
        }


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
