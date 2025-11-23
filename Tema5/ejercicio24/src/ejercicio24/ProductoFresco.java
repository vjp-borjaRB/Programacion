package ejercicio24;

/**
 *
 * @author Borja Romero
 */
public class ProductoFresco extends Producto {
    //Atributos
    private String fechaEnvasado;
    private String paisOrigen;

    // Constructores
    public ProductoFresco() {
        super();
        fechaEnvasado = "";
        paisOrigen = "";
    }

    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    // Get & Set
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // Mostrar
    @Override
    public String toString() {
        return super.toString() + "ProductoFresco{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }

    @Override
    public String mostrarProducto() {
        return """
               PRODUCTO FRESCO
               Fecha envasado:\s""" + fechaEnvasado + "\n"
                + "Pais Origen: " + paisOrigen + "\n" + super.mostrarProducto();

    }

}
