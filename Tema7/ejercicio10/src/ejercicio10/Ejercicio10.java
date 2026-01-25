package ejercicio10;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio10 {

    public static void rellenarAleatorios(int[] vector) { // Generar 10 números aleatorios dentre 1 y 8 y añadirlos al array.
        for (int i = 0; i < vector.length; i++) {
            int aleatorio = (int) (Math.random() * 8) + 1;
            vector[i] = aleatorio;
        }

    }

    public static void sustituirRepetidos(int[] vector) { // Sustitur valores repetidos por 0.
        for (int i = 0; i < vector.length; i++) {   // Compara vector[i] con vector[j], si son iguales pone vector[j] a 0.
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] == vector[i]) {
                    vector[j] = 0;
                }
            }
        }
    }

    public static void mostrarArray(int[] vector) { // Mostrar números contenidos en el array.
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarAleatorios(vector);
        mostrarArray(vector);
        sustituirRepetidos(vector);
        mostrarArray(vector);

    }

}
