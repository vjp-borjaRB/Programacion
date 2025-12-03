package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class TrianguloRectangulo extends Triangulo {

    //Constructores
    public TrianguloRectangulo() {
        super();
    }

    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }

    // Mostrar
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + '}';
    }

    // Otros métodos
    @Override
    public void calcularArea() {
        System.out.println("El area del triangulo rectangulo " + getColor() + " es: " + getBase() * getAltura() / 2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El area del triangulo rectangulo " + getColor() + " es: " + getBase() * getAltura() / 2);
    }

    public double calcularHipotenusa() {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
        return hipotenusa;
    }
}
