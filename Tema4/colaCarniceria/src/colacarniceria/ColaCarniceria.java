package colacarniceria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class ColaCarniceria {

    final static char LETRAINICIAL = 'A';
    final static char LETRAFINAL = 'C';
    public static int numeroCompra = 1;
    public static int numeroPedido = 1;

    public static void main(String[] args) {
        // Mostrando el menu, no saldremos del bucle hasta que el usuario no seleccione 3. Salir
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> {
                    generarNumeroEsperaCompra();
                    System.out.println(generarLetraAleatoria(LETRAINICIAL, LETRAFINAL));
                }
                case 2 -> {
                    generarNumeroEsperaPedido();
                    System.out.println(generarLetraAleatoria(LETRAINICIAL, LETRAFINAL));
                }
                case 3 ->
                    System.out.println("Has salido del programa");
            }

        } while (opcion != 3);

    }

    public static void mostrarMenu() {
        System.out.println("1. Comprar");
        System.out.println("2. Recoger pedido");
        System.out.println("3. Salir");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.print("Selecciona una opcion: ");
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) { // Si el usuario introduce una letra, se captura la excepción y se asigna el valor 0 a opción de forma que se siga ejecutando.
            System.err.println("Por favor, introduce un numero entre 1 y 3");
            opcion = 0;
        }
        return opcion;
    }

    public static char generarLetraAleatoria(char LETRAINICIAL, char LETRAFINAL) {
        char letraAleatoria;
        int letraInicialAscii, letraFinalAscii, aleatorioEntero;
        double aleatorio;
        letraInicialAscii = (int) LETRAINICIAL;
        letraFinalAscii = (int) LETRAFINAL;
        aleatorio = Math.floor((Math.random() * ((letraFinalAscii - letraInicialAscii) + 1) + letraInicialAscii));
        aleatorioEntero = (int) aleatorio;
        letraAleatoria = (char) aleatorioEntero;
        /* En resumen genera un numero aleatorio correspondiente al codigo ASCII para letras mayúsculas entre A Y C,
        posteriormente se convierte ese código ASCII al caracter correspondiente.*/
        return letraAleatoria;
    }

    public static void incrementarNumeroCompra() {
        numeroCompra++;
    }

    public static void incrementarNumeroPedido() {
        numeroPedido++;
    }

    public static void generarNumeroEsperaCompra() {
        System.out.println("C-" + numeroCompra);
        incrementarNumeroCompra();
    }

    public static void generarNumeroEsperaPedido() {
        System.out.println("P-" + numeroPedido);
        incrementarNumeroPedido();
    }

}
