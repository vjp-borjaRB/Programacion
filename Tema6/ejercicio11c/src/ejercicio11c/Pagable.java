package ejercicio11c;

/**
 *
 * @author Borja Romero
 */
public interface Pagable {
    public float pagoTarjeta();
    public float pagoEfectivo();
    public float pagoPaypal();
    public void procesarPago();
}
