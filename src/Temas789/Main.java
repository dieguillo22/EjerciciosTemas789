package Temas789;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // 1. Se devuelve la cadena Al reves de la clase Reverse con funsion Stream reverse

        String cadena = Reverse.reverse("Hola mundo");

        for (int i = cadena.length() -1; i >=0; i--) {
            char caracter = cadena.charAt(i);
            System.out.print(caracter);
        }
        System.out.print("\n");
        System.out.print("\n");

        //2. Recorrer un array unidimensional de Strings, mostrando únicamente sus valores

        String [] arrayUnidim = {"Este", "Es", "El", "Segundo", "Punto"};


        for (int i = 0; i < arrayUnidim.length; i++) {
            System.out.println("El valor " + (i+1) + " del array de Strings es = " + arrayUnidim[i]);
        }
        System.out.print("\n");
        System.out.print("\n");

        // 3. Recorrer, mostrar posicion y valor de array bidimensional de enteros en sus dimensiones

        int [][]arrayBidimensional = new int[2][4];


        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[0][2] = 3;
        arrayBidimensional[0][3] = 4;

        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;
        arrayBidimensional[1][2] = 30;
        arrayBidimensional[1][3] = 40;

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidimensional[i][j]);
            }
        }

        System.out.print("\n");
        System.out.print("\n");

        // 4. Vector de tipo String, eliminar 2o y 3er elemento y mostrar resultado.
        Vector<String> vector = new Vector<>();

        vector.add("Este");
        vector.add("Es");
        vector.add("El");
        vector.add("Cuarto");
        vector.add("Punto");

        System.out.println("Contenido del vector completo: " + vector);

        vector.remove("Es");
        vector.remove("El");
        System.out.println("Contenido del vector sin el 2do y 3er elemento: " + vector);

        // 5. El problema de utilizar un vector con su capacidad por defecto si tubiesemos 1000 elementos,
        // es que en el momento que esta supere el numero de elementos, su capacidad se duplicaria al doble,
        // lo cual es una alto costo a nivel de memoria.
        //*********************************************__________________*************************************
        System.out.print("\n");
        System.out.print("\n");

        // 6. Se crea un ArrayList de tipo String, luego se copia en una LinkedList.
        //    Luego se recorre ambos mostrando el valor de cada elemento.

        ArrayList<String> ejemploLista = new ArrayList<>();

        ejemploLista.add("Llantas");
        ejemploLista.add("Espejos");
        ejemploLista.add("Cadena");
        ejemploLista.add("Guarda barro");

        System.out.println("La lista contiene: " + ejemploLista);

        System.out.print("\n");

        LinkedList<String> copiarLista = new LinkedList<>(ejemploLista);

        for (String elemento : copiarLista) {
            System.out.println("Elemento actual en la lista copiada: " + elemento);
        }
        System.out.print("\n");
        System.out.print("\n");

        // 7. Se crea ArrayList de tipo int, se rellena con elementos del 1 al 10, se rrecorre con otro bucle y se eli
        //    minan los numeros páres, se vuelve a recorrer y se muestra el ArrayList final

        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista2.add(i+1);
            System.out.println("Valor en la posicion " + i + " de la lista2: " + lista2.get(i));
        }
        System.out.print("\n");
        System.out.print("\n");

        for (int i = 0; i < lista2.size(); i++) {

            lista2.remove(i+1);

            System.out.println("Se remueven los pares de lista2 asi: " + lista2.get(i));
        }
        System.out.print("\n");
        System.out.print("\n");

        for (int i = 0; i < lista2.size(); i++) {

            System.out.println("Valor de ArrayList final en la posicion " + i + " de la lista2: " + lista2.get(i));
        }

        // 8. Se crea funsion dividePorCero, la cual genera una exepcion throws de tipo ArithmeticExceptions, la cual al
        //    ser llamada desde main al introducir dos numero mediante un scanner, si este la invoca dando un resultado
        //    al dividir por 0 se dispara la exepcion de lo contrario muestra el resultado.
        System.out.print("\n");
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        try{
            dividePorCero(A,B);
        } catch (ArithmeticException e) {
            System.out.println("¡No se puede dividir por cero!");
        }

    }

    public static class Reverse {
        public static String reverse(String texto) {

            return texto;
        }
    }
    public static int  dividePorCero(int A, int B) throws ArithmeticException{

        int resultado = 0;

        try {
            resultado = A/B;
        } catch (ArithmeticException e){
            throw new ArithmeticException();

        }
        System.out.println("Demo de código = resultado es " + resultado);
        return resultado;



    }

}
