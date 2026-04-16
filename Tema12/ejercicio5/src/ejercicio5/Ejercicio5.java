package ejercicio5;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        mainMenu();
    }

    public static void mainMenu() {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    addContactos();
                }
                case 2 -> {
                    visualizarLista();
                }
            }
        } while (menu != 3);
    }

    public static void addContactos() {
        try {
            FileWriter fwr = new FileWriter("agenda.txt", true);
            try (PrintWriter pwr = new PrintWriter(fwr)) {
                String nombre, telefono;
                int edad;
                System.out.print("Introduce el nombre: ");
                nombre = pedirString();
                System.out.print("Introduce la edad: ");
                edad = pedirInt();
                System.out.print("Introduce el telefono: ");
                telefono = pedirString();
                Contacto nuevo = new Contacto(nombre, edad, telefono);
                pwr.println(nuevo);
            }
        } catch (IOException e) {
            System.err.println("No se encuentra el archivo");
        } catch (InputMismatchException f) {
            System.err.println("Introduce el tipo de dato correcto");
        }
    }

    public static void visualizarLista() {
        try {
            FileReader fr = new FileReader("agenda.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String linea;
                linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer al archivo");
        }
    }

    public static void mostrarOpciones() {
        System.out.println("1. Add contactos");
        System.out.println("2. Mostrar el contenido del archivo");
        System.out.println("3. Salir del programa");
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
