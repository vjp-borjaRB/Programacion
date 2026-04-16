package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        ArrayList<Ciudad> listaCiudades = new ArrayList();
        mainMenu(listaCiudades);
    }

    public static void mainMenu(ArrayList<Ciudad> listaCiudades) {
        int menu;
        do {
            opcionesMenu();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    addCiudad(listaCiudades);
                }
                case 2 -> {
                    mostrarCiudadesSedes(listaCiudades);
                }
                case 3 -> {
                    mostrarCiudadesMediaIngresos(listaCiudades);
                }
                case 4 -> {
                    buscarSedeNombre(listaCiudades);
                }
                case 5 -> {
                    addSede(listaCiudades);
                }
                case 6 -> {
                    volcarIngresos(listaCiudades);
                }
            }
        } while (menu != 7);
    }

    public static void addCiudad(ArrayList<Ciudad> listaCiudades) {
        boolean continuar;
        System.out.print("Introduce el nombre de la ciudad: ");
        String nombre = pedirString();
        Ciudad nuevaCiudad = new Ciudad(nombre); // Crea el objeto ciudad y le asigna nombre
        do { // Añadiendo sedes al objeto ciudad hasta que el usuario decida no continuar
            String nombreSede;
            float ingresosAnuales;
            System.out.print("Introduce el identificador de la sede: ");
            int id = pedirInt();
            System.out.println("Introduce el nombre de la sede: ");
            nombreSede = pedirString();
            System.out.print("Introduce los ingresos anuales: ");
            ingresosAnuales = pedirFloat();
            Sede nuevaSede = new Sede(nombreSede, ingresosAnuales);
            nuevaCiudad.getSedes().put(id, nuevaSede);
            continuar = comprobarRespuesta();
        } while (continuar);
        listaCiudades.add(nuevaCiudad); // Se añade la ciudad al ArrayList
    }

    public static boolean comprobarRespuesta() { // Devuelve true o false según la respuesta
        boolean valida;
        boolean continuar = false;
        do {
            System.out.println("Desea continuar introduciendo sedes?");
            String respuesta = pedirString();
            if (respuesta.equalsIgnoreCase("Si")) {
                valida = true;
                continuar = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                valida = true;
                continuar = false;
            } else {
                System.err.println("Respuesta no valida Si/No");
                valida = false;
            }
        } while (!valida);
        return continuar;
    }

    public static void mostrarCiudadesSedes(ArrayList<Ciudad> listaCiudades) { // Muestra las todas las ciudades junto con sus sedes
        for (Ciudad ciudadI : listaCiudades) {
            System.out.println(ciudadI.getNombre()); // Muestra nombre de la ciudad
            Sede.mostrarSedes(ciudadI.getSedes()); // Método de la clase Sede (Muestra las sedes de esa ciudad y su id)
        }
    }

    public static void mostrarCiudadesMediaIngresos(ArrayList<Ciudad> listaCiudades) {
        float suma = 0;
        int contador = 0;
        float media;
        for (Ciudad ciudadI : listaCiudades) { // Suma todos los ingresos de todas las sedes y las cuenta
            for (Sede sedeI : ciudadI.getSedes().values()) {
                suma += sedeI.getIngresosAnuales();
                contador++;
            }
        }
        media = suma / contador; // Calcula la media
        for (Ciudad ciudadI : listaCiudades) { // Vuelve a recorrer ArraList de ciudades y cada objeto Sede (valor, no clave)
            for (Sede sedeI : ciudadI.getSedes().values()) {
                if (sedeI.getIngresosAnuales() > media) {
                    System.out.println(sedeI.getNombre()); // Muestra todas las sedes con ingresos superiores a la media
                }
            }
        }
    }

    public static boolean buscarSedeNombre(ArrayList<Ciudad> listaCiudades) {
        String nombreSede;
        boolean encontrado = false;
        System.out.println("Introduce el nombre de la sede: ");
        nombreSede = pedirString();
        for (Ciudad ciudadI : listaCiudades) { // Recorrer listaCiudades y cada sede buscando una que coincida con el nombre
            for (Sede sedeI : ciudadI.getSedes().values()) { // Mejor while ya que no debería haber sedes con el mismo nombre
                if (sedeI.getNombre().equalsIgnoreCase(nombreSede)) {
                    encontrado = true;
                }
            }
            System.out.println("Sede encontrada");
        }
        return encontrado;
    }

    public static void addSede(ArrayList<Ciudad> listaCiudades) {
        String nombreCiudad;
        int i = 0;
        boolean encontrado = false;
        if (listaCiudades.isEmpty()) { // Comprueba si la lista está vacía
            System.err.print("La lista esta vacia");
        } else {
            System.out.println("Introduce el nombre de la ciudad: ");
            nombreCiudad = pedirString();
            while (i < listaCiudades.size() && !encontrado) { // Se añade una sede al HashMap de la ciudad que coincida con el nombre
                if (listaCiudades.get(i).getNombre().equalsIgnoreCase(nombreCiudad)) {
                    int id;
                    float ingresosAnuales;
                    String nombre;
                    System.out.print("Introduce el id de la sede");
                    id = pedirInt();
                    System.out.print("Introduce el nombre: ");
                    nombre = pedirString();
                    System.out.print("Introduce los ingresos anuales: ");
                    ingresosAnuales = pedirFloat();
                    Sede nuevaSede = new Sede(nombre, ingresosAnuales);
                    listaCiudades.get(i).getSedes().put(id, nuevaSede);
                    encontrado = true;
                } else {
                    i++;
                }
            }
            if (!encontrado) {
                System.err.println("No se encontraron resultados para esa ciudad");
            }
        }
    }

    public static void volcarIngresos(ArrayList<Ciudad> listaCiudades) {
        ArrayList<Sede> listaSedes = new ArrayList<>(); // ArrayList de todas las sedes
        for (Ciudad ciudadI : listaCiudades) {
            listaSedes.addAll(ciudadI.getSedes().values()); // Recorre la lista de ciudades y añade todas las sedes de cada ciudad a la lista de sedes
        }
        Collections.sort(listaSedes); // Usa Comparable para ordenar la lista por ingresos anuales
        for (Sede sedeI : listaSedes) {
            System.out.println(sedeI); // Muestra la lista de sedes
        }
    }

    public static void opcionesMenu() {
        System.out.println("1. Add ciudad");
        System.out.println("2. Mostrar ciudades junto con sus sedes");
        System.out.println("3. Mostrar nombre de sedes con ingresos superiores a la media");
        System.out.println("4. Buscar por nombre de sede");
        System.out.println("5. Add sede");
        System.out.println("6. Mostrar sedes ordenadas por ingresos anuales");
        System.out.println("7. Salir del programa");
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }

    public static float pedirFloat() {
        Scanner entradaFloat = new Scanner(System.in);
        float comaFlotante = entradaFloat.nextFloat();
        return comaFlotante;
    }
}
