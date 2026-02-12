package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println("Introduce un dia de la semana: ");
        String dia = entrada.nextLine();
        for (int i = 0; i < diasSemana.length; i++) {
            if (dia.equalsIgnoreCase(diasSemana[i])) {
                System.out.println(dia + " es el dia " + (i + 1) + " de la semana");
            }
        }

    }
}
