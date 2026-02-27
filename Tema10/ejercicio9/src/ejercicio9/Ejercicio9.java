package ejercicio9;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Dia> listaDias = new ArrayList();
        mainMenu(listaDias, entrada);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar temperaturas de forma aleatoria");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Visualizar temperatura media del mes");
        System.out.println("4. Dia/dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }

    public static void mainMenu(ArrayList<Dia> listaDias, Scanner entrada) {
        int menu;
        do {
            mostrarOpciones();
            menu = pedirInt(entrada);
            switch (menu) {
                case 1 -> {
                }
            }

        } while (menu != 5);
    }

    public static int pedirInt(Scanner entrada) {
        int entero;
        entero = entrada.nextInt();
        return entero;
    }

}
