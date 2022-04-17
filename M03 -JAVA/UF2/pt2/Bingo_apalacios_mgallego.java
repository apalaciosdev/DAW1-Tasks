import java.util.*;
import java.lang.*;
import java.lang.Math;

public class Bingo_apalacios_mgallego {

  public static Scanner sc = new Scanner(System.in, "UTF-8");
  public static int carton[][] = new int[3][9]; // horizonal(fila)[j] - vertical(columna)[i]
  public static ArrayList<int[][]> cartones = new ArrayList<int[][]>();

  public static void main(String[] args) throws Exception {

    System.out.println("\n\n---------------- BINGO ANTOJITOS ----------------");

    int num = 0;
    boolean bucle = true;

    System.out.println("1- Generar solo cartones");
    System.out.println("2- Generar solo bombo");
    System.out.println("3- Generar cartones y bombo");
    System.out.println("4- Salir");

    while (bucle) {
      System.out.println("");
      System.out.println("Introduce número: ");
      num = sc.nextInt();
      

      if (num == 1) {
        String todosCartones[][][] = guardar_arrays_en_array_tridimensional();
        
        veure_array_string_tridimensional(todosCartones);
      }

      else if (num == 2) {
        crearBombo();
      }

      else if (num == 3) {
        crearAmbos();
      }

      else if (num == 4) {
        bucle = false;
      }

      else {
        System.out.println("OPCIÓN NO DISPONIBLE, INTENTELO DE NUEVO");
      }
    }

    System.out.println("\n\n---------------- MUCHAS GRACIAS POR JUGAR ----------------");
    System.out.println("----------------- Marc Gallego || Aaron Palacios  -----------------");
  }

  public static int[][] crearUnCarton() {
    boolean isValid = false;
    int array[][] = new int[3][9];
   
    // Hay que limpiar el carton

    crearEstructuraCarton();
    isValid = validarCarton();

    while (isValid == false) {
      crearEstructuraCarton();
      isValid = validarCarton();
    }

    if (isValid) {
      // printarCarton();
      rellenarCarton();
      array = carton;
    }
    return array;
  }

  public static void crearEstructuraCarton() {

    int contUno = 5;
    int contUno2 = 5;
    int contUno3 = 5;
    int contCero = 4;
    int contCero2 = 4;
    int contCero3 = 4;

    int numeroRandom = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        if (i == 0) {

          if (j == 0 || j == 1) {
            carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
            if (carton[i][j] == 0)
              contCero--;
            else if (carton[i][j] == 1)
              contUno--;
          }

          else {

            if (j <= 3) {
              if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                carton[i][j] = 1;
              }

              else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                carton[i][j] = 0;
              }

              if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                  || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
              }

              if (carton[i][j] == 0)
                contCero--;
              else if (carton[i][j] == 1)
                contUno--;
            }

            else {
              if (j == 4 || j == 5) {
                if ((contCero == 1) || (carton[i][j - 1] == 0 && carton[i][j - 2] == 0)) {
                  carton[i][j] = 1;
                }

                if (contCero > 1 && (carton[i][j - 1] == 1 && carton[i][j - 2] == 1)) {
                  carton[i][j] = 0;
                }

                // hacer random 1 y 0
                if (((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) && contCero > 1) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (contCero == 1) {
                  carton[i][j] = 1;
                }

                if (carton[i][j] == 0)
                  contCero--;
                else if (carton[i][j] == 1)
                  contUno--;
              }

              else {
                if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                  carton[i][j] = 1;
                }

                else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                  carton[i][j] = 0;
                }

                if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (contCero == 0) {
                  carton[i][j] = 1;
                }

                if (contUno == 0) {
                  carton[i][j] = 0;
                }

                if (carton[i][j] == 0)
                  contCero--;
                else if (carton[i][j] == 1)
                  contUno--;
              }

            }
          }
        }

        else if (i == 1) {

          if (j == 0 || j == 1) {
            carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
            if (carton[i][j] == 0)
              contCero2--;
            else if (carton[i][j] == 1)
              contUno2--;
          }

          else {

            if (j <= 3) {
              if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                carton[i][j] = 1;
              }

              else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                carton[i][j] = 0;
              }

              if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                  || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
              }

              if (carton[i][j] == 0)
                contCero2--;
              else if (carton[i][j] == 1)
                contUno2--;
            }

            else {
              if (j == 4 || j == 5) {
                if ((contCero2 == 1) || (carton[i][j - 1] == 0 && carton[i][j - 2] == 0)) {
                  carton[i][j] = 1;
                }

                if (contCero2 > 1 && (carton[i][j - 1] == 1 && carton[i][j - 2] == 1)) {
                  carton[i][j] = 0;
                }

                // hacer random 1 y 0
                if (((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) && contCero2 > 1) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (contCero2 == 1) {
                  carton[i][j] = 1;
                }

                if (carton[i][j] == 0)
                  contCero2--;
                else if (carton[i][j] == 1)
                  contUno2--;
              }

              else {
                if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                  carton[i][j] = 1;
                }

                else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                  carton[i][j] = 0;
                }

                if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (contCero2 == 0) {
                  carton[i][j] = 1;
                }

                if (contUno2 == 0) {
                  carton[i][j] = 0;
                }

                if (carton[i][j] == 0)
                  contCero2--;
                else if (carton[i][j] == 1)
                  contUno2--;
              }

            }
          }
        }

        else if (i == 2) {

          if (j == 0 || j == 1) { // 2 primeros

            carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);

            if (carton[i - 2][j] == 0 && carton[i - 1][j] == 0) {
              carton[i][j] = 1;
            }

            if (carton[i - 2][j] == 1 && carton[i - 1][j] == 1) {
              carton[i][j] = 0;
            }

            if (carton[i][j] == 0)
              contCero3--;
            else if (carton[i][j] == 1)
              contUno3--;
          }

          else { // 7 restantes

            if (j <= 3) { // tercer y cuarto número

              if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                  || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
              }

              if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                carton[i][j] = 1;
              }

              else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                carton[i][j] = 0;
              }

              if (carton[i - 2][j] == 0 && carton[i - 1][j] == 0) {
                carton[i][j] = 1;
              }

              if (carton[i - 2][j] == 1 && carton[i - 1][j] == 1) {
                carton[i][j] = 0;
              }

              if (carton[i][j] == 0)
                contCero3--;
              else if (carton[i][j] == 1)
                contUno3--;
            }

            else {
              if (j == 4 || j == 5) { // quinto y sexto número
                if ((contCero3 == 1) || (carton[i][j - 1] == 0 && carton[i][j - 2] == 0)) {
                  carton[i][j] = 1;
                }

                if (contCero3 > 1 && (carton[i][j - 1] == 1 && carton[i][j - 2] == 1)) {
                  carton[i][j] = 0;
                }

                // hacer random 1 y 0
                if (((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) && contCero3 > 1) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (contCero3 == 1) {
                  carton[i][j] = 1;
                }

                if (carton[i][j] == 0)
                  contCero3--;
                else if (carton[i][j] == 1)
                  contUno3--;
              }

              else { // resto de numeros
                if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                  carton[i][j] = 1;
                }

                else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                  carton[i][j] = 0;
                }

                if ((carton[i][j - 1] == 1 && carton[i][j - 2] == 0)
                    || (carton[i][j - 1] == 0 && carton[i][j - 2] == 1)) {
                  carton[i][j] = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
                }

                if (carton[i][j - 1] == 0 && carton[i][j - 2] == 0) {
                  carton[i][j] = 1;
                }

                else if (carton[i][j - 1] == 1 && carton[i][j - 2] == 1) {
                  carton[i][j] = 0;
                }

                if (contCero3 == 0) {
                  carton[i][j] = 1;
                }

                if (contUno3 == 0) {
                  carton[i][j] = 0;
                }

                if (carton[i][j] == 0)
                  contCero3--;
                else if (carton[i][j] == 1)
                  contUno3--;
              }
            }
          }
        }
      }
    }

    /*
     * System.out.println("\n\n\n--RESULTADO FINAL--");
     * for (int i = 0; i < 3; i++) {
     * System.out.println("");
     * for (int j = 0; j < 9; j++) {
     * switch (i) {
     * case 0:
     * min = 1;
     * max = 10;
     * break;
     * case 1:
     * min = 1;
     * max = 10;
     * break;
     * 
     * 
     * 
     * default:
     * break;
     * }
     * System.out.print(carton[i][j] + " ");
     * }
     * }
     */
  }

  public static boolean validarCarton() {

    boolean isValid = true;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        if (i == 0) { // 2 primeros
          if ((carton[i][j] == 0 && carton[i + 1][j] == 0 && carton[i + 2][j] == 0)
              || (carton[i][j] == 1 && carton[i + 1][j] == 1 && carton[i + 2][j] == 1)) {
            isValid = false;
          }
        }

        if ((j >= 2) && ((carton[i][j] == 1 && carton[i][j - 1] == 1 && carton[i][j - 2] == 1)
            || (carton[i][j] == 0 && carton[i][j - 1] == 0 && carton[i][j - 2] == 0))) {
          isValid = false;
        }
      }
    }

    return isValid;

  }

  public static void rellenarCarton() {
    for (int i = 0; i < 3; i++) {
      System.out.println("");
      int n1 = 0;
      int n2 = 0;

      for (int j = 0; j < 9; j++) {
        switch (j) {
          case 0:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (10 - 1 + 1)) + 1;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (10 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (10 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (10 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }
            }

            break;

          case 1:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (20 - 11 + 1)) + 11;

              if (i == 1) {

                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (20 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {

                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (20 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (20 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }

              }

            }
            break;

          case 2:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (30 - 21 + 1)) + 21;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (30 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (30 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (30 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }

            }
            break;

          case 3:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (40 - 31 + 1)) + 31;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (40 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (40 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (40 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }

            }
            break;

          case 4:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (50 - 41 + 1)) + 41;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (50 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (50 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (50 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }

            }
            break;

          case 5:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (60 - 51 + 1)) + 51;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (60 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (60 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (60 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }

            }
            break;

          case 6:
            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (70 - 61 + 1)) + 61;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (70 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (70 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (70 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }
            }
            break;

          case 7:

            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (80 - 71 + 1)) + 71;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (80 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (80 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (80 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }
            }
            break;

          case 8:

            if (carton[i][j] == 0) {
              carton[i][j] = 00;
            }
            if (carton[i][j] == 1) {
              carton[i][j] = (int) Math.floor(Math.random() * (90 - 81 + 1)) + 81;

              if (i == 1) {
                if (carton[i][j] < carton[i - 1][j]) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (90 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }
              }

              if (i == 2) {
                if (carton[i][j] < carton[i - 1][j] && carton[i - 1][j] != 0) {
                  if (carton[i - 1][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 1][j];
                    carton[i - 1][j] = temporalNum;
                  }
                }
                if (carton[i][j] < carton[i - 2][j] && carton[i - 2][j] != 0) {
                  if (carton[i - 2][j] != 0) {
                    int temporalNum = carton[i][j];
                    carton[i][j] = carton[i - 2][j];
                    carton[i - 2][j] = temporalNum;
                  }
                }

                if (carton[i][j] == carton[i - 1][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (90 - (carton[i - 1][j] + 1) + 1))
                      + (carton[i - 1][j] + 1);
                }

                if (carton[i][j] == carton[i - 2][j]) {
                  carton[i][j] = (int) Math.floor(Math.random() * (90 - (carton[i - 2][j] + 1) + 1))
                      + (carton[i - 2][j] + 1);
                }
              }
            }
            break;

          default:
            break;
        }
      }
    }
    // printarCarton();
  }


  public static String[][][] guardar_arrays_en_array_tridimensional(){

    Scanner input = new Scanner(System.in);

    System.out.print("\n\nIntroduce la cantidad de cartones que deseas generar: ");
    int quantitat_jugadors = input.nextInt();

    String array[][][] = new String[quantitat_jugadors][3][9];

    
    
    for (int i = 0; i < array.length; i++) {
        String cartro_final[][] = convertir_array_de_int_a_String(crearUnCarton());
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[i][j].length; k++) {
                array[i][j][k] = cartro_final[j][k];
            }
        }
    }

    return array;
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


  public static void crearBombo() {

  }

  public static void crearAmbos() {

  }

  public static void printarCarton() {
    /* PRINTAR CARTÓN */
    for (int i = 0; i < 3; i++) {
      System.out.println();
      System.out.println();
      for (int j = 0; j < 9; j++) {
        if (j < 10) {
          System.out.print("  | " + carton[i][j]);
        }

        else {
          System.out.print("| " + carton[i][j]);

        }
        // System.out.print(carton[i][j] + " ");
        // System.out.print("\t" + carton[i][j]);
      }

    }
  }

}