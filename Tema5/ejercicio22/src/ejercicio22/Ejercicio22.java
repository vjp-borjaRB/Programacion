package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Producto gatos = new Gato("Gatos", 150, 16);
        Producto perros = new Perro("Perros", 300, 12);
        Producto conejos = new Conejo("Conejos", 60, 32);
        int opcion;
        do {
            mostrarMenu(gatos, perros, conejos);
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> {
                    opcion = gatos.menuCompra();
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    opcion = 4;
                }
            }
        } while (opcion != 4);
    }

    public static int pedirOpcion() {
        Scanner entradaO = new Scanner(System.in);
        int opcion = entradaO.nextInt();
        return opcion;
    }

    public static void mostrarMenu(Producto gatos, Producto perros, Producto conejos) {
        System.out.println("------ MENU ------");
        System.out.println("Pulse 1 " + gatos.mostrarProducto());
        System.out.println("Pulse 2 " + perros.mostrarProducto());
        System.out.println("Pulse 3 " + conejos.mostrarProducto());
        System.out.println("Pulse 4 para Salir");
    }

    public static int pedirCantidad() {
        Scanner entradaC = new Scanner(System.in);
        System.out.println("Cuantas unidades desea?");
        int cantidad = entradaC.nextInt();
        return cantidad;
    }

    public static String volverComprar() {
        Scanner entradaV = new Scanner(System.in);
        System.out.println("Desea realizar otra compra?");
        String comprar = entradaV.nextLine();
        return comprar;
    }
}
