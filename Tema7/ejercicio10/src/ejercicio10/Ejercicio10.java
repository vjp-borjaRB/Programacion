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
        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] == numero) {
                    vector[j] = 0;
                }
            }
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
