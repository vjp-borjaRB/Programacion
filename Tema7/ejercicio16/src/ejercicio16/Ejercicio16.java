package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] alumno = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignatura = {"Lengua", "Mates", "Historia", "Fisica"};
        int[][] nota = new int[4][6];
        menu(entrada, alumno, asignatura, nota);
    }

    public static void menu(Scanner entrada, String[] alumno, String[] asignatura, int[][] nota) { // Menú.
        int menu;
        do {
            imprimirMenu();
            menu = pedirOpcion(entrada);
            switch (menu) {
                case 1 -> {
                    rellenarNotas(alumno, asignatura, nota, entrada);
                }
                case 2 -> {
                    mostrarNotas(alumno, asignatura, nota);
                }
                case 3 -> {
                    mejorAlumno(alumno, asignatura, nota);
                }
                case 4 -> {
                    peorAlumno(alumno, asignatura, nota);
                }
                case 5 -> {
                    asignaturaDificil(alumno, asignatura, nota);
                }
                case 6 -> {
                }

            }
        } while (menu != 6);
    }

    public static int pedirOpcion(Scanner entrada) { // Entrada usuario.
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void imprimirMenu() { // Mostrar opciones menú.
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar notas alumnos.");
        System.out.println("3. Mejor alumno de la clase.");
        System.out.println("4. Alumno con mas suspensos.");
        System.out.println("5. Asignatura mas dificil.");
        System.out.println("6. Salir del programa.");
    }

    public static void rellenarNotas(String[] alumno, String[] asignatura, int[][] nota, Scanner entrada) { // Asignar notas a cada alumno (muestra nombre de asignatura y nombre de todos los alumnos para cada asignatura).
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
            System.out.println(asignatura[asignaturas]);
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
                System.out.println(alumno[alumnos]);
                nota[asignaturas][alumnos] = entrada.nextInt();
            }
        }
    }

    public static void mostrarNotas(String[] alumno, String[] asignatura, int[][] nota) { // Muestra las notas de los alumnos ordenadas por asignatura.
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
            System.out.println(asignatura[asignaturas]);
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
                System.out.println(alumno[alumnos] + "--> Nota: " + nota[asignaturas][alumnos]);
            }
        }
    }

    public static void mejorAlumno(String[] alumno, String[] asignatura, int[][] nota) { // Mostrar nombre del alumno con la nota media mas alta.
        int mediaMax = 0;
        String mejorAlumno = "";
        for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
            int suma = 0;
            for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
                suma += nota[asignaturas][alumnos]; // Acumula las notas del alumno de las distintas asignaturas.
            }
            int notamedia = suma / asignatura.length; // Calcula la nota media del alumno.
            if (notamedia > mediaMax) { // Si la nota media del alumno es mayor que la nota media máxima, la nota pasa a ser la nota máxima y guarda el nombre del alumno en una variable.
                mediaMax = notamedia;
                mejorAlumno = alumno[alumnos];
            }
        }
        System.out.println(mejorAlumno);
    }

    public static void peorAlumno(String[] alumno, String[] asignatura, int[][] nota) { // Mostrar el nombre del alumno con mayor número de suspensos.
        int maxSuspensos = 0;
        String peorAlumno = "";
        for (int alumnos = 0; alumnos < alumno.length; alumnos++) { // Recorrer alumnos.
            int nsuspensos = 0;
            for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) { // Recorrer asignaturas.
                if (nota[asignaturas][alumnos] < 5) { // Si la nota de la asignatura es suspoenso, se incrementa el número de suspensos.
                    nsuspensos++;
                }
            }
            if (nsuspensos > maxSuspensos) { // Si el numero de suspensos del alumno es mayor que el numero máximo de suspensos, se establece como máximo y se guarda el nombre del alumno en una variable.
                maxSuspensos = nsuspensos;
                peorAlumno = alumno[alumnos];
            }
        }
        System.out.println(peorAlumno);
    }

    public static void asignaturaDificil(String[] alumno, String[] asignatura, int[][] nota) { // Mostrar asignatura con peor nota media de alumnos.
        int peorMedia = 11;
        String asignaturaDificil = "";
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) { // Recorrer asignaturas.
            int mediaAsignatura = 0;
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) { // Recorrer alumnos y acumular las notas para esa asignatura.
                mediaAsignatura += nota[asignaturas][alumnos];
            }
            mediaAsignatura = mediaAsignatura / alumno.length; // Calcular media de la asignatura (total de notas entre numero de alumnos)
            if (mediaAsignatura < peorMedia) { // Si la media de la asignatura es peor que la de asignatura anterior se establece como la peor y se guarda el nombre de la asignatura en una variable.
                peorMedia = mediaAsignatura;
                asignaturaDificil = asignatura[asignaturas];
            }
        }
        System.out.println("La asignatura mas dificil es: " + asignaturaDificil);
    }
}
