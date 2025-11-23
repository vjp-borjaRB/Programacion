package ejercicio24;

/**
 *
 * @author Borja Romero
 */
public class ProductoRefrigerado extends Producto {
    //Atributos
    private String codigoSupervisionAlimentaria;

    // Constructores
    public ProductoRefrigerado() {
        super();
        codigoSupervisionAlimentaria = "";
    }

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoSupervisionAlimentaria) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    // Get & Set
    public String getCodigoSupervisionAlimentaria() {
        return codigoSupervisionAlimentaria;
    }

    public void setCodigoSupervisionAlimentaria(String codigoSupervisionAlimentaria) {
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    // Mostrar
    @Override
    public String toString() {
        return super.toString() + "ProductoRefrigerado{" + "codigoSupervisionAlimentaria=" + codigoSupervisionAlimentaria + '}';
    }

    @Override
    public String mostrarProducto() {
        return """
               PRODUCTO REFRIGERADO
               Codigo Supervision Alimentaria:\s"""
                + codigoSupervisionAlimentaria + "\n" + super.mostrarProducto();
    }
}
