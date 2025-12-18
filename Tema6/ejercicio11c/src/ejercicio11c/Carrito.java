package ejercicio11c;

/**
 *
 * @author Borja Romero
 */
public class Carrito implements Descontable, Pagable {

    private float total;

    public Carrito() {
        total = 0;
    }

    public Carrito(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + '}';
    }

    @Override
    public void aplicarDescuento(float descuento) {
        if (total > 50) {
            total = total - (total * descuento / 100);
        }
    }

    @Override
    public float pagoTarjeta() {
        total = total + 5;
        return total;
    }

    @Override
    public float pagoEfectivo() {
        return total;
    }

    @Override
    public float pagoPaypal() {
        total = total - (total * 3 / 100);
        return total;
    }

    @Override
    public void procesarPago() {
        aplicarDescuento(10);
    }
}
