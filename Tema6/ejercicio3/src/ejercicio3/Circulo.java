package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public class Circulo extends FiguraGeometrica {

    //Atributos
    private double radio;

    // Constructores
    public Circulo() {
        super();
        radio = 0;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Get & Set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    // Otros métodos
    @Override
    public void calcularArea() {
        System.out.println("El area del circulo " + getColor() + " es: " + Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo " + getColor() + " es: " + 2 * Math.PI * radio);
    } 

}
