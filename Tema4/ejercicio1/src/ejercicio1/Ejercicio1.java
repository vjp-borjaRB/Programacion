package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Borja Romero
 */
public class Ejercicio1 {

    public static void negativoPositivo(int numero) {
        if (numero > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Por favor, introduzca un numero:");
        numero = entrada.nextInt();
        negativoPositivo(numero);
    }

}
