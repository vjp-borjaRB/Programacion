package ejercicio16;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        int nImpares = 0, numero = 20;
        System.out.print("Los numeros impares existentes entre el numero 20 y el 160 son: ");
        /* Cada vez que se entra en el bucle incrementa el valor de numero para recorrer todo el rango de números, 
            si el numero es impar se incrementa nImpares y se imprime el número por pantalla. */
        do {
            numero++;
            if (numero % 2 != 0) {
                nImpares++;
                System.out.print(numero + "-");
            }
        } while (numero >= 20 && numero < 160);
        System.out.println("\nLa cantidad de numeros impares impresos han sido: " + nImpares);
    }
}
