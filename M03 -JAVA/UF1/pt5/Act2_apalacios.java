import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Act2_apalacios {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        float nota = 0;
        int aprobados = 0;
        int suspensos = 0;
        float notaTotalAprobados = 0;
        float notaTotalSuspensos = 0;
        float notaTotal = 0;
        float notaMayor = 0;
        float notaMenor = 99;
        int notasMayoresRepetidas = 0;
        int notasMenoresRepetidas = -1;

        System.out.println("Introduce el número de alumnos:");
        int alumnos = teclado.nextInt();


        for(int i = 0; i < alumnos; i++){
            System.out.println("Introduce la nota:");
            nota = teclado.nextFloat();

            
            if(nota < notaMenor){
                notaMenor = nota;
                notasMenoresRepetidas = 0;
            }
            
            if(nota == notaMenor){
                notasMenoresRepetidas +=1;
            }
            
            if(nota > notaMayor){
                notaMayor = nota;
                notasMayoresRepetidas = 0;
            }
            
            if(nota == notaMayor){
                notasMayoresRepetidas +=1;
            }
            
            
            if(nota >= 5 && nota <=10){
                aprobados ++;
                notaTotalAprobados = notaTotalAprobados + nota;
            }

            else if(nota < 5  && nota >=0){
                suspensos ++;
                notaTotalSuspensos = notaTotalSuspensos + nota;
            }  

            notaTotal = notaTotal + nota;
        }


        System.out.println("\n\nHan aprobado " + aprobados + " alumnos con una media general de " + (notaTotalAprobados / aprobados));
        System.out.println("Han suspendido " + aprobados + " alumnos con una media general de " + (notaTotalSuspensos/ suspensos));
        System.out.println("La nota media de toda la clase es: " + (notaTotal / alumnos));
        System.out.println("La nota más alta de toda la clase es: " + notaMayor + " y se ha repetido " + notasMayoresRepetidas + " vez/es");
        System.out.println("La nota más baja de toda la clase es: " + notaMenor + " y se ha repetido " + notasMenoresRepetidas + " vez/es");


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
