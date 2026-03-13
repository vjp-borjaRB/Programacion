package ejercicio16;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList();
        mainMenu(listaProductos);
    }

    public static void mostrarOpcionesPrincipal() {
        System.out.println("1. MENU ADMINISTRACION");
        System.out.println("2. MENU DE COMPRA");
        System.out.println("3. SALIR");
    }

    public static void mostrarOpcionesAdmin() {
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar productos de la lista");
        System.out.println("4. Volver al menu principal");
    }

    public static void mostrarOpcionesCompra() {
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menu principal");
    }

    public static void mainMenu(ArrayList<Producto> listaProductos) {
        int menu;
        do {
            mostrarOpcionesPrincipal();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    administracionMenu(listaProductos);
                }
                case 2 -> {
                    comprasMenu(listaProductos);
                }
                case 3 -> {
                }
            }
        } while (menu != 3);
    }

    public static void administracionMenu(ArrayList<Producto> listaProductos) {
        int menuAdmin;
        do {
            mostrarOpcionesAdmin();
            menuAdmin = pedirInt();
            switch (menuAdmin) {
                case 1 -> {
                    introducirProductos(listaProductos);
                }
                case 2 -> {
                    mostrarProductos(listaProductos);
                }
                case 3 -> {
                    eliminarProducto(listaProductos);
                }
                case 4 -> {
                }
            }
        } while (menuAdmin != 4);
    }

    public static void introducirProductos(ArrayList<Producto> listaProductos) {
        boolean continuar;
        do {
            System.out.print("Introduce el nombre del producto: ");
            String nombre = pedirString();
            System.out.print("Introduce el precio: ");
            float precio = pedirFloat();
            System.out.print("Introduce la cantidad: ");
            int stock = pedirInt();
            Producto nuevo = new Producto(nombre, precio, stock);
            listaProductos.add(nuevo);
            System.out.println("Desea seguir introduciendo productos?");
            continuar = continuar();
        } while (continuar);
    }

    public static boolean continuar() {
        String respuesta;
        boolean continuar = false;
        boolean valida;
        do {
            respuesta = pedirString();
            if (respuesta.toLowerCase().equals("si")) {
                continuar = true;
                valida = true;
            } else if (respuesta.toLowerCase().equals("no")) {
                continuar = false;
                valida = true;
            } else {
                valida = false;
                System.err.println("Introduce una respuesta valida");
            }
        } while (!valida);
        return continuar;
    }

    public static void mostrarProductos(ArrayList<Producto> listaProductos) {
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i));
        }
    }

    public static void eliminarProducto(ArrayList<Producto> listaProductos) {
        Iterator<Producto> iterador = listaProductos.iterator();
        boolean encontrado = false;
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String respuesta = pedirString();
        while (iterador.hasNext() || !encontrado) {
            Producto producto = iterador.next();
            if (producto.getNombre().equalsIgnoreCase(respuesta)) {
                iterador.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.err.println("No se ha encontrado el producto introducido");
        }
    }

    public static void comprasMenu(ArrayList<Producto> listaProductos) {
        int menuCompras;
        do {
            mostrarOpcionesCompra();
            menuCompras = pedirInt();
            switch (menuCompras) {
                case 1 -> {
                    comprar(listaProductos);
                }
                case 2 -> {
                }
            }

        } while (menuCompras != 2);
    }

    public static void comprar(ArrayList<Producto> listaProductos) {
        Iterator<Producto> iterador = listaProductos.iterator();
        boolean encontrado = false;
        boolean continuar;
        float total = 0;
        mostrarProductos(listaProductos);
        do {
            System.out.println("Introduzca el nombre del producto que desea comprar: ");
            String nombre = pedirString();
            System.out.println("Cuantas unidades desea?");
            int cantidad = pedirInt();
            while (iterador.hasNext() || !encontrado) {
                Producto producto = iterador.next();
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    if (cantidad < producto.getStock()) {
                        total += producto.getPrecio() * cantidad;
                        producto.setStock(producto.getStock() - cantidad);
                    } else {
                        System.err.println("No hay unidades suficientes, quedan " + producto.getStock() + " unidades.");
                    }
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.err.println("No se ha encontrado el producto introducido");
            }
            System.out.println("Desea seguir comprando?");
            continuar = continuar();
        } while (continuar);
        System.out.println("El importe total de la compra es de " + total);
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }

    public static float pedirFloat() {
        Scanner entradaFloat = new Scanner(System.in);
        float comaFlotante = entradaFloat.nextFloat();
        return comaFlotante;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }

}
