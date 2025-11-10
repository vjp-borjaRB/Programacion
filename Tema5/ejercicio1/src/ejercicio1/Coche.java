package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerModelo(String mo) {
        modelo = mo;
    }

    public void establecerColor(String c) {
        color = c;
    }

    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }

    public void acelerarCoche() {
        velocidad += 20;
    }

    public void frenerCoche() {
        velocidad -= 6;
    }

    public void obtenerEstado() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
        System.out.println(velocidad);
        System.out.println(motorEncendido);
    }

}
