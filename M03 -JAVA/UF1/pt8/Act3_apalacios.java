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
        state=true;
        
        

        //comprobamos si un alumno está en la lista
        while(state){
            System.out.println("\n\n¿Deseas comprobar si algún alumno está en la lista? (s/n)");
            String eleccion = teclado.nextLine().toLowerCase();
           
            while(eleccion.equals("s")){
                System.out.println("Introduce el nombre del alumno:");
                String alumno = teclado.nextLine();
                
                if(alumno.equalsIgnoreCase("")) {  eleccion="n"; }

                else{
                    if(alumnos.contains(alumno)){
                        System.out.println(alumno + " está inscrito en la posición " + alumnos.indexOf(alumno));
                        eleccion="n";
                    }
    
                    else{
                        System.out.println("El alumno introducido no existe o no está en la lista. Prueba de nuevo o deja en blanco para salir.\n");
                    }
                }
            }
            state=false;
        }
        state=true;
    
      

        //introducimos a un alumno que se ha inscrito a última hora
        System.out.println("\n\n¿Deseas añadir a algún alumno en la lista? (s/n)");
        String eleccionInscribir = teclado.nextLine().toLowerCase();
    
        if(eleccionInscribir.equals("s")){
            System.out.println("Introduce el nombre del alumno:");
            String alumno = teclado.nextLine();
            
            alumnos.add(alumno);
            System.out.println("Nombres de los alumnos: " );
            for (String nombreAlumno : alumnos) {
                System.out.println(nombreAlumno);
            }
        }
    
      

        //sustituimos a un alumno enfermo por uno nuevo
        System.out.println("¿Deseas sustituir a algún alumno enfermo? (s/n)");
        String eleccionEnfermo = teclado.nextLine().toLowerCase();
    
        if(eleccionEnfermo.equals("s")){
            System.out.println("Introduce el nombre del alumno enfermo:");
            String alumnoEnfermo = teclado.nextLine();

            if(alumnos.contains(alumnoEnfermo)){
                System.out.println("Introduce el nombre del nuevo alumno:");
                String nuevoAlumno = teclado.nextLine();

                int posicionAlumnoEnfermo = alumnos.indexOf(alumnoEnfermo);
                alumnos.set(posicionAlumnoEnfermo, nuevoAlumno);

            }

            System.out.println("Nombres de los alumnos: " );
            for (String nombreAlumno : alumnos) {
                System.out.println(nombreAlumno);
            }
        }
 
     

        //comprobamos si vamos al Camp Nou
        if(lugares.contains("Camp Nou")){
            System.out.println("Iremos al Camp Nou");

            System.out.println("Lugares que visitaremos: " );
            for (String lugar : lugares) {
                System.out.println(lugar);
            }
        }
        
        else{
            System.out.println("Al principio no ibamos a ir al Camp Nou, pero ahora sí.");
            lugares.add(1, "Camp Nou");

            System.out.println("Lugares que visitaremos: " );
            for (String lugar : lugares) {
                System.out.println(lugar);
            }
        }



        //borrar el Museo Picasso si existe
        if(lugares.contains("Museo Picasso")){
            System.out.println("No iremos al Museo Picasso por obras");

            int posicionMuseo = lugares.indexOf("Museo Picasso");
            lugares.remove(posicionMuseo);

            System.out.println("Lugares que visitaremos: " );
            for (String lugar : lugares) {
                System.out.println(lugar);
            }
        }
        

        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
