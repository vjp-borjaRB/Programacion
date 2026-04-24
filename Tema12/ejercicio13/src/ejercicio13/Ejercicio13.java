package ejercicio13;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        escribirFichero();
        leerFichero();
    }

    public static void escribirFichero() {
        try {
            System.out.print("Introduce nombre y apellido:");
            String nombreApellido = pedirString();
            System.out.print("Introduce el sexo:");
            String sexo = pedirString();
            System.out.print("Introduce edad:");
            int edad = pedirInt();
            System.out.print("Introduce numero de suspensos:");
            int numeroSuspensos = pedirInt();
            System.out.print("Introduce residencia familiar:");
            String residenciaFamiliar = pedirString();
            System.out.print("Introduce ingresos:");
            int ingresos = pedirInt();
            Becario nuevo = new Becario(nombreApellido, sexo, edad, numeroSuspensos, residenciaFamiliar, ingresos);
            try (FileWriter fwr = new FileWriter("DatosBeca.txt", true); PrintWriter pwr = new PrintWriter(fwr)) {
                pwr.println(nuevo.datosBecario());
            }
        } catch (IOException w) {
            System.err.println("Error al escribir el archivo");
        } catch (InputMismatchException i) {
            System.err.println("Introduce el tipo de dato correcto");
        }

    }

    public static void leerFichero() {
        try {
            try (FileReader fr = new FileReader("DatosBeca.txt"); BufferedReader br = new BufferedReader(fr)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException r) {
            System.err.println("Error al leer el archivo");
        }
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena = entradaString.nextLine();
        return cadena;
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero = entradaInt.nextInt();
        return entero;
    }
}
