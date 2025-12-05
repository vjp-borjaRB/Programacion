package ejercicio7;

/**
 *
 * @author Borja Romero
 */
public class Televisor implements ControlRemoto {

    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;

    //Constructores
    public Televisor() {
        encendido = false;
        canal = 1;
        volumen = 10;
    }

    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }

    // Get & Set
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
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
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
    //Otros metodos

    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println(canal);
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagara en 10s");
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            setVolumen(volumen - 1);
            System.out.println("Volumen: " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            setVolumen(volumen + 1);
            System.out.println("Volumen: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            setCanal((int)canal);
            System.out.println("Canal " + canal);
        }
    }
}
