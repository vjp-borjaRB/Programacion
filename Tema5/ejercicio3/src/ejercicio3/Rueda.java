package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Rueda {

    private String material;
    private int pulgadas;

    public void establecerMaterial(String mat) {
        material = mat;
    }

    public void establecerPulgadas(int pul) {
        pulgadas = pul;
    }

    public String obtenerMaterial() {
        return material;
    }

    public int obtenerPulgadas() {
        return pulgadas;
    }
}
