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
                    mostrarAlummnos(lista);
                }
                case 3 -> {
                    mejorMedia(lista);
                }
                case 4 -> {
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

    public static void mostrarAlummnos(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void mejorMedia(ArrayList<Alumno> lista) {
        float mejorMedia = 0;
        String nombreAlumno = "";
        for (int i = 0; i < lista.size(); i++) {
            float suma = 0;
            for (int j = 0; j < lista.get(i).getNotas().length; j++) {
                suma += lista.get(i).getNotas()[j].getNota();
            }
            if (suma > mejorMedia) {
                mejorMedia = suma;
                nombreAlumno = lista.get(i).getNombre();
            }
        }
        System.out.println("El alumno con mejor media es: " + nombreAlumno + " con " + mejorMedia / 3);
    }

    public static void asignaturaDificil(ArrayList<Alumno> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(i).getNotas().length; j++) {
            
            }
        }
    }

    public static boolean finalizar() {
        boolean valida = false;
        boolean finalizar = false;
        while (!valida) {
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
        }
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
