package ejercicio7;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listaTemperaturas = new ArrayList<ArrayList<Integer>>();
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        mainMenu(listaTemperaturas, diasSemana, entrada);
    }

    public static void mostrarOpciones() {
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }

    public static void mainMenu(ArrayList<ArrayList<Integer>> listaTemperaturas, String[] diasSemana, Scanner entrada) {
        int menu;
        mostrarOpciones();
        menu = pedirInt(entrada);
        do {
            switch (menu) {
                case 1 -> {
                    rellenarTemperaturas(listaTemperaturas, diasSemana, entrada);
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

    public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> listaTemperaturas, String[] diasSemana, Scanner entrada) {
        for (int i = 0; i <= 3; i++) {
            listaTemperaturas.add(new ArrayList<Integer>());
            System.out.println("Semana " + i);
            for (int j = 0; j < listaTemperaturas.get(i).size(); j++) {
                System.out.println("Introduce la temperatura del dia " + diasSemana[j]);
                listaTemperaturas.get(i).add(pedirInt(entrada));
            }
        }
    }

    public static int pedirInt(Scanner entrada) {
        int numero = entrada.nextInt();
        return numero;
    }

}
