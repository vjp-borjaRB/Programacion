package ejercicio11c;

/**
 *
 * @author Borja Romero
 */
public abstract class Suscripcion {

    private double precioBase;

    public Suscripcion() {
        precioBase = 0;
    }

    public Suscripcion(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Suscripcion{" + "precioBase=" + precioBase + '}';
    }

    public abstract void calcularPrecio();
}
