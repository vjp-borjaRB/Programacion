package ejercicio10;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio10 {

    public static void rellanarAleatorios(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            int aleatorio = (int) (Math.random() * 8) + 1;
            vector[i] = aleatorio;
        }

    }

    public static void sustituirRepetidos(int[] vector) {
        int numero = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numero;
        }
    }

    public static void mostrarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        rellanarAleatorios(vector);
        mostrarArray(vector);
        sustituirRepetidos(vector);
        mostrarArray(vector);

    }

}
