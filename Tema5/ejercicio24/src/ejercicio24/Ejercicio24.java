package ejercicio24;

/**
 *
 * @author Borja Romero
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Producto productoFresco = new ProductoFresco("27/11/2025", "4216A", "24/11/2025", "Spain");
        Producto productoRefrigerado = new ProductoRefrigerado("2/12/2025", "7865F", "5752FZ");
        Producto productoCongelado = new ProductoCongelado("18/9/2026", "3416F", -20);
        System.out.println(productoFresco.mostrarProducto());
        System.out.println(productoRefrigerado.mostrarProducto());
        System.out.println(productoCongelado.mostrarProducto());
    }
}
