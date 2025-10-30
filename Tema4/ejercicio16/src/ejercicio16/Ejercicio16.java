package ejercicio16;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        raizCuadrada();
        potenciaNumero();
        exponencialNumero();
        logaritmoNumero();
        menorNumero();
        absolutoNumero();
        redondearNumero();
        senoNumero();
    }

    public static void raizCuadrada() {
        int numero = 64;
        System.out.println("La raiz cuadrada de 64 es: " + Math.sqrt(numero));
    }

    public static void potenciaNumero() {
        int numero1 = 8;
        int numero2 = 3;
        System.out.println("8 elevado al cubo es: " + Math.pow(numero1, numero2));
    }

    public static void exponencialNumero() {
        int numero = 2;
        System.out.println("El exponencial de 2 es: " + Math.exp(numero));
    }

    public static void logaritmoNumero() {
        double numero = 2.71828;
        System.out.println("La raiz cuadrada de 64 es: " + Math.log(numero));
    }

    public static void menorNumero() {
        int numero1 = 2;
        int numero2 = 3;
        System.out.println("El numero menor entre 2 y 3 es: " + Math.min(numero1, numero2));
    }

    public static void absolutoNumero() {
        double numero = -4.5;
        System.out.println("El valor absoluto de -4.5 es: " + Math.abs(numero));
    }

    public static void redondearNumero() {
        double numero = -4.5;
        System.out.println("-4.5 redondeado es: " + Math.round(numero));
    }

    public static void senoNumero() {
        int numero = 45;
        System.out.println("El seno de 45 es: " + Math.sin(numero));

    }

}
