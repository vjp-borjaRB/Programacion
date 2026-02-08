package ejercicio11;

/**
 *
 * @author Borja Romero
 */
public class Mueble {

    // Atributos
    private double precio;
    private String descripcion;

    // Constructores
    public Mueble() {
        precio = 0;
        descripcion = "";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Get & Set
    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Mostrar / toString
    @Override
    public String toString() {
        return "Precio -> " + precio + " Descripcion -> " + descripcion;
    }

}
