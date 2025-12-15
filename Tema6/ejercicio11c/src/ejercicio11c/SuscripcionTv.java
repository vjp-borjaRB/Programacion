package ejercicio11c;

/**
 *
 * @author Borja Romero
 */
public class SuscripcionTv extends Suscripcion {

    @Override
    public void calcularPrecio() {
        System.out.println(getPrecioBase() * 21);
    }
}
