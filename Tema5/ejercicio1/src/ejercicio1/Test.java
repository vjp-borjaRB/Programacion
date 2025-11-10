package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Test {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.establecerModelo("focus2");
        miCoche.establecerMarca("ford");
        miCoche.establecerColor("azul");

        Coche cochePadre = new Coche();
        cochePadre.establecerModelo("e92");
        cochePadre.establecerMarca("bmw");
        cochePadre.establecerColor("blanco");

        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        
    }
}
