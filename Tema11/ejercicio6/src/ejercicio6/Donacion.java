package ejercicio6;

/**
 *
 * @author Borja Romero
 */
public class Donacion implements Comparable<Donacion> {

    private String nombre;
    private float cantidad;

    public Donacion() {
        nombre = "";
        cantidad = 0;
    }

    public Donacion(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }

    @Override
    public int compareTo(Donacion o) {
        if (this.cantidad > o.cantidad) {
            return 1;
        } else if (this.cantidad < o.cantidad) {
            return -1;
        } else {
            return 0;
        }
    }
}
