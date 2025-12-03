package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Rectangulo extends FiguraGeometrica {
    //Atributos
    private double base;
    private double altura;

    // Constructores
    public Rectangulo() {
        super();
        base = 0;
        altura = 0;
    }

    public Rectangulo(String color, double base, double altura) {
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
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }


    // Otros métodos
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo " + getColor() + " es: " + base*altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo " + getColor() + " es: " + 2 * (base+altura));
    }

}
