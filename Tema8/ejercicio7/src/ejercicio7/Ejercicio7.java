package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Dia[] dia = new Dia[30];
    }

    public static void menu(Scanner entrada) {
        int menu;
        do {
            mostrarMenu();
            menu = entrada.nextInt();
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
            }
        } while (menu != 5);
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar de forma aleatoria las temperaturas");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }
}
