package ejercicio24;

/**
 *
 * @author Borja Romero
 */
public class Producto {

    //Atributos
    private String fechaCaducidad;
    private String numeroLote;

    // Constructores
    public Producto() {
        fechaCaducidad = "";
        numeroLote = "";
    }

    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // Get & Set
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + '}';
    }

    public String mostrarProducto() {
        return "Fecha Caducidad: " + fechaCaducidad + "\nNumero Lote: " + numeroLote;
    }
}
