package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Asignatura[] asignatura = new Asignatura[6];
        String[] asignaturas = {"Programacion", "Lenguaje de Marcas",
            "Bases de Datos", "Entornos de Desarrollo", "Sistemas Informaticos",
            "Formacion y Orientacion Laboral"};
        insertarAsignatura(asignaturas, asignatura);
    }
    
    public static double pedirNota(Scanner entrada) {
        double nota;
        System.out.print("Introduce la nota: ");
        nota = entrada.nextDouble();
        return nota;
    }
    
    public static void insertarAsignatura(String[] asignaturas, Asignatura[] asignatura) {
        for (int i = 0; i < asignatura.length; i++) {
            asignatura[i].setNombre(asignaturas[i]);
        }
    }
    
    public static void insertarNotas(Asignatura[] asignaturas, Scanner entrada) {
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduce la nota de " + asignaturas[i].getNombre());
            asignaturas[i].setNota(pedirNota(entrada));
        }
    }
    
}
