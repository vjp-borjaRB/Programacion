package ejercicio15;

/**
 *
 * @author Borja Romero
 */
public class Direccion {

    // Atributos
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;

    // Constructores
    public Direccion() {
        calle = "";
        numero = 0;
        piso = "";
        ciudad = "";
    }

    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    // Get & Set
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Mostrar
    public void mostarDireccion() {
        System.out.println("Direccion: ");
        System.out.println("\tCalle: " + calle);
        System.out.println("\tNumero: " + numero);
        System.out.println("\tPuerta: " + piso);
        System.out.println("\tCiudad: " + ciudad);
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
}
