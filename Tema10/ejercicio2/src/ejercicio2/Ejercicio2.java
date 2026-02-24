package ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista;
        lista = new ArrayList();
        mostrarMenu(lista, entrada);
    }

    public static int pedirEntero(Scanner entrada) {
        int entero;
        entero = entrada.nextInt();
        return entero;
    }

    public static void mostrarMenu(ArrayList<Integer> lista, Scanner entrada) {
        int opcion;
        do {
            opcionesMenu();
            opcion = pedirEntero(entrada);
            switch (opcion) {
                case 1 -> {
                    introducirValores(lista, entrada);
                }
                case 2 -> {
                    mostrarValores(lista);
                }
                case 3 -> {
                    mostrarMenorMayorSuma(lista);
                }
                case 4 -> {
                }
            }
        } while (opcion != 4);

    }

    public static void opcionesMenu() {
        System.out.println("1. Introducir valores");
        System.out.println("2. Visualizar elementos");
        System.out.println("3. Mostrar mayor, menor y suma de los elementos");
        System.out.println("4. Salir");
    }

    public static void introducirValores(ArrayList<Integer> lista, Scanner entrada) {
        boolean finalizar;
        do {
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

    public static void mostrarValores(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void mostrarMenorMayorSuma(ArrayList<Integer> lista) {
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
            suma += lista.get(i);
        }
        System.out.println("Numero mayor = " + mayor);
        System.out.println("Numero menor = " + menor);
        System.out.println("Suma total = " + suma);
    }

}
