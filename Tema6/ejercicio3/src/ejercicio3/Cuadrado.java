package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Cuadrado extends FiguraGeometrica {

    //Atributos
    private double lado;

    // Constructores
    public Cuadrado() {
        super();
        lado = 0;
    }

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Get & Set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    // Otros métodos
    @Override
    public void calcularArea() {
        System.out.println("El area del cuadrado " + getColor() + " es: " + Math.pow(lado, 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del cuadrado " + getColor() + " es: " + 4 * lado);
    }
}
