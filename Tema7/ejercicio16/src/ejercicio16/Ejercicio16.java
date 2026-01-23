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
        mostrarMenu(entrada, alumno, asignatura, nota);
    }

    public static void mostrarMenu(Scanner entrada, String[] alumno, String[] asignatura, int[][] nota) {
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

    public static int pedirOpcion(Scanner entrada) {
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void imprimirMenu() {
        System.out.println("1. Rellenar las notas de los alumnos.");
        System.out.println("2. Mostrar notas alumnos.");
        System.out.println("3. Mejor alumno de la clase.");
        System.out.println("4. Alumno con mas suspensos.");
        System.out.println("5. Asignatura mas dificil.");
        System.out.println("6. Salir del programa.");
    }

    public static void rellenarNotas(String[] alumno, String[] asignatura, int[][] nota, Scanner entrada) {
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
            System.out.println(asignatura[asignaturas]);
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
                System.out.println(alumno[alumnos]);
                nota[asignaturas][alumnos] = entrada.nextInt();
            }
        }
    }

    public static void mostrarNotas(String[] alumno, String[] asignatura, int[][] nota) {
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
            System.out.println(asignatura[asignaturas]);
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
                System.out.println(alumno[alumnos] + "--> Nota: " + nota[asignaturas][alumnos]);
            }
        }
    }

    public static void mejorAlumno(String[] alumno, String[] asignatura, int[][] nota) {
        int mediaMax = 0;
        String mejorAlumno = "";
        for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
            int suma = 0;
            for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
                suma += nota[asignaturas][alumnos];
            }
            int notamedia = suma / asignatura.length;
            if (notamedia > mediaMax) {
                mediaMax = notamedia;
                mejorAlumno = alumno[alumnos];
            }
        }
        System.out.println(mejorAlumno);
    }

    public static void peorAlumno(String[] alumno, String[] asignatura, int[][] nota) {
        int maxSuspensos = 0;
        String peorAlumno = "";
        for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
            int nsuspensos = 0;
            for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
                if (nota[asignaturas][alumnos] < 5) {
                    nsuspensos++;
                }
            }
            if (nsuspensos > maxSuspensos) {
                maxSuspensos = nsuspensos;
                peorAlumno = alumno[alumnos];
            }
        }
        System.out.println(peorAlumno);
    }

    public static void asignaturaDificil(String[] alumno, String[] asignatura, int[][] nota) {
        int peorMedia = 11;
        String asignaturaDificil = "";
        for (int asignaturas = 0; asignaturas < asignatura.length; asignaturas++) {
            int mediaAsignatura = 0;
            for (int alumnos = 0; alumnos < alumno.length; alumnos++) {
                mediaAsignatura += nota[asignaturas][alumnos];
            }
            mediaAsignatura = mediaAsignatura / alumno.length;
            if (mediaAsignatura < peorMedia) {
                peorMedia = mediaAsignatura;
                asignaturaDificil = asignatura[asignaturas];
            }
        }
        System.out.println("La asignatura mas dificil es: " + asignaturaDificil);
    }
}
