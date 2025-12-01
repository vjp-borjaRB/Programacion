package ejercicio22;

/**
 *
 * @author Borja Romero
 */
public class Producto {

    private String nombre;
    private float precio;
    private int stock;

    //Constructores
    public Producto() {
        nombre = "";
        precio = 0;
        stock = 0;
    }

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Mostrar 
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public String mostrarProducto() {
        return "para comprar " + nombre + " cuyo precio es de " + precio + " y el stock es de " + stock + " unidades";
    }
    // Otros metodos

    public void realizarCompra(int cantidad) {
        this.stock = stock - cantidad;
    }

    public int menuCompra() {
        System.out.println("Has elegido comprar " + nombre + "\n");
        realizarCompra(Ejercicio22.pedirCantidad());
        String volverComprar = Ejercicio22.volverComprar();
        if (volverComprar.equalsIgnoreCase("no")) {
            return 4;
        } else {
            return 0;
        }
    }

}
