package ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista;
        lista = new ArrayList();
        mostrarMenu(lista, entrada);
    }

    public static void mostrarMenu(ArrayList<Integer> lista, Scanner entrada) {
        int opcion;
        do {
            opcionesMenu();
            opcion = pedirEntero(entrada);
            switch (opcion) {
                case 1 -> {
                    rellenarLista(entrada, lista);
                }
                case 2 -> {
                    mostrarLista(lista);
                }
                case 3 -> {
                    intercambiarPosiciones(lista);
                }
                case 4 -> {
                }
            }
        } while (opcion != 4);
    }

    public static int pedirEntero(Scanner entrada) {
        int entero;
        entero = entrada.nextInt();
        return entero;
    }

    public static String pedirString(Scanner entrada) {
        String cadena;
        entrada.nextLine();
        cadena = entrada.nextLine();
        return cadena;
    }

    public static void opcionesMenu() {
        System.out.println("1. Introducir valores");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Intercambiar 2 y 4");
        System.out.println("4. Salir");
    }

    public static void rellenarLista(Scanner entrada, ArrayList<Integer> lista) {
        boolean continuar = false;
        String respuesta;
        do {
            System.out.println("Introduce un numero: ");
            lista.add(pedirEntero(entrada));
            System.out.println("Desea introducir otro numero?");
            respuesta = pedirString(entrada);
            if (respuesta.equalsIgnoreCase("Si")) {
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            } else {
                System.err.println("Introduce una respuesta valida (Si/No)");
            }
        } while (continuar);
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void intercambiarPosiciones(ArrayList<Integer> lista) {
        int aux;
        aux = lista.get(2);
        lista.set(2, lista.get(4));
        lista.set(4, aux);
    }
}
