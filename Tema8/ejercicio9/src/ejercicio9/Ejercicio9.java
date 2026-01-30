package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Alumno[] alumno = new Alumno[3];
        Asignatura[] asignatura = new Asignatura[4];
        String[] nombreAlumno = {"Pepe", "Juan", "Marta"};
        String[] nombreAsignatura = {"Lengua", "Mates", "Historia", "Fisica"};
    }

    public static void menu() {
        int menu;
        do {
            mostrarMenu();
            menu = pedirOpcion();
            switch (menu) {

                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
            }
        } while (menu != 6);
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas en el punto anterior");
        System.out.println("3. Mostrar mejor alumno de la clase");
        System.out.println("4. Mostrar alumno con mas suspensos");
        System.out.println("5. Asignaura con la nota media mas baja");
        System.out.println("6. Salir del programa");
    }

    public static int pedirOpcion() {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una opcion: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void rellenarNotas(Alumno[] alumno, String[] nombreAlumno, Asignatura[] asignatura, String[] nombreAsignatura) {
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumno();
            alumno[i].setNombreAlumno(nombreAlumno[i]);
            for (int j = 0; j < asignatura.length; j++) {
                asignatura[j] = new Asignatura();
                asignatura[j].setNombreAsignatura(nombreAsignatura[j]);
                asignatura[j].setNota(j);
            }
        }
    }
}
