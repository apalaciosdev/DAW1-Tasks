import java.util.*;
import java.lang.*;


public class Act1_apalacios {
    public static void main(String[] args) throws Exception {

        /*
      

        Per desxifrar el missatge caldrà demanar per teclat un nº que serà la clau secreta i que ens permetrà 
        aplicar un desplaçament de X caselles endavant per transformar la lletra original de l’alfabet xifrat en la lletra 
        real del missatge que volem obtenir. (Si apliqueu al desplaçament un mòdul 38, quan superi el nº 38 tornarà a començar 
        l’array de l’alfabet)
        */  

        /*
         arr[2] = 30;
         int intArray[];
         int[] intArray = new int[20]
        */

        Scanner teclado = new Scanner(System.in, "UTF-8");   
        

        //Scanner teclado = new Scanner(System.in);                                                                                                             //28                                                38
        String alfabeto[]={"a","b","c", "�"/*ISO-8859-1*/, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        ArrayList<Integer> posicionesCifraje = new ArrayList<Integer>();
        ArrayList<Integer> posicionesDescifraje = new ArrayList<Integer>();

    
        //-------------Cifraje----------------
        /*
        System.out.println("Introduce el mensaje secreto:");
        String mensajeSecreto = teclado.nextLine().toLowerCase();

        System.out.println("Introduce la clave secreta:");
        int claveSecreta = teclado.nextInt();

        char[] mensajeSinCifrar=mensajeSecreto.toCharArray();
        


        for (int i = 0; i < mensajeSinCifrar.length; i++) {
            String caracter = Character.toString(mensajeSinCifrar[i]);

            //Averiguamos posicion de alfabeto  (x es posicion del caracter)
            for(int x = 0; x < alfabeto.length; x++){
                if(caracter.equals(alfabeto[x])){
                    System.out.println("Posicion en alfabeto" + x);
                    posicionesCifraje.add(i, x+claveSecreta);

     
                    while((posicionesCifraje.get(i)) > 37){  //si la posicion sobrepasa 37
                        int posicion = (posicionesCifraje.get(i) - 38);
                        posicionesCifraje.set(i, posicion);
                    }
                }
            }
            
        }
        */
        
        //-------------Descifraje----------------

        System.out.println("Introduce el mensaje cifrado:");
        String mensajeSecretoCifrado = teclado.nextLine().toLowerCase();
       

        System.out.println("Introduce la clave secreta:");
        int claveSecreta = teclado.nextInt();

        char[] mensajeConCifrado=mensajeSecretoCifrado.toCharArray();
        
        // T2XYIT4ID7BCAYI8A7ZYBB7AITIBTUYAI916IX1TIBYATIY4IKAIX15Y6 YIXY4ILJMJ

        for (int i = 0; i < mensajeConCifrado.length; i++) {
            String caracter = Character.toString(mensajeConCifrado[i]);

            //Averiguamos posicion de alfabeto  (x es posicion del caracter)
            for(int x = 0; x < alfabeto.length; x++){
                if(caracter.equals(alfabeto[x])){
                    //System.out.println("Posicion en alfabeto" + x);
                    posicionesDescifraje.add(i, x-claveSecreta);
                    
                    while(posicionesDescifraje.get(i) < 0){  //si la posicion sobrepasa 37
                        int contador = Math.abs(posicionesDescifraje.get(i));
                        int posicion = ((posicionesDescifraje.get(i) + contador) + (38-contador));
                        posicionesDescifraje.set(i, posicion);
                    }
                }
            }
            
        }
        
        

        //Resultado Final
        for(int i = 0; i < posicionesDescifraje.size(); i++) {
            System.out.println("resultado ---> " + alfabeto[posicionesDescifraje.get(i)]);
        }
        //System.out.println("resultado ---> " + alfabeto[posicionesDescifraje.get(0)]);
       
        


        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
