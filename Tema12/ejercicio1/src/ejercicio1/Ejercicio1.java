package ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        mainMenu(listaContactos);
    }

    public static void mainMenu(ArrayList<Contacto> listaContactos) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            try {
                switch (menu) {
                    case 1 -> {
                        addContactos(listaContactos);
                    }
                    case 2 -> {
                        visualizarLista(listaContactos);
                    }
                    case 3 -> {
                        eliminarContacto(listaContactos);
                    }
                    case 4 -> {
                        mostrarPorEdad(listaContactos);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Introduce el tipo de dato correcto");
            }
        } while (menu != 5);
    }

    public static void addContactos(ArrayList<Contacto> listaContactos) throws InputMismatchException {
        String nombre, telefono;
        int edad;
        System.out.print("Introduce el nombre: ");
        nombre = pedirString();
        System.out.print("Introduce la edad: ");
        edad = pedirInt();
        System.out.print("Introduce el telefono: ");
        telefono = pedirString();
        Contacto nuevo = new Contacto(nombre, edad, telefono);
        listaContactos.add(nuevo);
    }

    public static void visualizarLista(ArrayList<Contacto> listaContactos) {
        for (Contacto contactoI : listaContactos) {
            System.out.println(contactoI);
        }
    }

    public static void eliminarContacto(ArrayList<Contacto> listaContactos) {
        String telefono;
        int i = 0;
        boolean encontrado = false;
        System.out.print("Introduce el numero de telefono: ");
        telefono = pedirString();
        while (i < listaContactos.size() && !encontrado) {
            if (listaContactos.get(i).getTelefono().equals(telefono)) {
                listaContactos.remove(i);
                encontrado = true;
            } else {
                i++;
            }
        }
    }

    public static void mostrarPorEdad(ArrayList<Contacto> listaContactos) {
        Collections.sort(listaContactos);
        for (Contacto contactoI : listaContactos) {
            System.out.println(contactoI);
        }
    }

    public static void mostrarOpciones() {
        System.out.println("1. Add contactos");
        System.out.println("2. Visualizar contactos");
        System.out.println("3. Eliminar contactos de la lista");
        System.out.println("4. Mostrar contactos por edad");
        System.out.println("5. Salir del programa");
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

}
