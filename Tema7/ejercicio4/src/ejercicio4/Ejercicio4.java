package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio4 {

    public static void rellenarAleatorios(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 101) + 100;
            }
        }

    }

    public static void mostrarPares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + i + j + "]-->" + matriz[i][j]);
            }

        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        rellenarAleatorios(matriz);
        mostrarPares(matriz);
    }

}
