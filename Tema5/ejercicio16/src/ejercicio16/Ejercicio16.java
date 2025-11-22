package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(pedirNombre(), comprobarNota(pedirNota()));
        Alumno alumno2 = new Alumno(pedirNombre(), comprobarNota(pedirNota()));
        Alumno alumno3 = new Alumno(pedirNombre(), comprobarNota(pedirNota()));
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        return nota;
    }

    public static double comprobarNota(double nota) {
        boolean notaUsuario = false;
        if (nota >= 0 && nota <= 10) {
            notaUsuario = true;
        }
        while (!notaUsuario) {
            System.out.println("Introduce una nota valida: ");
            nota = pedirNota();
        }
        return nota;
    }

    public static void mostrarCalificacion(double nota) {
        if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }

}
