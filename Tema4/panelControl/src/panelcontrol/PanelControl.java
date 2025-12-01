package panelcontrol;

import java.util.Scanner;

/**
 *
 * @author Borja Romero
 */
public class PanelControl {

    public static void main(String[] args) { // Muestra el menu, pide opción y no se sale del bucle hasta que el usuario introduzca 4. Salir
        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 ->
                    analizarSignal(pedirFrecuencia());
                case 2 ->
                    ajustarPotencia(pedirValor1(), pedirValor2(), pedirValor3());
                case 3 ->
                    calcularVolumen(pedirRadio());
                case 4 ->
                    opcion = 4;
            }

        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("1. Analizar señal recibida del espacio");
        System.out.println("2. Ajustar las potencias de sus motores antes del lanzamiento");
        System.out.println("3. Calcular el volumen de un planeta");
        System.out.println("4. Salir del programa");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.print("Por favor, introduce una opcion: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static int pedirFrecuencia() {
        Scanner entrada = new Scanner(System.in);
        int frecuenciaSignal;
        System.out.println("Introduce la frecuencia de signal");
        frecuenciaSignal = entrada.nextInt();
        return frecuenciaSignal;
    }

    public static void analizarSignal(int frecuenciaSignal) {
        int numero = 2;
        while (frecuenciaSignal % numero != 0) {
            if (frecuenciaSignal % numero != 0) {
                System.out.println(numero);
            } else {
                numero++;
            }
        }
    }

    public static int pedirValor1() {
        Scanner entrada = new Scanner(System.in);
        int valor1;
        System.out.println("Introduce el primer valor");
        valor1 = entrada.nextInt();
        return valor1;
    }

    public static int pedirValor2() {
        Scanner entrada = new Scanner(System.in);
        int valor2;
        System.out.println("Introduce el segundo valor");
        valor2 = entrada.nextInt();
        return valor2;
    }

    public static int pedirValor3() {
        Scanner entrada = new Scanner(System.in);
        int valor3;
        System.out.println("Introduce el tercer valor");
        valor3 = entrada.nextInt();
        return valor3;
    }

    public static void ajustarPotencia(int valor1, int valor2, int valor3) {
        // Se comparan los números 2 a 2 y se van sustituyendo según su valor (si es necesario), se utiliza una variable auxiliar para no perder valores al sustituir.
        int aux;
        for (int i = 0; i <= 2; i++) {
            if (valor1 > valor2) {
                aux = valor2;
                valor2 = valor1;
                valor1 = aux;
            }
            if (valor2 > valor3) {
                aux = valor3;
                valor3 = valor2;
                valor2 = aux;
            }
        }
        System.out.println(valor1 + "-" + valor2 + "-" + valor3);
    }

    public static double pedirRadio() {
        Scanner entrada = new Scanner(System.in);
        double radio;
        radio = entrada.nextDouble();
        return radio;
    }

    public static void calcularVolumen(double radio) {
        double resultado;
        resultado = 4 / 3 * Math.PI * Math.pow(radio, 3);
        System.out.println(resultado);
    }
}
