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
        String[] nombreDias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        menu(entrada, dia, nombreDias);
    }

    public static void menu(Scanner entrada, Dia[] dia, String[] nombreDias) {
        int menu;
        do {
            mostrarMenu();
            menu = entrada.nextInt();
            switch (menu) {
                case 1 -> {
                    rellenarDatos(dia, nombreDias);
                }
                case 2 -> {
                    mostrarTemperaturas(dia);
                }
                case 3 -> {
                    mostrarTempmedia(dia);
                }
                case 4 -> {
                    mostrarCalurosos(dia);
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

    public static void rellenarDatos(Dia[] dia, String[] nombreDias) {
        int diaInicio = (int) (Math.random() * 7);
        int temperatura;
        for (int i = 0; i < dia.length; i++) {
            dia[i] = new Dia();
            String nombreDia = nombreDias[(diaInicio + i) % 7]; // %7 para no salirse del array
            dia[i].setNombreDia(nombreDia);
            temperatura = (int) (Math.random() * 26) - 10;
            dia[i].setTemperatura(temperatura);
        }
    }

    public static void mostrarTemperaturas(Dia[] dia) {
        for (int i = 0; i < dia.length; i++) {
            System.out.println(dia[i].getNombreDia() + " dia " + i + ": " + dia[i].getTemperatura() + " ");
        }
    }

    public static void mostrarTempmedia(Dia[] dia) {
        int tempMedia = 0;
        for (Dia i : dia) {
            tempMedia += i.getTemperatura();
        }
        System.out.println("La temperatura media del mes es: " + tempMedia / dia.length + " grados");
    }

    public static void mostrarCalurosos(Dia[] dia) {
        int tempmax = 0;
        for (Dia i : dia) {
            if (tempmax < i.getTemperatura()) {
                tempmax = i.getTemperatura();
            }
        }
        System.out.println("Los dias mas calurosos fueron: ");
        for (int i = 0; i < dia.length; i++) {
            if (tempmax == dia[i].getTemperatura()) {
                System.out.println("El " + dia[i].getNombreDia() + " dia " + i + ": "
                        + "" + tempmax + " grados");
            }
        }
    }
}
