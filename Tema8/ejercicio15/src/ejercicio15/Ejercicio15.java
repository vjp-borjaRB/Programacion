package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ejercicio15 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pelicula[] peliculas = new Pelicula[5];
        String[] nombrePeliculas = {"Matrix", "Pulp Fiction", "The Godfather", "Forrest Gump", "Lord of the Rings"};
        String[] nombreSocios = {"Alejandro", "Maria", "Laura", "Pedro", "Diego"};
        menu(peliculas, nombrePeliculas, nombreSocios, entrada);
    }
    
    public static void menu(Pelicula[] peliculas, String[] nombrePeliculas, String[] nombreSocios, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirOpcion(entrada);
            switch (menu) {
                case 1 -> {
                    Pelicula.rellenarPeliculasSocios(peliculas, nombrePeliculas, nombreSocios);
                }
                case 2 -> {
                    Pelicula.mostrarPeliculas(peliculas);
                }
                case 3 -> {
                    Pelicula.masRentable(peliculas);
                }
                case 4 -> {
                    Pelicula.menosRentable(peliculas);
                }
                case 5 -> {
                    String nombre = pedirNombre();
                    Pelicula.peliculaPorNombre(peliculas, nombre);
                }
                case 6 -> {
                }
                case 7 -> {
                }
            }
        } while (menu != 7);
    }
    
    public static void mostrarOpciones() {
        System.out.println("1. Rellenar las peliculas y los socios");
        System.out.println("2. Mostrar peliculas y socios que las han visto");
        System.out.println("3. Pelicula mas rentable");
        System.out.println("4. Pelicula menos rentable");
        System.out.println("5. Mostrar beneficio neto y informacion de socios segun pelicula");
        System.out.println("6. Mostrar socios por donaciones");
        System.out.println("7. Salir del programa");
    }
    
    public static int pedirOpcion(Scanner entrada) {
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la pelicula: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
}
