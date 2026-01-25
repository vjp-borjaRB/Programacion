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

    public static int[] crearArray() { // Método para devolver un array con números aleatorios del 0 al 9.
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static void mostrarArray(int[] array) { // Mostrar contenido del array.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void ordenarArray(int[] array) { // Ordenar los números contenidos en el array de menor a mayor.
        for (int i = 0; i < array.length - 1; i++) { // Recorrer al array n-1 veces (siendo n la cantidad de numeros del array)
            for (int j = 0; j < array.length - 1 - i; j++) { // Recorrer el array n-1 veces -i (ya que en cada iteración de i habremos colocado el número en su posición)
                int aux = array[j];
                if (array[j] > array[j + 1]) { // Si el número es mayor que el siguiente en el array cambiar su posición.
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}
