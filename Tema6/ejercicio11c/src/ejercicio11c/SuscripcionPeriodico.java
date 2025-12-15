package ejercicio11c;

/**
 *
 * @author Borja Romero
 */
public class SuscripcionPeriodico extends Suscripcion {

    @Override
    public void calcularPrecio() {
        System.out.println(getPrecioBase() * 10);
    }
}
