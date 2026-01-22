package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] diasemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[][] temperatura = new int[4][7];
        int menu;
        do {
            mostrarMenu();
            menu = seleccionarOpcion(entrada);
            switch (menu) {
                case 1 ->
                    rellenarTemperaturas(temperatura, diasemana, entrada);
                case 2 ->
                    mostrarTemperaturas(temperatura, diasemana);
                case 3 ->
                    System.out.println(mostrarTempmedia(temperatura));
                case 4 ->
                    mostrarCalurosos(temperatura, diasemana);
                case 5 ->
                    menu = 5;
            }
        } while (menu != 5);
    }

    public static int seleccionarOpcion(Scanner entrada) {
        int opcion;
        System.out.println("Introduce una opcion:");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarMenu() {
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Dia o dias mas calurosos del mes");
        System.out.println("5. Salir del programa");
    }

    public static void rellenarTemperaturas(int[][] temperatura, String[] diasemana, Scanner entrada) {
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana: " + (semana + 1));
            for (int dia = 0; dia < 7; dia++) {
                System.out.println("Dia: " + diasemana[dia]);
                temperatura[semana][dia] = entrada.nextInt();
            }
        }

    }

    public static void mostrarTemperaturas(int[][] temperatura, String[] diasemana) {
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana: " + (semana + 1));
            for (int dia = 0; dia < 7; dia++) {
                System.out.println("Temperatura del dia " + diasemana[dia] + ": " + temperatura[semana][dia]);
            }
        }
    }

    public static int mostrarTempmedia(int[][] temperatura) {
        int tempmedia = 0;
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                tempmedia += temperatura[semana][dia];
            }
        }
        tempmedia = tempmedia / 28;
        return tempmedia;
    }

    public static void mostrarCalurosos(int[][] temperatura, String[] diasemana) {
        int tmax = temperatura[0][0];
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temperatura[semana][dia] > tmax) {
                    tmax = temperatura[semana][dia];
                }
            }
        }
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temperatura[semana][dia] == tmax) {
                    System.out.println("Semana: " + (semana + 1) + "-" + diasemana[dia]);
                }
            }
        }
    }
}
