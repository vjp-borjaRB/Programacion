package ejercicio24;

/**
 *
 * @author Borja Romero
 */
public class ProductoCongelado extends Producto {
    //Atributos
    private int temperaturaCongelacionRecomendada;

    // Constructores
    public ProductoCongelado() {
        super();
        temperaturaCongelacionRecomendada = 0;
    }

    public ProductoCongelado(String fechaCaducidad, String numeroLote, int temperaturaCongelacionRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
    }

    // Get & Set
    public int getTemperaturaCongelacionRecomendada() {
        return temperaturaCongelacionRecomendada;
    }

    public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
        this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
    }

    // Mostrar
    @Override
    public String toString() {
        return super.toString() + "ProductoCongelado{" + "temperaturaCongelacionRecomendada=" + temperaturaCongelacionRecomendada + '}';
    }

    @Override
    public String mostrarProducto() {
        return """
               PRODUCTO CONGELADO
               Temperatura Congelacion Recomendada:\s"""
                + temperaturaCongelacionRecomendada + "\n" + super.mostrarProducto();
    }
}
