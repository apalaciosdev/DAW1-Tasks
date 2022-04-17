import java.util.*;
import java.lang.*;
import java.lang.Math;

public class Bingo_apalacios_mgallego {

  public static Scanner sc = new Scanner(System.in, "UTF-8");
  public static int carton[][] = new int[3][9]; // horizonal(fila)[j] - vertical(columna)[i]

  public static void main(String[] args) throws Exception {

    
    int num = 0;
    boolean bucle = true;
    
    while (bucle) {
      System.out.println("\n\n---------------- BINGO ANTOJITOS ----------------");
      System.out.println("1- Generar solo cartones");
      System.out.println("2- Generar solo bombo");
      System.out.println("3- Generar cartones y bombo (modo manual)");
      System.out.println("4- Generar cartones y bombo (modo automático)");
      System.out.println("5- Salir");
      System.out.println("");
      System.out.println("Introduce número: ");
      num = sc.nextInt();
      

      if (num == 1) {
        String todosCartones[][][] = guardarCartones();
        verTodosLosCartones(todosCartones);
      }

      else if (num == 2) {
        crearBombo();
      }

      else if (num == 3) {
        juegoManual();
      }

      else if (num == 5) {
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


  public static String[][][] guardarCartones(){

    System.out.print("\n\nIntroduce la cantidad de cartones que deseas generar: ");
    int quantitat_jugadors = sc.nextInt();

    String array[][][] = new String[quantitat_jugadors][3][9];

    
    
    for (int i = 0; i < array.length; i++) {
        String cartro_final[][] = conversorIntToStringArray(crearUnCarton());
        for (int j = 0; j < array[i].length; j++) {
            for (int k = 0; k < array[i][j].length; k++) {
                array[i][j][k] = cartro_final[j][k];
            }
        }
    }

    return array;
  }


  public static String[][] conversorIntToStringArray(int[][] array) {

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


  public static void verTodosLosCartones(String[][][] array){
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
    System.out.println("\n\n\n");
  }


  public static String[][][] tacharCarton(String[][][] array, int num) {
    String numero = String.valueOf(num);
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


  public static void crearBombo() {
    ArrayList<Integer> numerosMostrados = new ArrayList<Integer>();
    System.out.print("\n-------------------------------------------\n");
    System.out.print("Si deseas salir de este modo, escribe exit.");
    System.out.print("\nEn caso contrario, pulsa enter.\n");
    System.out.print("-------------------------------------------\n\n");

    boolean state = true;
    sc.nextLine();
    while (state) {
      int randomNumber = (int) Math.floor(Math.random() * (90 - 1 + 1)) + 1;
      
      while(numerosMostrados.contains(randomNumber)){
        randomNumber = (int) Math.floor(Math.random() * (90 - 1 + 1)) + 1;
      }

      System.out.println("     || " + randomNumber + " ||\n");
      
      numerosMostrados.add(randomNumber);

      String bingo = sc.nextLine().toLowerCase();
      System.out.print("\n");
      
      if (bingo.equalsIgnoreCase("exit")){
        state = false;
      }
    }
  }

  public static void juegoManual() {
    String todosCartones[][][] = guardarCartones();
    verTodosLosCartones(todosCartones);
   
    ArrayList<Integer> numerosIntroducidos = new ArrayList<Integer>();
    boolean state = true;
    int numeroIntroducido = 0;
    int contador_general = 0;
    int contador_general1 = 0;
    int hayLinea = 0;
    int hayBingo = 0;
    int linea = 0;

    while(state){
      System.out.println("\n\nIntroduce un número (1-90)");
      numeroIntroducido = sc.nextInt();

      while(numerosIntroducidos.contains(numeroIntroducido) || numeroIntroducido < 1 || numeroIntroducido > 90){
        if(numerosIntroducidos.contains(numeroIntroducido)){
          System.out.println("\n-------ERROR, NÚMERO YA USADO-------");
          
          System.out.println("Introduce un número (1-90)");
          numeroIntroducido = sc.nextInt();
        }
        
        else{
          System.out.println("\n-------ERROR, NÚMERO NO VÁLIDO-------");
          
          System.out.println("Introduce un número (1-90)");
          numeroIntroducido = sc.nextInt();
        }

      }
     
      numerosIntroducidos.add(numeroIntroducido);
   
      String cartonTachado [][][] = tacharCarton(todosCartones, numeroIntroducido);
  
      for (int i = 0; i < cartonTachado.length; i++) {
        int linea1 = 0;
        int linea2 = 0;
        int linea3 = 0;
        int bingoContador = 0;
  
        System.out.print("\n---------------------------------------------\n");
        for (int j = 0; j < cartonTachado[i].length; j++) {
            System.out.print("| ");
            
            for (int k = 0; k < cartonTachado[i][j].length; k++) {  
              if (j == 0){ //Primera fila
                if (cartonTachado[i][j][k].equals("XX")){
                    linea1++;
                    bingoContador++;
                    
                    if (linea1 == 5){
                        hayLinea = i;
                        linea = j;
                    }
                    
                    if (bingoContador == 15){
                        hayBingo = i;
                    }
                }
              }

              if (j == 1){ //Segunda fila
                if (cartonTachado[i][j][k].equals("XX")){
                    linea2++;
                    bingoContador++;

                    if (linea2 == 5){
                        hayLinea = i;
                        linea = j;
                    }
                    
                    if (bingoContador == 15){
                        hayBingo = i;
                    }
                }
              }

              if (j == 2){ //Tercera fila
                if (cartonTachado[i][j][k].equals("XX")){
                    linea3++;
                    bingoContador++;
                    
                    if (linea3 == 5){
                        hayLinea = i;
                        linea = j;
                    }
                    
                    if (bingoContador == 15){
                        hayBingo = i;
                    }
                }
              }
              System.out.print(cartonTachado[i][j][k]+ " | ");
            }
            System.out.println("\n---------------------------------------------");
        }

        if (contador_general < 1){
          if (linea1 == 5 || linea2 == 5 || linea3 == 5){
              printLinea(hayLinea, linea);                                         
              contador_general++;
          }
        }

        if (contador_general1 < 1){
          if (bingoContador == 15){
              printBingo(hayBingo);                                                       
              contador_general1++;
              state = false;
          }
        } 
      }
    }


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


  public static void printLinea(int jugador, int linea){
    System.out.println("\n\n\n██╗     ██╗███╗   ██╗███████╗ █████╗     ██╗");
    System.out.println("██║     ██║████╗  ██║██╔════╝██╔══██╗    ██║");
    System.out.println("██║     ██║██╔██╗ ██║█████╗  ███████║    ██║");
    System.out.println("██║     ██║██║╚██╗██║██╔══╝  ██╔══██║    ╚═╝");
    System.out.println("███████╗██║██║ ╚████║███████╗██║  ██║    ██╗");
    System.out.println("╚══════╝╚═╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝    ╚═╝");

    System.out.println("\n---------------------------------");
    System.out.println("|  El jugador "+(jugador+1)+" ha hecho LINEA   |");
    System.out.println("---------------------------------");
    System.out.print("\n");
  }


  public static void printBingo(int jugador){
    System.out.print("\n");
    System.out.println("\n\n\n");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████");
    System.out.println("░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███");
    System.out.println("░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███");
    System.out.println("░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
    System.out.println("░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███");
    System.out.println("░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██");
    System.out.println("░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
    System.out.println("░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██");
    System.out.println("░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██");
    System.out.println("██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██");
    System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██");
    System.out.println("██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
    System.out.println("░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
    System.out.println("░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
    System.out.println("░░████████████░░░█████████████████");


    System.out.println("\n██████╗ ██╗███╗   ██╗ ██████╗  ██████╗     ██╗");
    System.out.println("██╔══██╗██║████╗  ██║██╔════╝ ██╔═══██╗    ██║");
    System.out.println("██████╔╝██║██╔██╗ ██║██║  ███╗██║   ██║    ██║");
    System.out.println("██╔══██╗██║██║╚██╗██║██║   ██║██║   ██║    ╚═╝");
    System.out.println("██████╔╝██║██║ ╚████║╚██████╔╝╚██████╔╝    ██╗");
    System.out.println("╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝  ╚═════╝     ╚═╝");

    System.out.println("\n---------------------------------");
    System.out.println("|  El jugador "+(jugador+1)+" ha hecho BINGO   |");
    System.out.println("---------------------------------");
    System.out.print("\n");
  }

}