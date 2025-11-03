package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        mayorDeEdad(pedirNombre(), pedirEdad());
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    public static int pedirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();
        return edad;
    }

    public static void mayorDeEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }
}
