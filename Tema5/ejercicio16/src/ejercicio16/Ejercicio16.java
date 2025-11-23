package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(pedirNombre(), escribirCalificacion(comprobarNota(pedirNota())));
        Alumno alumno2 = new Alumno(pedirNombre(), escribirCalificacion(comprobarNota(pedirNota())));
        Alumno alumno3 = new Alumno(pedirNombre(), escribirCalificacion(comprobarNota(pedirNota())));
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    public static double pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota = entrada.nextDouble();
        return nota;
    }

    public static double comprobarNota(double nota) { // Si la nota introducida es menor que 0 o mayor que 10, se vuelve a pedir.
        while (nota < 0 || nota > 10) {
            System.err.println("Has introducido una nota invalida");
            nota = pedirNota();
        }
        return nota;
    }

    public static String escribirCalificacion(double nota) { // Según el valor de nota devolvemos un String con la calificación.
        String calificacion;
        if (nota >= 0 && nota <= 4) {
            calificacion = "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            calificacion = "Bien";
        } else if (nota >= 7 && nota <= 8) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }
        return calificacion;
    }

}
