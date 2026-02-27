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
        ArrayList<ArrayList<Integer>> listaTemperaturas = new ArrayList<>();
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
        boolean salir;
        do {
            salir = false;
            mostrarOpciones();
            menu = pedirInt(entrada);
            switch (menu) {
                case 1 -> {
                    rellenarTemperaturas(listaTemperaturas, diasSemana, entrada);
                }
                case 2 -> {
                    mostrarTemperaturas(listaTemperaturas, diasSemana);
                }
                case 3 -> {
                    mostrarTempMediaMes(listaTemperaturas);
                }
                case 4 -> {
                    mostrarMasCalurosos(listaTemperaturas, diasSemana);
                }
                case 5 -> {
                    salir = true;
                }
            }
        } while (!salir);
    }

    public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> listaTemperaturas, String[] diasSemana, Scanner entrada) {
        for (int i = 0; i < 4; i++) {
            int temperatura;
            listaTemperaturas.add(new ArrayList());
            System.out.println("Semana " + i);
            for (int j = 0; j < 7; j++) {
                System.out.println("Introduce la temperatura del dia " + diasSemana[j]);
                temperatura = pedirInt(entrada);
                listaTemperaturas.get(i).add(temperatura);
            }
        }
    }

    public static void mostrarTemperaturas(ArrayList<ArrayList<Integer>> listaTemperaturas, String[] diasSemana) {
        for (int i = 0; i < listaTemperaturas.size(); i++) {
            System.out.println("Semana " + i);
            for (int j = 0; j < listaTemperaturas.get(i).size(); j++) {
                System.out.println(diasSemana[j] + ": " + listaTemperaturas.get(i).get(j));
            }
        }
    }

    public static void mostrarTempMediaMes(ArrayList<ArrayList<Integer>> listaTemperaturas) {
        int tempMedia = 0;
        for (int i = 0; i < listaTemperaturas.size(); i++) {
            for (int j = 0; j < listaTemperaturas.get(i).size(); j++) {
                tempMedia += listaTemperaturas.get(i).get(j);
            }
        }
        System.out.println("La temperatura media del mes es: " + tempMedia / 28);
    }

    public static void mostrarMasCalurosos(ArrayList<ArrayList<Integer>> listaTemperaturas, String[] diasSemana) {
        int tempMax = Integer.MIN_VALUE;
        for (int i = 0; i < listaTemperaturas.size(); i++) {
            for (int j = 0; j < listaTemperaturas.get(i).size(); j++) {
                int temperaturaDia = listaTemperaturas.get(i).get(j);
                if (temperaturaDia > tempMax) {
                    tempMax = temperaturaDia;
                }
            }
        }
        for (int y = 0; y < listaTemperaturas.size(); y++) {
            for (int z = 0; z < listaTemperaturas.get(y).size(); z++) {
                if (listaTemperaturas.get(y).get(z) == tempMax) {
                    System.out.println("El dia " + diasSemana[z] + " de la semana " + y + " con " + listaTemperaturas.get(y).get(z) + " grados");
                }
            }
        }
    }

    public static int pedirInt(Scanner entrada) {
        int numero = entrada.nextInt();
        return numero;
    }

}
