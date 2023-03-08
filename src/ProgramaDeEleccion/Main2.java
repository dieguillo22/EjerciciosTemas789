package ProgramaDeEleccion;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*Este Programa almacena nombres de usuario con su edad en un HashMap con ArrayList
 creando una exepcion si la edad no es un entero. Luego se imprime en consola los datos almacenados
 y por ultimo se crea un fichero de texto con los datos de los usuarios*/

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                // Crear un HashMap para almacenar los datos de los usuarios
        HashMap<String, ArrayList<String>> usuarios = new HashMap<>();

        while (true) {
            System.out.println("Ingrese el nombre del usuario (o 'salir' para salir): ");
            String nombreUsuario = scanner.nextLine();

            // Salir del programa si se ingresa 'salir'
            if (nombreUsuario.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese la edad del usuario: ");

            int edadUsuario = 0;
            try {
                edadUsuario = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("La edad debe ser un número entero.");
                scanner.nextLine();
                continue;
            }

            // Crear un ArrayList para almacenar los datos del usuario actual
            ArrayList<String> datosUsuario = new ArrayList<>();
            datosUsuario.add(String.valueOf(edadUsuario));

            // Agregar los datos del usuario actual al HashMap alimentando primero el ArrayList
            if (usuarios.containsKey(nombreUsuario)) {
                usuarios.get(nombreUsuario).add(String.valueOf(edadUsuario));
            } else {
                usuarios.put(nombreUsuario, datosUsuario);
            }
        }

        // Imprimir los datos de los usuarios almacenados en el HashMap
        System.out.println("Datos de los usuarios ingresados:");
        for (String nombreUsuario : usuarios.keySet()) {
            ArrayList<String> datosUsuario = usuarios.get(nombreUsuario);

            System.out.print(nombreUsuario + ": ");
            for (String dato : datosUsuario) {
                System.out.print(dato + " ");
            }
        // Crear un fichero de texto con los datos de usuario mediante PrintStream

            System.out.println();
            try {
                // Crear una instancia de PrintStream
                PrintStream out = new PrintStream("datos_usuarios.txt");

                // Imprimir los datos en el archivo
                out.println(usuarios);
                // Cerrar el archivo
                out.close();

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error al crear el archivo.");
                e.printStackTrace();
            }

        }
    }
}



