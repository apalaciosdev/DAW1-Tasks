import java.util.*;
import java.lang.*;

public class Act1_apalacios {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int respuesta = 0;
        boolean value = true;

        String alfabeto[] = { "a", "b", "c", "ç"/* ISO-8859-1 */, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9" };

        ArrayList<Integer> posicionesCifraje = new ArrayList<Integer>();
        ArrayList<Integer> posicionesDescifraje = new ArrayList<Integer>();



        while (value) {
            System.out.println("\n\n-------Introduce la operación deseada-------" +
                    "\n  1.- Cifrar mensaje" +
                    "\n  2.- Descifrar mensaje" +
                    "\n  3.- Salir del programa" +
                    "\n\nSelecciona un número");

            respuesta = teclado.nextInt();




            // OPERACIÓN 1  -  CIFRAJE
            if (respuesta == 1) {
                teclado.nextLine();
                System.out.println("Introduce el mensaje secreto:");
                String mensajeSecreto = teclado.nextLine().toLowerCase();

                System.out.println("Introduce la clave secreta:");
                int claveSecreta = teclado.nextInt();

                char[] mensajeSinCifrar = mensajeSecreto.toCharArray();

                for (int i = 0; i < mensajeSinCifrar.length; i++) {
                    String caracter = Character.toString(mensajeSinCifrar[i]);

                    // Averiguamos posicion de alfabeto (x es posicion del caracter)
                    for (int x = 0; x < alfabeto.length; x++) {
                        if (caracter.equals(alfabeto[x])) {
                            System.out.println("Posicion en alfabeto" + x);
                            posicionesCifraje.add(i, x + claveSecreta);

                            while ((posicionesCifraje.get(i)) > 37) { // si la posicion sobrepasa 37
                                int posicion = (posicionesCifraje.get(i) - 38);
                                posicionesCifraje.set(i, posicion);
                            }
                        }
                    }

                }

                // Resultado Final
                for (int i = 0; i < posicionesCifraje.size(); i++) {
                    System.out.print(alfabeto[posicionesCifraje.get(i)]);
                }
                posicionesCifraje.clear();
            }




            // OPERACIÓN 2
            else if (respuesta == 2) {
                teclado.nextLine();
                System.out.println("Introduce el mensaje cifrado:");
                String mensajeSecretoCifrado = teclado.nextLine().toLowerCase();

                System.out.println("Introduce la clave secreta:");
                int claveSecreta = teclado.nextInt();

                char[] mensajeConCifrado = mensajeSecretoCifrado.toCharArray();

                for (int i = 0; i < mensajeConCifrado.length; i++) {
                    String caracter = Character.toString(mensajeConCifrado[i]);

                    // Averiguamos posicion de alfabeto (x es posicion del caracter)
                    for (int x = 0; x < alfabeto.length; x++) {
                        if (caracter.equals(alfabeto[x])) {
                            posicionesDescifraje.add(i, x - claveSecreta);

                            while (posicionesDescifraje.get(i) < 0) { // si la posicion sobrepasa 37
                                int contador = Math.abs(posicionesDescifraje.get(i));
                                int posicion = ((posicionesDescifraje.get(i) + contador) + (38 - contador));
                                posicionesDescifraje.set(i, posicion);
                            }
                        }
                    }

                }

                // Resultado Final
                for (int i = 0; i < posicionesDescifraje.size(); i++) {
                    System.out.print(alfabeto[posicionesDescifraje.get(i)]);
                }

                posicionesDescifraje.clear();
            }




            // OPERACIÓN 3  -  DESCIFRAJE
            else if (respuesta == 3) {
                value = false;
            }




            // OPERACIÓN NO VÁLDA
            else {
                System.out.println("\n\n------------------------------------------");
                System.out.println("Operación no válida. Selecciona nuevamente");
                System.out.println("------------------------------------------\n");
            }
        }



        
        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}
