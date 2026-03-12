package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        String[] nombreAsignatura = {"Lengua", "Mates", "Fisica"};
        ArrayList<Alumno> lista = new ArrayList();
        mainMenu(lista, nombreAsignatura);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Introducir un nuevo alumno junto a sus notas");
        System.out.println("2. Mostrar alumnos introducidos hasta el momento");
        System.out.println("3. Mejor alumno (media)");
        System.out.println("4. Asignatura mas dificil (numero de suspensos)");
        System.out.println("5. Salir del programa");
    }

    public static void mainMenu(ArrayList<Alumno> lista, String[] nombreAsignatura) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt();
            switch (menu) {
                case 1 -> {
                    crearAlumno(lista, nombreAsignatura);
                }
                case 2 -> {
                    Alumno.mostrarAlummnos(lista);
                }
                case 3 -> {
                    Alumno.mejorMedia(lista);
                }
                case 4 -> {
                    Alumno.asignaturaDificil(lista);
                }
                case 5 -> {
                }
            }
        } while (menu != 5);
    }

    public static void crearAlumno(ArrayList<Alumno> lista, String[] nombreAsignatura) {
        boolean finalizar;
        do {
            String nombre;
            System.out.println("Introduce el nombre del alumno: ");
            nombre = pedirString();
            Alumno nuevo = new Alumno();
            nuevo.nombresAsignaturas(nombreAsignatura);
            nuevo.setNombre(nombre);
            for (int i = 0; i < nombreAsignatura.length; i++) {
                float nota;
                System.out.println("Introduce la nota de " + nombreAsignatura[i]);
                nota = pedirFloat();
                nuevo.getNotas()[i].setNota(nota);
            }
            lista.add(nuevo);
            finalizar = finalizar();
        } while (!finalizar);
    }

    public static boolean finalizar() {
        boolean valida, finalizar;
        finalizar = false;
        do {
            System.out.println("Desea continuar creando alumnos?");
            String respuesta = pedirString();
            if (respuesta.equalsIgnoreCase("Si")) {
                finalizar = false;
                valida = true;
            } else if (respuesta.equalsIgnoreCase("No")) {
                finalizar = true;
                valida = true;
            } else {
                System.err.println("Respuesta no valida (Si/No)");
                valida = false;
            }
        } while (!valida);
        return finalizar;
    }

    public static int pedirInt() {
        Scanner entradaInt = new Scanner(System.in);
        int entero;
        entero = entradaInt.nextInt();
        return entero;
    }

    public static String pedirString() {
        Scanner entradaString = new Scanner(System.in);
        String cadena;
        cadena = entradaString.nextLine();
        return cadena;
    }

    public static float pedirFloat() {
        Scanner entradaFloat = new Scanner(System.in);
        float comaFlotante;
        comaFlotante = entradaFloat.nextFloat();
        return comaFlotante;
    }
}
