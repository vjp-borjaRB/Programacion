package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Rueda {

    private String material;
    private int pulgadas;
    
    public Rueda() {
        material = "";
        pulgadas = 0;
    }

    public Rueda(String mat, int pul) {
        material = mat;
        pulgadas= pul;
    }

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
