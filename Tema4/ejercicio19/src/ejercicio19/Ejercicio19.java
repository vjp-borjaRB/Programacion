package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        mostrarPosicion(pedirDia());
    }

    public static String pedirDia() {
        Scanner entrada = new Scanner(System.in);
        String diaSemana;
        System.out.println("Por favor, introduce un dia de la semana");
        diaSemana = entrada.nextLine();
        return diaSemana;
    }

    public static void mostrarPosicion(String diaSemana) {
        if (diaSemana.equalsIgnoreCase("Lunes")) {
            System.out.println(diaSemana + " es el primer dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Martes")) {
            System.out.println(diaSemana + " es el segundo dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Miercoles")) {
            System.out.println(diaSemana + " es el tercer dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Jueves")) {
            System.out.println(diaSemana + " es el cuarto dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Viernes")) {
            System.out.println(diaSemana + " es el quinto dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println(diaSemana + " es el sexto dia de la semana");
        }
        if (diaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println(diaSemana + " es el septimo dia de la semana");
        }

    }

}
