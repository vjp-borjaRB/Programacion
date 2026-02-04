package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Alumno[] alumno = new Alumno[3];
        String[] nombreAlumno = {"Pepe", "Juan", "Marta"};
        String[] nombreAsignatura = {"Lengua", "Mates", "Historia", "Fisica"};
        menu(alumno, nombreAlumno, nombreAsignatura);
    }

    public static void menu(Alumno[] alumno, String[] nombreAlumno, String[] nombreAsignatura) {
        int menu;
        do {
            mostrarMenu();
            menu = pedirOpcion();
            switch (menu) {

                case 1 -> {
                    rellenarNotas(alumno, nombreAlumno, nombreAsignatura);
                }
                case 2 -> {
                    mostrarNotas(alumno);
                }
                case 3 -> {
                    mejorAlumno(alumno);
                }
                case 4 -> {
                    masSuspensos(alumno);
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

    public static void rellenarNotas(Alumno[] alumno, String[] nombreAlumno, String[] nombreAsignatura) {
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Alumno();
            alumno[i].setNombreAlumno(nombreAlumno[i]);
            Asignatura[] notas = new Asignatura[nombreAsignatura.length];
            alumno[i].setNotas(notas);
            for (int j = 0; j < notas.length; j++) {
                float nota = (float) (Math.random() * 10);
                notas[j] = new Asignatura(nombreAsignatura[j], nota);
                alumno[i].setNotas(notas);
            }
        }
    }

    public static void mostrarNotas(Alumno[] alumno) {
        for (Alumno i : alumno) {
            System.out.println(i.getNombreAlumno());
            for (Asignatura nota : i.getNotas()) {
                System.out.println(nota.getNombreAsignatura());
                System.out.println(nota.getNota());
            }
        }
    }

    public static void mejorAlumno(Alumno[] alumno) {
        float maxMedia = 0;
        String mejorAlumno = "";
        for (int i = 0; i < alumno.length; i++) {
            float suma = 0;
            for (int j = 0; j < alumno[i].getNotas().length; j++) {
                suma += alumno[i].getNotas()[j].getNota();
            }
            if (suma / alumno[i].getNotas().length > maxMedia) {
                maxMedia = suma / alumno[i].getNotas().length;
                mejorAlumno = alumno[i].getNombreAlumno();
            }
        }
        System.out.println(mejorAlumno);
    }

    public static void masSuspensos(Alumno[] alumno) {
        int maxSuspensos = 0;
        String peorAlumno = "";
        for (int i = 0; i < alumno.length; i++) {
            int nSuspensos = 0;
            for (int j = 0; j < alumno[i].getNotas().length; j++) {
                if (alumno[i].getNotas()[j].getNota() < 5) {
                    nSuspensos++;
                }
            }
            if (nSuspensos > maxSuspensos) {
                maxSuspensos = nSuspensos;
                peorAlumno = alumno[i].getNombreAlumno();
            }
        }
        System.out.println(peorAlumno);
    }

    public static void asignaturaDificil(Alumno[] alumno) {
        
    }
}
