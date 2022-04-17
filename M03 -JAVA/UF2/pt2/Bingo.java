import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Bingo{
    public static void main(String[] args) {
        menu_opcions_mode_joc();
    }

    public static int[][] omplir_tot_el_array_amb_un_numero(){

        int array_cartro_bingo[][] = new int[3][9];

        for (int i = 0; i < array_cartro_bingo.length; i++) {
            for (int j = 0; j < array_cartro_bingo[i].length; j++) {
                array_cartro_bingo[i][j] = 6; //Per que els sis?, perque és el meu numero preferit.
            }
        }
        return array_cartro_bingo;
    }

    public static void veure_array_int_bidimensional(int[][] array){
        System.out.print("\n---------------------------------------------\n");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.print(array[i][j]+ " | ");
            }
            System.out.println("\n---------------------------------------------");
        }
    }

    public static void veure_array_string_bidimensional(String[][] array){
        System.out.print("\n----------------------------------------------\n");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("| ");
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.print(array[i][j]+ " | ");
            }
            System.out.println("\n----------------------------------------------");
        }
    }

    public static void veure_array_string_tridimensional(String[][][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n----------------------------------------------\n");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("| ");
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]+ " | ");
                }
                System.out.println("\n----------------------------------------------");
            }
        }
    }

    public static int[][] afegir_uns_i_zeros(int[][] array) {

        for (int j = 0; j < 3; j++) {
            int contador_zeros = 0;
            while(contador_zeros < 3){

                int posicio_aleatori = (int)Math.floor(Math.random()*(2+1));

                array[j][posicio_aleatori + (3 * contador_zeros)] = 0; //Cada tres columnes hi afegim un 0.
                contador_zeros++;
            }
        }

        for (int j = 0; j < 3; j++) {
            int contador_uns = 0;
            while(contador_uns < 3){
                int posicio_aleatori = (int)Math.floor(Math.random()*(2+1));
                if(array[j][posicio_aleatori + (3 * contador_uns)] != 0){
                    array[j][posicio_aleatori + (3 * contador_uns)] = 1; //Cada tres columnes hi afegim un 1.
                    contador_uns++;
                }
            }
        }

        return array;
    }

    public static int[][] posicions_vuides(int[][] array) {

        //Guardem les posicions vuides en un array bidimensional.
        int posicions_vuid[][] = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            int contador = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1){
                    posicions_vuid[i][contador] = j;
                    contador++;
                }
            }
        }

        return posicions_vuid;
    }

    public static int[][] posicions_vuides2(int[][] array) {

        //Guardem les posicions vuides en un array bidimensional despres de haber ficat un zero més a cada fila.
        //Ja portem el maxim de zeros per filera.
        int posicions_vuid[][] = new int[3][2];
        
        for (int i = 0; i < 3; i++) {
            int contador = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1){
                    posicions_vuid[i][contador] = j;
                    contador++;
                }
            }
        }

        return posicions_vuid;
    }

    public static int[][] eleccio_posicio_aleatoria_entre_les_vuides(int[][] posicions_vuid){
        
        //De les posicions vuides guardades anteriorment, seleccionem una posicio aleatoria de cada filera i la guardem en l'array.
        int numero[][] = new int[3][1];

        for (int i = 0; i < posicions_vuid.length; i++) {
            int posicio_aleatori = (int)Math.floor(Math.random()*(2+1));
            int contador1 = 0;
            int contador2 = 0;
            while(contador1 < 1){
                for (int j = 0; j < posicions_vuid[i].length; j++) {

                    if (j == posicio_aleatori){
                        numero[i][contador2] = posicions_vuid[i][j];
                        contador1++;
                        contador2++;
                    }
                }
            }
        }
        return numero;
    }

    public static int[][] eleccio_posicio_aleatoria_entre_les_vuides2(int[][] posicions_vuid){
        int numero[][] = new int[3][1];

        for (int i = 0; i < posicions_vuid.length; i++) {
            int posicio_aleatori = (int)Math.floor(Math.random()*(1+1));
            int contador1 = 0;
            int contador2 = 0;
            while(contador1 < 1){
                for (int j = 0; j < posicions_vuid[i].length; j++) {

                    if (j == posicio_aleatori){
                        numero[i][contador2] = posicions_vuid[i][j];
                        contador1++;
                        contador2++;
                    }
                }
            }
            
        }
        return numero;
    }

    public static int[][] mirar_posicio_per_posar_zero(int[][] array, int[][] posicions_vuid) {  
        
        for (int i = 0; i < 3; i++) {
            int contador = 0;
            while (contador < 1){
                int numero[][] = eleccio_posicio_aleatoria_entre_les_vuides(posicions_vuid);
                for (int j = 0; j < array[i].length; j++) {  
                    if (j == numero[i][0]){
                        if(j == 0){
                            if((array[i][j + 1]) != 0 || (array[i][j + 2]) != 0){
                                array[i][j] = 0;
                                contador++;
                            }
                        }
                        else if(j == 8){
                            if((array[i][j - 1]) != 0 || (array[i][j - 2]) != 0){
                                array[i][j] = 0;
                                contador++;
                            }
                        }
                        else if(j == 7){
                            if((array[i][j - 1]) != 0 || (array[i][j - 2]) != 0){
                                array[i][j] = 0;
                                contador++;
                            }
                        }
                        else if(j == 1){
                            if((array[i][j + 1]) != 0 || (array[i][j + 2]) != 0){
                                array[i][j] = 0;
                                contador++;
                            }
                        }
                        else if( ((array[i][j + 1]) == 0 && (array[i][j + 2]) == 0) || ((array[i][j - 1]) == 0 && (array[i][j - 2]) == 0)){
                            array[i][j] = array[i][j];
                        }
                        else if(((array[i][j + 1]) != 0 || (array[i][j - 1]) != 0)){
                            array[i][j] = 0;
                            contador++;
                        }   
                    }
                }
            }
        }
        return array;
    }

    public static int[][] mirar_posicio_per_posar_un(int[][] array, int[][] posicions_vuid) {  

        for (int i = 0; i < 3; i++) {
            int contador = 0;
            int contador1 = 0;
            while ((contador < 1) && (contador1 < 3)){
                int numero[][] = eleccio_posicio_aleatoria_entre_les_vuides2(posicions_vuid);
                contador1++;
                for (int j = 0; j < array[i].length; j++) {
                    if (j == numero[i][0]){
                        if(j == 0){
                            if((array[i][j + 1]) != 1 || (array[i][j + 2]) != 1){
                                array[i][j] = 1;
                                contador++;
                            }
                        }
                        else if(j == 8){
                            if((array[i][j - 1]) != 1 || (array[i][j - 2]) != 1){
                                array[i][j] = 1;
                                contador++;
                            }
                        }
                        else if(j == 7){
                            if((array[i][j - 1]) != 1 || (array[i][j - 2]) != 1){
                                array[i][j] = 1;
                                contador++;
                            }
                        }
                        else if(j == 1){
                            if((array[i][j + 1]) != 1 || (array[i][j + 2]) != 1){
                                array[i][j] = 1;
                                contador++;
                            }
                        }
                        else if( ((array[i][j + 1]) == 1 && (array[i][j + 2]) == 1) || ((array[i][j - 1]) == 1 && (array[i][j - 2]) == 1)){
                            array[i][j] = array[i][j];
                        }

                        else if(((array[i][j + 1]) == 1 && (array[i][j - 1]) == 1)){
                            array[i][j] = array[i][j];
                        }
                        else if(((array[i][j + 1]) != 1 || (array[i][j - 1]) != 1)){
                            array[i][j] = 1;
                            contador++;
                        }   
                    }
                }
            }
            if (contador1 >= 3){
                break;
            }
        }
        return array;
    }

    public static boolean primera_verificacio_cartro(int[][] array){

        boolean repetir_cartro = false;

        if (repetir_cartro == false){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] != 0 && array[i][j] != 1){
                        if(j == 0){
                            if((array[i][j + 1]) != 1 || (array[i][j + 2]) != 1){
                                array[i][j] = 1;
                            }
                            else{
                                repetir_cartro = true;
                                break;
                            }
                        }
                        else if(j == 8){
                            if((array[i][j - 1]) != 1 || (array[i][j - 2]) != 1){
                                array[i][j] = 1;
                            }
                            else{
                                repetir_cartro = true;
                                break;
                            }
                        }
                        else if(j == 7){
                            if((array[i][j - 1]) != 1 || (array[i][j - 2]) != 1){
                                array[i][j] = 1;
                            }
                            else{
                                repetir_cartro = true;
                                break;
                            }
                        }
                        else if(j == 1){
                            if((array[i][j + 1]) != 1 || (array[i][j + 2]) != 1){
                                array[i][j] = 1;
                            }
                            else{
                                repetir_cartro = true;
                                break;
                            }
                        }
                        else if( ((array[i][j + 1]) == 1 && (array[i][j + 2]) == 1) || ((array[i][j - 1]) == 1 && (array[i][j - 2]) == 1)){
                            array[i][j] = array[i][j];
                            repetir_cartro = true;
                            break;
                        }
                        else if(((array[i][j + 1]) == 1 && (array[i][j - 1]) == 1)){
                            array[i][j] = array[i][j];
                            repetir_cartro = true;
                            break;
                        }
                        else if(((array[i][j + 1]) != 1 || (array[i][j - 1]) != 1)){
                            array[i][j] = 1;
                        } 
                    } 
                }
            }
        }
        return repetir_cartro;
    }

    public static int[][] omplir_el_que_queda_amb_uns(int[][] array){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0 && array[i][j] != 1){
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }

    public static int[][] funcio(){

        int array_omplerta[][] = omplir_tot_el_array_amb_un_numero();

        int array_afegits_uns_i_zeros[][] = afegir_uns_i_zeros(array_omplerta);

        int posicions_vuides_cartro[][] = posicions_vuides(array_afegits_uns_i_zeros);

        int array_amb_ultim_zero_afegit[][] = mirar_posicio_per_posar_zero(array_afegits_uns_i_zeros, posicions_vuides_cartro);

        int posicions_vuides_cartro_versio_2[][] = posicions_vuides2(array_amb_ultim_zero_afegit);

        int ultim_cartro_sense_verificacio[][] = mirar_posicio_per_posar_un(array_amb_ultim_zero_afegit, posicions_vuides_cartro_versio_2);

        return ultim_cartro_sense_verificacio;
    }
   
    public static int[][] cartro_amb_una_verificacio() {
        
        int array[][] = new int[3][9];

        boolean bona = false;

        while (bona == false){
            int ultim_cartro_sense_verificacio[][] = funcio();
            boolean verificacio = primera_verificacio_cartro(ultim_cartro_sense_verificacio);
            if (verificacio == false){
                int array_cartro_acabat[][] = omplir_el_que_queda_amb_uns(ultim_cartro_sense_verificacio);
                array = array_cartro_acabat.clone();
                bona = true;
            }
            else{
                bona = false;
            }
        } 
        return array;
    }

    public static boolean segona_verificacio_cartro(int[][] array) {
        
        boolean repetir_cartro = false;
    
        for (int i = 0; i < 9; i++) {
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]){
                repetir_cartro = true;
                break;
            }
        }
    
        return repetir_cartro;
    }
    
    public static int[][] cartro_amb_dos_verificacions() {
        
        int array[][] = new int[3][9];
    
        boolean bona = false;
    
        while (bona == false){
            int ultim_cartro_amb_una_verificacio[][] = cartro_amb_una_verificacio();
            boolean verificacio = segona_verificacio_cartro(ultim_cartro_amb_una_verificacio);
            if (verificacio == false){
                array = ultim_cartro_amb_una_verificacio.clone();
                bona = true;
            }
            else{
                bona = false;
            }
        } 
        return array;
    }

    public static int[][] omplir_array(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0){
                    if (j == 0){
                        array[i][j] = (int)Math.floor(Math.random()*(9-1+1)+1);
                    }
                    else{
                        if (j == 8){
                            array[i][j] = (int)Math.floor(Math.random()* (((j * 10) + 10) - (j * 10)+1) + (j * 10)  );
                        }
                        else{
                            array[i][j] = (int)Math.floor(Math.random()* (((j * 10) + 9) - (j * 10)+1) +  (j * 10)  );
                        }
                    }
                }
            }
        }
        return array;
    }

    public static int[][] si_numero_columna_repetit(int[][] array) {

        for (int i = 0; i < 9; i++) {
            if((array[0][i] != 0) && (array[1][i] != 0)){
                while (array[0][i] == array[1][i]){
                    array[0][i] = random(i);
                    
                }
            }
            else if((array[0][i] != 0) && (array[2][i] != 0)){
                while (array[0][i] == array[2][i]){
                    array[0][i] = random(i);
                }
            }
            else if((array[1][i] != 0) && (array[2][i] != 0)){
                while (array[1][i] == array[2][i]) {
                    array[1][i] = random(i);
                }
            }
        }
        return array;
    }

    public static int random(int i) {

        int random = 0;

        for (int j = 0; j < 9; j++) {
            if (j == i){
                if (j == 0){
                    random = (int)Math.floor(Math.random()*(9-1+1)+1);
                }
                else{
                    if (j == 8){
                        random = (int)Math.floor(Math.random()* (((j * 10) + 10) - (j * 10)+1) + (j * 10)  );
                    }
                    else{
                        random = (int)Math.floor(Math.random()* (((j * 10) + 9) - (j * 10)+1) +  (j * 10)  );
                    }
                }
            }
        }
        return random;
    }
    
    public static int[][] ordenar_columnes(int[][] array) {

        for (int col = 0; col < array[0].length; col++) {
            boolean swapped;
            do {
                swapped = false;
                for (int row = 0; row < array.length - 1; row++) {
                    if (array[row][col] > array[row + 1][col] && array[row][col] != 0 && array[row + 1][col] != 0 ){
                        int temporal = array[row][col];
                        array[row][col] = array[row + 1][col];
                        array[row + 1][col] = temporal;
                        swapped = true;
                    }
                }
            } while (swapped);
        }
        return array;
    }

    public static String[][] funcio_part_2(){

        int cartro_amb_la_verificacio_final[][] = cartro_amb_dos_verificacions();

        int cartro_omplert[][] = omplir_array(cartro_amb_la_verificacio_final);

        int cartro_sense_numeros_repetits[][] = si_numero_columna_repetit(cartro_omplert);

        int cartro_amb_numeros_ordenats[][] = ordenar_columnes(cartro_sense_numeros_repetits);

        String array_convertida_a_String[][] = convertir_array_de_int_a_String(cartro_amb_numeros_ordenats);


        
        return array_convertida_a_String;
    }

    public static String[][] convertir_array_de_int_a_String(int[][] array) {

        String array_string[][] = new String[3][9];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array_string[i][j] = Integer.toString(array[i][j]);
            }
        }

        for (int i = 0; i < array_string.length; i++) {
            for (int j = 0; j < array_string[i].length; j++) {

                if (((array_string[i][j].length()) == 1) && (!array_string[i][j].equals("0"))){
                    array_string[i][j] = " "+array_string[i][j];
                }
                if (array_string[i][j].equals("0")){
                    array_string[i][j] = "  ";
                }
            }
        }
        return array_string;
    }

    public static String[][][] guardar_arrays_en_array_tridimensional(){

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix quantitat jugadors: ");
        int quantitat_jugadors = input.nextInt();

        String array[][][] = new String[quantitat_jugadors][3][9];

        
        for (int i = 0; i < array.length; i++) {
            String cartro_final[][] = funcio_part_2();
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = cartro_final[j][k];
                }
            }
        }

        return array;
    }

    public static ArrayList<String> bombo(){

        ArrayList<String> bombo = new ArrayList<String>();

        for (int i = 1; i <= 90; i++){
	        bombo.add(""+i+""); 
        }

        return bombo;
    }

    public static String[][][] jugar_automatic() {
        
        Scanner input = new Scanner(System.in);

        String array [][][] = guardar_arrays_en_array_tridimensional();

        ArrayList<String> bombo = bombo();

        int contador_general = 0;
        int contador_general1 = 0;
        int jugador_guanya_linea = 0;
        int jugador_guanya_bingo = 0;
        int linea = 0;

        while (bombo.size() != 0 && contador_general1 < 1){

            Random aleatori = new Random();
            String numero_seleccionat = bombo.get(aleatori.nextInt(bombo.size()));

            bombo.remove(numero_seleccionat);

            String array_taxada [][][] = funcio_taxar_numeros(array, numero_seleccionat);

            for (int i = 0; i < array_taxada.length; i++) {
                int contador_linea_un = 0;
                int contador_linea_dos = 0;
                int contador_linea_tres = 0;
                int contador_bingo = 0;
                System.out.print("\n---------------------------------------------\n");
                for (int j = 0; j < array_taxada[i].length; j++) {
                    System.out.print("| ");
                    for (int k = 0; k < array_taxada[i][j].length; k++) {
                        if (j == 0){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_un++;
                                contador_bingo++;
                                if (contador_linea_un == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        if (j == 1){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_dos++;
                                contador_bingo++;
                                if (contador_linea_dos == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        if (j == 2){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_tres++;
                                contador_bingo++;
                                if (contador_linea_tres == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        System.out.print(array_taxada[i][j][k]+ " | ");
                    }
                    System.out.println("\n---------------------------------------------");
                }
                if (contador_general < 1){
                    if (contador_linea_un == 5 || contador_linea_dos == 5 || contador_linea_tres == 5){
                        imprimir_linia(jugador_guanya_linea, linea);                                         
                        contador_general++;
                    }
                }
                if (contador_general1 < 1){
                    if (contador_bingo == 15){
                        imprimir_bingo(jugador_guanya_bingo);                                                       
                        contador_general1++;
                        break;
                    }
                } 
            }
        }
        return array;
    }

    public static String[][][] jugar_manual() {

        Scanner input = new Scanner(System.in);

        String array [][][] = guardar_arrays_en_array_tridimensional();

        ArrayList<String> numeros_introduits = new ArrayList<String>();

        int contador_general = 0;
        int contador_general1 = 0;
        int jugador_guanya_linea = 0;
        int jugador_guanya_bingo = 0;
        int linea = 0;

        while (numeros_introduits.size() <= 90 && contador_general1 < 1){

            boolean trobar_numero = false;

            String numero = "";

            System.out.print("\n");
            System.out.print("Introdueix un numero: ");
            numero = input.nextLine();

            int num_enter = Integer.parseInt(numero);
                    
            while (num_enter > 90 || num_enter < 1){
                System.out.println("\n.....................................................................");
                System.out.println(":  Has de introduir un numero mes gran que zero y mes petit que 91  :");
                System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");

                System.out.print("Introdueix numero: ");
                numero = input.nextLine();
                num_enter = Integer.parseInt(numero);
            }

            while (trobar_numero == false){

                for (int i = 0; i < numeros_introduits.size(); i++) {
                    if (numeros_introduits.get(i).equals(numero)){
                        trobar_numero = true;
                    }
                }
                
                if (trobar_numero == true){

                    System.out.println("\n.................................................");
                    System.out.println(":  El numero "+numero+" ja l'has introduit anteriorment  :");
                    System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
                    System.out.print("\n");

                    System.out.print("Introdueix un altre numero: ");
                    numero = input.nextLine();

                    num_enter = Integer.parseInt(numero);
                    
                    while (num_enter > 90 || num_enter < 1){

                        System.out.println("\n.....................................................................");
                        System.out.println(":  Has de introduir un numero mes gran que zero y mes petit que 91  :");
                        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                        System.out.print("\n");

                        System.out.print("Introdueix numero: ");
                        numero = input.nextLine();
                        num_enter = Integer.parseInt(numero);
                    }
    
                    for (int i = 0; i < numeros_introduits.size(); i++) {
                        if (numeros_introduits.get(i).equals(numero)){
                            trobar_numero = false;
                        }
                    }
                    if (trobar_numero = false){
                        numeros_introduits.add(numero);
                    }
                }
                else if (trobar_numero == false){
                    numeros_introduits.add(numero);
                    trobar_numero = true;
                }
    
            }

            String array_taxada [][][] = funcio_taxar_numeros(array, numero);
            
            for (int i = 0; i < array_taxada.length; i++) {
                int contador_linea_un = 0;
                int contador_linea_dos = 0;
                int contador_linea_tres = 0;
                int contador_bingo = 0;
                System.out.print("\n---------------------------------------------\n");
                for (int j = 0; j < array_taxada[i].length; j++) {
                    System.out.print("| ");
                    for (int k = 0; k < array_taxada[i][j].length; k++) {
                        if (j == 0){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_un++;
                                contador_bingo++;
                                if (contador_linea_un == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        if (j == 1){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_dos++;
                                contador_bingo++;
                                if (contador_linea_dos == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        if (j == 2){
                            if (array_taxada[i][j][k].equals("XX")){
                                contador_linea_tres++;
                                contador_bingo++;
                                if (contador_linea_tres == 5){
                                    jugador_guanya_linea = i;
                                    linea = j;
                                }
                                if (contador_bingo == 15){
                                    jugador_guanya_bingo = i;
                                }
                            }
                        }
                        System.out.print(array_taxada[i][j][k]+ " | ");
                    }
                    System.out.println("\n---------------------------------------------");
                }
                if (contador_general < 1){
                    if (contador_linea_un == 5 || contador_linea_dos == 5 || contador_linea_tres == 5){
                        imprimir_linia(jugador_guanya_linea, linea);                                         
                        contador_general++;
                    }
                }
                if (contador_general1 < 1){
                    if (contador_bingo == 15){
                        imprimir_bingo(jugador_guanya_bingo);                                                       
                        contador_general1++;
                        break;
                    }
                } 
            }
        }
        return array;
    }

    public static String[][][] funcio_taxar_numeros(String[][][] array, String numero) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k].equals(numero)){
                        array[i][j][k] = "XX";
                    }
                    else if (array[i][j][k].equals(" "+numero)){
                        array[i][j][k] = "XX";
                    }
                }
            }
        }
        return array;
    }

    public static ArrayList<String> bombo_manual(){

        Scanner input = new Scanner(System.in);

        ArrayList<String> bombo = bombo();

        System.out.println("...............................................");
        System.out.println(":   Si fas Bingo introdueix la paraula BINGO  :");
        System.out.println(":   i el bombo deixara de treure més numeros  :");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.print("\n");

        while (bombo.size() != 0){

            Random aleatori = new Random();
            String numero_seleccionat = bombo.get(aleatori.nextInt(bombo.size()));

            System.out.print("                       ["+numero_seleccionat+"]\n\n");

            String bingo = "";

            bombo.remove(numero_seleccionat);

            if (bombo.size() != 0){
                System.out.print("Clica a qualsevol tecla per treure el següent numero ");
                bingo = input.nextLine();
                System.out.print("\n");
                
                if (bingo.equalsIgnoreCase("BINGO")){
                    System.out.println("...................");
                    System.out.println(":  Felicitats!!!  :");
                    System.out.println("'''''''''''''''''''");
                    break;
                }
                
            }
        }

        if (bombo.isEmpty()){
            System.out.println("...............................................");
            System.out.println(":  J'ha has tret tots els numeros del bombo.  :");
            System.out.println(":          FELICITATS AL GUANYADOR            :");
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.print("\n");
        }

        return bombo;
    }

    public static void menu_opcions_mode_joc(){

        Scanner input = new Scanner(System.in);

        boolean sortir = false;

        while (sortir == false){

            System.out.println("\n...................................................");
            System.out.println(":           SELECCIÓ MODE JOC BINGO               :");
            System.out.println(":         1 - Generar només cartrons              :");
            System.out.println(":          2 - Generar només bombo                :");
            System.out.println(":  3 - Generar cartrons i bombo (MODE AUTOMATIC)  :");
            System.out.println(":  4 - Generar cartrons i bombo (MODE MANUAL)     :");
            System.out.println(":                5 - SORTIR                       :");
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''");

            System.out.print("Tria un opcio de joc: ");
            String seleccio_mode_joc = input.nextLine();
        
            if (seleccio_mode_joc.equals("1")){
                System.out.println("\n........................................................");
                System.out.println(":  Has seleccionat la opcio 1: NOMES GENERAR CARTRONS  :");
                System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");

                veure_array_string_tridimensional(guardar_arrays_en_array_tridimensional());
            }
            else if (seleccio_mode_joc.equals("2")){
                System.out.println("\n.............................................................");
                System.out.println(":  Has seleccionat la opcio 2: NOMES GENERAR NUMEROS BOMBO  :");
                System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");

                bombo_manual();
            }
            else if (seleccio_mode_joc.equals("3")){
                System.out.println("\n................................................");
                System.out.println(":  Has seleccionat la opcio 3: MODE AUTOMATIC  :");
                System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");
                
                jugar_automatic();
            }
            else if (seleccio_mode_joc.equals("4")){
                System.out.println("\n.............................................");
                System.out.println(":  Has seleccionat la opcio 4: MODE MANUAL  :");
                System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");  

                jugar_manual();
            }
            else if (seleccio_mode_joc.equals("5")){
                System.out.println("\n........................................");
                System.out.println(":  Has seleccionat la opcio 5: SORTIR  :");
                System.out.println("''''''''''''''''''''''''''''''''''''''''");
                System.out.print("\n");
                System.out.print("Adeu!!!");
                sortir = true; 
            }
            else{
                System.out.println("\nIntrodueix un numero entre el 1 i el 5.");
                System.out.print("\n");
            }
        }
    }

    public static void imprimir_linia(int jugador, int linea){

        Scanner input = new Scanner(System.in);

        System.out.println(" _        _____   _   _   _____            ");
        System.out.println("| |      |_   _| | \\ | | |_   _|     /\\    ");
        System.out.println("| |        | |   |  \\| |   | |      /  \\   ");
        System.out.println("| |        | |   | . ` |   | |     / /\\ \\  ");
        System.out.println("| |____   _| |_  | |\\  |  _| |_   / ____ \\ ");
        System.out.println("|______| |_____| |_| \\_| |_____| /_/    \\_\\");

        System.out.println("\n....................................");
        System.out.println(":   El jugador "+(jugador + 1)+" ha cantat LINEA   :");
        System.out.println(":      a la fila "+(linea + 1)+" del cartro      :");
        System.out.println("''''''''''''''''''''''''''''''''''''");
        System.out.print("\n");

        System.out.println("Clica a qualsevol tecla per continuar...");
        input.nextLine();
    }

    public static void imprimir_bingo(int jug){

        System.out.println(" ____    _____   _   _    _____    ____  ");
        System.out.println("|  _ \\  |_   _| | \\ | |  / ____|  / __ \\ ");
        System.out.println("| |_) |   | |   |  \\| | | |  __  | |  | |");
        System.out.println("|  _ <    | |   | . ` | | | |_ | | |  | |");
        System.out.println("| |_) |  _| |_  | |\\  | | |__| | | |__| |");
        System.out.println("|____/  |_____| |_| \\_|  \\_____|  \\____/ ");


        System.out.println("\n.................................");
        System.out.println(": El jugador "+(jug+1)+" ha cantat BINGO  :");
        System.out.println("'''''''''''''''''''''''''''''''''");
        System.out.print("\n");
    }
}

