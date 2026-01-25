package ejercicio17;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        int[] array = crearArray();
        mostrarArray(array);
        ordenarArray(array);
        mostrarArray(array);

    }

    public static int[] crearArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void ordenarArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int aux = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}

// 
