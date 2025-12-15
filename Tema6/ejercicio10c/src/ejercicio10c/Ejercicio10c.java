package ejercicio10c;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio10c {

    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico(2, 0.15f, 0.8f);
        System.out.println(electrodomestico1.calcularConsumo(2));
        System.out.println(electrodomestico1.calcularFactura(5));
    }
}
