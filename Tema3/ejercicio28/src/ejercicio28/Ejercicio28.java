package ejercicio28;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        double aleatorio;
        int aleatorioEntero;
        aleatorio = Math.floor((Math.random()*100+1));
        aleatorioEntero = (int) aleatorio;
        if (aleatorioEntero%2 == 0) {
        System.out.println(aleatorioEntero + " es par");
        } else {
        System.out.println(aleatorioEntero + " es impar");
        }
    }
    
}
