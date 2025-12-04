package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public abstract class Triangulo extends FiguraGeometrica {

    //Atributos
    private double base;
    private double altura;

    // Constructores
    public Triangulo() {
        super();
        base = 0;
        altura = 0;
    }

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Get & Set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    // Otros métodos
    @Override
    public void calcularArea() {
        System.out.println("El area del triangulo rectangulo " + getColor() + " es: " + getBase() * getAltura() / 2);
    }

    @Override
    public abstract void calcularPerimetro();
}
