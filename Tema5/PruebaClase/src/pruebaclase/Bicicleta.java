package pruebaclase;

/**
 *
 * @author Borja Romero
 */
public class Bicicleta {
    // Atributos 

    private String marca;
    private String color;
    private String tipo;
    private int antiguedad;
    private Propietario propietario;

    // Atributo estatico
    private static int contadorBicicleta = 0;

    // Constructores
    public Bicicleta() {
        marca = "";
        color = "";
        tipo = "";
        antiguedad = 0;
        propietario = new Propietario();
        aumentarContadorBicicleta();
    }

    public Bicicleta(String m, String c, String t, int a, String nompropietario, int edadpropietario) {
        marca = m;
        color = c;
        tipo = t;
        antiguedad = a;
        propietario = new Propietario(nompropietario, edadpropietario);
        aumentarContadorBicicleta();
    }

    public Bicicleta(String m) {
        marca = m;
        color = "";
        tipo = "";
        antiguedad = 0;
        aumentarContadorBicicleta();
    }

    // Getters/Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int a) {
        antiguedad = a;
    }

    public static int getContadorBicicleta() {
        return contadorBicicleta;
    }

    public static void setContadorBicicleta(int contadorBicicleta) {
        Bicicleta.contadorBicicleta = contadorBicicleta;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    

    // Otros metodos
    public void mostrarAntiguedad() {
        if (antiguedad > 10) {
            System.out.println("La bici es antigua");
        } else {
            System.out.println("La bici es nueva");
        }
    }

    public static void aumentarContadorBicicleta() {
        contadorBicicleta++;
    }
    // Mostrar

    public void mostrarBicicleta() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println(propietario.toString());
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", antiguedad=" + antiguedad + '}';
    }

}
