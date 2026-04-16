package ejercicio6;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        int menu;
        String nombreFichero = "";
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    nombreFichero = volcarArray();
                }
                case 2 -> {
                    mostrarFichero(nombreFichero);
                }
            }

        } while (menu != 3);
    }

    public static String volcarArray() {
        String nombreFichero = "";
        try {
            int[] arrayPares = new int[100];
            for (int i = 0; i < arrayPares.length; i++) {
                arrayPares[i] = (i + 1) * 2;
            }
            System.out.println("Introduce el nombre del fichero: ");
            nombreFichero = pedirString();
            try (FileWriter fwr = new FileWriter(nombreFichero, true); PrintWriter pwr = new PrintWriter(fwr);) {
                for (int i = 0; i < arrayPares.length; i++) {
                    pwr.println(arrayPares[i]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo");
        }
        return nombreFichero;
    }

    public static void mostrarFichero(String nombreFichero) {
        try {

            try (FileReader fr = new FileReader(nombreFichero); BufferedReader br = new BufferedReader(fr);) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException f) {
            System.err.println("Error al leer el archivo");
        }
    }

    public static void mostrarOpciones() {
        System.out.println("1. Volcar array");
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
