package ejercicio7;

import java.util.Scanner;

import java.util.HashSet;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        HashSet<Campania> campanias = new HashSet();
        mainMenu(campanias);
    }

    public static void mainMenu(HashSet<Campania> campanias) {
        int menu;
        do {
            opcionesMenu();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    addCampania(campanias);
                }
                case 2 -> {
                    addDonacion(campanias);
                }
                case 3 -> {
                }
                case 4 -> {
                    campaniasNombre(campanias);
                }
                case 5 -> {
                    totalRecaudado(campanias);
                }
                case 6 -> {
                    mayorDonacion(campanias);
                }
                case 7 -> {
                }
            }
        } while (menu != 7);
    }

    public static void addCampania(HashSet<Campania> campanias) {
        System.out.print("Introduce el nombre de la campania: ");
        String nombre = pedirString();
        Campania nueva = new Campania(nombre);
        campanias.add(nueva);
    }

    public static void addDonacion(HashSet<Campania> campanias) {
        boolean continuar;
        do {
            String nombreCampania;
            boolean encontrada = false;
            if (campanias.isEmpty()) {
                System.err.println("El conjunto esta vacio");
                continuar = false;
            } else {
                System.out.print("Introduce el nombre de la Campania a la que corresponde la donacion: ");
                nombreCampania = pedirString();
                for (Campania c : campanias) {
                    if (c.getNombre().equalsIgnoreCase(nombreCampania)) {
                        encontrada = true;
                    }
                }
                if (encontrada) {
                    System.out.print("Introduce nombre del donante: ");
                    String nombreDonante = pedirString();
                    System.out.print("Introduce la cantidad donada: ");
                    float cantidad = pedirFloat();
                    for (Campania c : campanias) {
                        if (c.getNombre().equalsIgnoreCase(nombreCampania)) {
                            Donacion nueva = new Donacion(nombreDonante, cantidad);
                            c.getDonaciones().add(nueva);
                        }
                    }
                } else {
                    System.err.println("No se encontraron resultados para esa campania");
                }
                continuar = comprobarRespuesta();
            }
        } while (continuar);
    }

    public static boolean comprobarRespuesta() {
        boolean valida;
        boolean continuar = false;
        do {
            System.out.println("Desea continuar introduciendo donaciones?");
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

    public static void campaniasNombre(HashSet<Campania> campanias) {
        ArrayList<Campania> listaCampanias = new ArrayList<>(campanias);
        Collections.sort(listaCampanias);
        for (Campania c : listaCampanias) {
            System.out.println(c);
        }
    }

    public static void totalRecaudado(HashSet<Campania> campanias) {
        float total = 0;
        for (Campania c : campanias) {
            for (Donacion d : c.getDonaciones()) {
                total += d.getCantidad();
            }
        }
        System.out.println("La recaudacion total es de: " + total);
    }
    
        public static void mayorDonacion(HashSet<Campania> campanias) {
        float mayorDonacion = Float.MIN_VALUE;
        for (Campania c : campanias) {
            for (Donacion d : c.getDonaciones()) {
                if (d.getCantidad() > mayorDonacion) {
                mayorDonacion = d.getCantidad();
                }
            }
        }
        System.out.println("La mayor donacion es de: " + mayorDonacion);
    }

    public static void opcionesMenu() {
        System.out.println("1. Add campania");
        System.out.println("2. Add donacion");
        System.out.println("3. Mostrar campanias junto con donaciones");
        System.out.println("4. Mostrar campania por nombre");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Mostrar mayor donacion");
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
