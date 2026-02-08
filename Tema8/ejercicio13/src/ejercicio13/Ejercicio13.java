package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[5];
        mostrarMenu(alumnos, entrada);
    }

    public static void mostrarMenu(Alumno[] alumnos, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirEntero(entrada);
            switch (menu) {
                case 1 -> {
                    rellenarAlumno(alumnos, entrada);
                }
                case 2 -> {
                    mostrarAlumnos(alumnos);
                }
                case 3 -> {
                    System.out.println("Inroduce nota media: ");
                    float nota = pedirFloat(entrada);
                    alumnosPorNota(alumnos, nota);
                }
                case 4 -> {
                    alumnosMediaSuspensa(alumnos);
                }
                case 5 -> {
                    System.out.println("Introduce nombre del alumno: ");
                    String nombre = pedirString(entrada);
                    buscarAlumno(alumnos, nombre);
                }
                case 6 -> {
                }
            }
        } while (menu != 6);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar vector alumnos");
        System.out.println("3. Mostrar alumnos con mejor nota media");
        System.out.println("4. Mostrar alumnos con nota media suspensa");
        System.out.println("5. Buscar alumnos");
        System.out.println("6. Salir del programa");
    }

    public static void rellenarAlumno(Alumno[] alumnos, Scanner entrada) {
        boolean creado = false;
        do {
            System.out.println("Introduce posicion en el array: ");
            int posicion = pedirEntero(entrada);
            System.out.println("Introduce nombre del alumno: ");
            String nombre = pedirString(entrada);
            System.out.println("Introduce edad: ");
            int edad = pedirEntero(entrada);
            System.out.println("Introduce la nota media");
            float media = pedirFloat(entrada);
            try {
                creado = comprobarPosicion(alumnos, posicion, nombre, edad, media); // Almacena en creado true o false, si es false se vuelven a pedir todos los datos.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Fuera de los limites del array (0 a 4)");
            }
        } while (!creado);
    }

    public static boolean comprobarPosicion(Alumno[] alumnos, int posicion, String nombre, int edad, float media) {
        // Comprobando si no hay objetos en esa posicion del array, si no hay se crea el objeto, devuelve false si no se pudo crear el alumno.
        boolean creado = false;
        if (alumnos[posicion] == null) {
            alumnos[posicion] = new Alumno(nombre, edad, media);
            creado = true;
        } else {
            System.err.println("Ya existe un alumno en esa posicion");
        }
        return creado;
    }

    public static void mostrarAlumnos(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
            }
        }
    }

    public static void alumnosPorNota(Alumno[] alumnos, float nota) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                if (alumno.getNotaMedia() > nota) {
                    System.out.println(alumno);
                }
            }
        }
    }

    public static void alumnosMediaSuspensa(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                if (alumno.getNotaMedia() < 5) {
                    System.out.println(alumno);
                }
            }
        }
    }

    public static void buscarAlumno(Alumno[] alumnos, String nombre) {
        int i = 0;
        boolean nombreEncontrado = false;
        while (i < alumnos.length && !nombreEncontrado) { // Recorre el array alumnos, si el objeto no es nulo, 
            // se comprueba si el nombre del alumno corresponde con el introducido por el usuario. Si encuentra alguno para.
            if (alumnos[i] != null) {
                if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("El alumno " + alumnos[i].getNombre() + " esta matriculado");
                    nombreEncontrado = true;
                }
            }
            i++;
        }
        if (!nombreEncontrado) {
            System.err.println("No se encontraron alumnos con ese nombre");
        }
    }

    public static int pedirEntero(Scanner entrada) {
        int entero = 0;
        boolean valido = false;
        do {
            try {
                entero = entrada.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un entero");
                entrada.next();
            }
        } while (!valido);
        return entero;
    }

    public static float pedirFloat(Scanner entrada) {
        float tipoFloat = 0;
        boolean valido = false;
        do {
            try {
                tipoFloat = entrada.nextFloat();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero (puede contener decimales)");
                entrada.next();
            }
        } while (!valido);
        return tipoFloat;
    }

    public static String pedirString(Scanner entrada) {
        entrada.nextLine();
        String nombre = entrada.nextLine();
        return nombre;
    }

}
