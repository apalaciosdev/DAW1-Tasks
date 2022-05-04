import java.util.*;
import java.io.File;

public class Act1_apalacios {
    public static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {

        String filePath = "C:/Users/6002215/Downloads/Test";

        File file = new File(filePath);

        String path = file.getPath();

        System.out.println(path);

        String[] listado = file.list();

        if (listado == null || listado.length == 0) {

            System.out.println("No hay elementos dentro de la carpeta actual");

            return;

        }

        else {

            for (int i = 0; i < listado.length; i++) {

                System.out.println(listado[i]);

            }

        }

    }
}
