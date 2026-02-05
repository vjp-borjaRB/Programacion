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
                    Alumno.rellenarNotas(alumno, nombreAlumno, nombreAsignatura);
                }
                case 2 -> {
                    Alumno.mostrarNotas(alumno);
                }
                case 3 -> {
                    Alumno.mejorAlumno(alumno);
                }
                case 4 -> {
                    Alumno.masSuspensos(alumno);
                }
                case 5 -> {
                    Asignatura.asignaturaDificil(alumno, nombreAsignatura);
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
}
