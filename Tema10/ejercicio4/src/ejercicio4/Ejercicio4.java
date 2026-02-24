package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista;
        lista = new ArrayList();
        introducirValores(lista, entrada);
        mostrarLista(lista);
        sustituirRepetidos(lista);
        mostrarLista(lista);
    }

    public static void introducirValores(ArrayList<Integer> lista, Scanner entrada) {
        boolean finalizar;
        do { // Pedimos números, si se introduce uno negativo dejamos de añadir a la lista.
            int numero;
            finalizar = false;
            System.out.println("Introduce un numero: ");
            numero = pedirEntero(entrada);
            if (numero < 0) {
                finalizar = true;
            } else {
                lista.add(numero);
            }
        } while (!finalizar);
    }

    public static void sustituirRepetidos(ArrayList<Integer> lista) {
        ArrayList<Integer> listaAux = new ArrayList(); // Crear lista para almacenar los numeros que se repiten.
        for (int i = 0; i < lista.size(); i++) {
            int contador = 0;
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).equals(lista.get(i))) { // Cuenta las apariciones del numero en la lista.
                    contador++;
                }
            }
            if (contador >= 2) {
                listaAux.add(i); // Si el numero aparece dos o más veces se guarda el índice en la lista auxiliar.
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            if (listaAux.contains(i)) { // Si la lista auxiliar contiene ese índice se pone el elemento a 0.
                lista.set(i, 0);
            }
        }
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static int pedirEntero(Scanner entrada) {
        int entero;
        entero = entrada.nextInt();
        return entero;
    }
}
