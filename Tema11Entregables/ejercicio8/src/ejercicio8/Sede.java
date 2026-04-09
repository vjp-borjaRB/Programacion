package ejercicio8;

/**
 *
 * @author Borja Romero
 */
public class Sede {

    private String nombre;
    private float ingresosAnuales;

    public Sede() {
        nombre = "";
        ingresosAnuales = 0;
    }

    public Sede(String nombre, float ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresosAnuales=" + ingresosAnuales + '}';
    }

}
