package ejercicio6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> listaVentas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        menu(listaVentas, meses, entrada);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Introducir ventas de coches para cada mes");
        System.out.println("2. Mostrar ventas introducidas");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Suma de todas las ventas 12 meses");
        System.out.println("5. Mostrar ventas meses que tengan la letra A");
        System.out.println("6. Nombre del mes/meses con mas ventas");
        System.out.println("7. Salir del programa");
    }

    public static void menu(ArrayList<Integer> listaVentas, String[] meses, Scanner entrada) {
        int opcion;
        boolean salir = false;
        do {
            mostrarOpciones();
            opcion = pedirEntero(entrada);
            comprobarOpcion(opcion, entrada);
            switch (opcion) {
                case 1 -> {
                    introducirVentas(listaVentas, meses, entrada);
                }
                case 2 -> {
                    mostrarVentas(listaVentas, meses);
                }
                case 3 -> {
                    mostrarVentasReves(listaVentas, meses);
                }
                case 4 -> {
                    mostrarTotalVentas(listaVentas);
                }
                case 5 -> {
                    mostrarVentasMesesA(listaVentas, meses);
                }
                case 6 -> {
                    mesesMasVentas(listaVentas, meses);
                }
                case 7 -> {
                    salir = true;
                }
            }
        } while (!salir);
    }

    public static void introducirVentas(ArrayList<Integer> listaVentas, String[] meses, Scanner entrada) {
        for (String mes : meses) {
            System.out.println("Introduce las ventas para el mes de: " + mes);
            listaVentas.add(pedirEntero(entrada));
        }
    }

    public static void mostrarVentas(ArrayList<Integer> listaVentas, String[] meses) {
        for (int i = 0; i < listaVentas.size(); i++) {
            System.out.println(meses[i] + ": " + listaVentas.get(i));
        }
    }

    public static void mostrarVentasReves(ArrayList<Integer> listaVentas, String[] meses) {
        for (int i = listaVentas.size() - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + listaVentas.get(i));
        }
    }

    public static void mostrarTotalVentas(ArrayList<Integer> listaVentas) {
        int totalVentas = 0;
        for (int i = 0; i < listaVentas.size(); i++) {
            totalVentas += listaVentas.get(i);
        }
        System.out.println("El total de ventas anual es: " + totalVentas);
    }

    public static void mostrarVentasMesesA(ArrayList<Integer> listaVentas, String[] meses) {
        for (int i = 0; i < listaVentas.size(); i++) {
            if (meses[i].contains("A") || meses[i].contains("a")) {
                System.out.println(meses[i] + ": " + listaVentas.get(i));
            }
        }
    }

    public static void mesesMasVentas(ArrayList<Integer> listaVentas, String[] meses) {
        int maxVentas = Integer.MIN_VALUE;
        int ventasMes;
        for (int i = 0; i < listaVentas.size(); i++) {
            ventasMes = listaVentas.get(i);
            if (ventasMes > maxVentas) {
                maxVentas = ventasMes;
            }
        }
        for (int i = 0; i < listaVentas.size(); i++) {
            if (maxVentas == listaVentas.get(i)) {
                System.out.println(meses[i] + ": " + listaVentas.get(i));
            }
        }
    }

    public static int pedirEntero(Scanner entrada) {
        int entero = 0;
        boolean valido;
        do {
            valido = true;
            try {
                entero = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero entero");
                entrada.nextLine();
                valido = false;
            }
        } while (!valido);
        return entero;
    }

    public static int comprobarOpcion(int entero, Scanner entrada) {
        while (entero > 7 || entero < 1) {
            System.err.println("Introduce un entero entre 1 y 7");
            entero = pedirEntero(entrada);
        }
        return entero;
    }
}
