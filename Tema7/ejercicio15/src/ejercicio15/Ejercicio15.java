package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int[] ventasCoches = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        menu(ventasCoches, meses);
    }

    public static void menu(int[] ventasCoches, String[] meses) { // Menú.
        int menu;
        do {
            mostrarMenu();
            menu = pedirOpcion();
            switch (menu) {
                case 1 -> {
                    rellenarArray(ventasCoches);
                }
                case 2 -> {
                    mostrarVentas(ventasCoches);
                }
                case 3 -> {
                    mostrarVentasReves(ventasCoches);
                }
                case 4 -> {
                    mostrarTotalVentas(ventasCoches);
                }
                case 5 -> {
                    ventasMesesPares(ventasCoches);
                }
                case 6 -> {
                    mesMasVentas(ventasCoches, meses);
                }
                case 7 -> {
                }
            }
        } while (menu != 7);
    }

    public static int pedirOpcion() { // Entrada del usuario.
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarMenu() { // Mostrar opciones del menú.
        System.out.println("1. Rellenar array");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
        System.out.println("3. Mostrar las ventas introducidas al reves.");
        System.out.println("4. Suma total de ventas del año.");
        System.out.println("5. Ventas totales de los meses pares.");
        System.out.println("6. Nombre del mes con más ventas.");
        System.out.println("7. Salir del programa");
    }

    public static void rellenarArray(int[] ventasCoches) { // Añadir número aleatorios al array.
        int nventas;
        for (int i = 0; i < ventasCoches.length; i++) {
            nventas = (int) (Math.random() * 91) + 10; // Generar un número aleatorio entre 10 y 100.
            ventasCoches[i] = nventas; // Añadir el número aleatorio al array.
        }
    }

    public static void mostrarVentas(int[] ventasCoches) { // Mostrar contenido del array.
        System.out.println("Mostrando ventas: ");
        for (int i = 0; i < ventasCoches.length; i++) {
            System.out.println(ventasCoches[i]);
        }
    }

    public static void mostrarVentasReves(int[] ventasCoches) { // Mostrar las ventas empezando por el último mes.
        System.out.println("Mostrando ventas al reves: ");
        for (int i = ventasCoches.length - 1; i >= 0; i--) {
            System.out.println(ventasCoches[i]);
        }
    }

    public static void mostrarTotalVentas(int[] ventasCoches) { // Mostrar el total de ventas de todos los meses.
        int totalVentas = 0;
        for (int i = 0; i < ventasCoches.length; i++) {
            totalVentas += ventasCoches[i]; // Acumular el total de ventas del mes en una variable en cada iteración.
        }
        System.out.println(totalVentas);
    }

    public static void ventasMesesPares(int[] ventasCoches) { // Mostrar el total de ventas de los meses pares.
        int totalVentasPares = 0;
        for (int i = 0; i < ventasCoches.length; i++) {
            if (i % 2 != 0) { // Si el módulo de la posición del mes en el array es distinta de 0 (la posición es impar) acumular ventasCoches[i] en totalVentasPares.
                totalVentasPares += ventasCoches[i];
            }
        }
        System.out.println("El total de ventas de los meses pares es: " + totalVentasPares);
    }

    public static void mesMasVentas(int[] ventasCoches, String[] meses) { // Mostrar nombre del mes con mas ventas.
        String mejorMes = "";
        int maxVentasMes = 0;
        for (int i = 0; i < ventasCoches.length; i++) {
            if (ventasCoches[i] > maxVentasMes) { // Si el número de ventas del mes es mayor que el máximo se establece como el máximo.
                maxVentasMes = ventasCoches[i];
            }
            if (ventasCoches[i] == maxVentasMes) { // Si el número de ventas del mes es el máximo, guardar el nombre del mes en mejorMes.
                mejorMes = meses[i];
            }
        }
        System.out.println(mejorMes);
    }
}
