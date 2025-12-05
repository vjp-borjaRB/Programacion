package ejercicio7;

/**
 *
 * @author Borja Romero
 */
public class Radio implements ControlRemoto {

    //Atributos 
    private boolean encendido;
    private float emisora;
    private int volumen;

    //Constructores
    public Radio() {
        encendido = false;
        emisora = 80;
        volumen = 15;
    }

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }

    // Get & Set
    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }

    //Otros metodos
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            setVolumen(volumen - 5);
            System.out.println("Volumen: " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            setVolumen(volumen + 5);
            System.out.println("Volumen: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float emisora) {
        if (encendido) {
            setEmisora(emisora);
            System.out.println("Emisora " + emisora);
        }

    }
}
