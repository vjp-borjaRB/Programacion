package ejercicio5;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        FileWriter fwr = new FileWriter("agenda.txt");
        BufferedWriter bwr = new BufferedWriter(fwr);
        FileReader fr = new FileReader("agenda.txt");
        BufferedReader br = new BufferedReader(fr);
        mainMenu(fwr, bwr, fr, br);
    }

    public static void mainMenu(FileWriter fwr, BufferedWriter bwr, FileReader fr, BufferedReader br) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            try {
                switch (menu) {
                    case 1 -> {
                        addContactos(fwr, bwr);
                    }
                    case 2 -> {
                        visualizarLista(fr, br);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("Introduce el tipo de dato correcto");
            } catch (IOException ei) {
                System.err.println("Error al escribir el archivo");
            }
        } while (menu != 3);
    }

    public static void addContactos(FileWriter fwr, BufferedWriter bwr) throws InputMismatchException, IOException {
        String nombre, telefono;
        int edad;
        System.out.print("Introduce el nombre: ");
        nombre = pedirString();
        System.out.print("Introduce la edad: ");
        edad = pedirInt();
        System.out.print("Introduce el telefono: ");
        telefono = pedirString();
        Contacto nuevo = new Contacto(nombre, edad, telefono);
        
    }

    public static void visualizarLista(FileReader fr, BufferedReader br) {

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
