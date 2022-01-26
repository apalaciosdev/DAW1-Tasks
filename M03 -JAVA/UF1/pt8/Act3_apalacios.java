import java.util.*;
import java.lang.*;


public class Act3_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in); 
        boolean state = true;  
        
        ArrayList<String> lugares = new ArrayList<String>();
        ArrayList<String> alumnos = new ArrayList<String>();
      


        //introducimos a los alumnos
        while(state){
            System.out.println("Introduce el nombre del sitio:");
            String sitio = teclado.nextLine();
            lugares.add(sitio);
            
            if(sitio.equalsIgnoreCase("")){
                state = false;

                System.out.println("En total visitaremos " + lugares.size() + " sitios");
                System.out.println("Lugares que visitaremos: " );
                for (String lugar : lugares) {
                    System.out.println(lugar);
                }
            } 

        }
        state=true;



        //introducimos a los alumnos
        while(state){
            System.out.println("Introduce el nombre del alumno:");
            String alumno = teclado.nextLine();
            alumnos.add(alumno);
            
            if(alumno.equalsIgnoreCase("")){
                state = false;
                
                System.out.println("En total asistiran " + alumnos.size() + " alumnos");
                System.out.println("Nombres de los alumnos: " );
                for (String nombreAlumno : alumnos) {
                    System.out.println(nombreAlumno);
                }
            } 
        }

        

        //comprobamos si está Manel
        if(alumnos.contains("Manel")){
            System.out.println("Manel está en la posición " + alumnos.indexOf("Manel"));
        }

        //añadimos a Maria y mostramos la lista de alumnos
        alumnos.add("Maria");
        for (String nombreAlumno : alumnos) {
            System.out.println(nombreAlumno);
        }



        
        //indexOf()
        //contains()

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
