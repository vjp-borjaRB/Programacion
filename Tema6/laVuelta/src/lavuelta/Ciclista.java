package lavuelta;

/**
 *
 * @author Borja Romero
 */
public abstract class Ciclista {

    // Atributos
    private String nombre;
    private int energia;
    private boolean estaEscapado;
    private double kmMeta;
    private int numeroBidones;
    private double velocidad;
    private int nivelHidratacion;
    private int numeroCiclistas;

    // Constructores
    public Ciclista() {
        nombre = "";
        energia = 50;
        estaEscapado = false;
        kmMeta = 120;
        numeroBidones = 2;
        velocidad = 0;
        nivelHidratacion = 50;
    }

    public Ciclista(String nombre, boolean estaEscapado, double kmMeta, double velocidad) {
        this.nombre = nombre;
        energia = 50;
        this.estaEscapado = estaEscapado;
        this.kmMeta = kmMeta;
        numeroBidones = 2;
        this.velocidad = velocidad;
        nivelHidratacion = 50;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isEstaEscapado() {
        return estaEscapado;
    }

    public double getKmMeta() {
        return kmMeta;
    }

    public int getNumeroBidones() {
        return numeroBidones;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getNivelHidratacion() {
        return nivelHidratacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEstaEscapado(boolean estaEscapado) {
        this.estaEscapado = estaEscapado;
    }

    public void setKmMeta(double kmMeta) {
        this.kmMeta = kmMeta;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    //Mostrar - toString
    @Override
    public String toString() {
        return "Ciclista{" + "nombre=" + nombre + ", energia=" + energia + ", estaEscapado=" + estaEscapado + ", kmMeta=" + kmMeta + ", numeroBidones=" + numeroBidones + ", velocidad=" + velocidad + ", nivelHidratacion=" + nivelHidratacion + '}';
    }

    //Otros métodos
    public void cogerBidones() {
        if (kmMeta > 10) {
            numeroBidones += 2;
        } else {
            System.out.println("No puedes coger bidones a menos de 10km de la meta");
        }
    }

    public void tirarBidon() {
        numeroBidones -= 1;
    }

    public abstract void comer();

    public abstract void beber();

    public void aumentarCiclistas() {
        numeroCiclistas++;
    }

    public void verNumeroCiclistas() {
        System.out.println("El numero de ciclistas es: " + numeroCiclistas);
    }

}
