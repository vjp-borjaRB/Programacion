package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public class Test {
    public static void main(String[] args) {
        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();
        p1.establecerColoryEdad("rojo", 1);
        p2.establecerColoryEdad("azul", 2);
        System.out.println(Pajarito.muestraPajaros());
    }
    
}
