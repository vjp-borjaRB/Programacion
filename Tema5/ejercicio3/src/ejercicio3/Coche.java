package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Coche {

    private String marca;
    private String modelo;
    private Rueda ruedas;

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void establecerRueda(Rueda rue) {
        ruedas = rue;
    }

    public Rueda obtenerRueda() {
        return ruedas;
    }
}
