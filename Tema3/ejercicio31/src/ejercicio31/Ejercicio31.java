package ejercicio31;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        double aleatorio;
        int aleatorioEntero, numero, intentos = 0, totalNum = 0;
        do {
            aleatorio = Math.floor((Math.random() * 100 + 1));
            aleatorioEntero = (int) aleatorio;
            if (aleatorioEntero % 2 != 0) {
                numero = aleatorioEntero;
                totalNum++;
                intentos++;
                System.out.println(numero);
            } else {
                intentos++;
            }
        } while (totalNum <= 2);
        System.out.println("El programa ha necesitado " + intentos + " intentos");
    }
}
