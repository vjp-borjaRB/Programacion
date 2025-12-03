package ejercicio3;

/**
 *
 * @author Borja Romero
 */
public abstract class FiguraGeometrica {

    //Atributos
    private String color;

    //Constructores
    public FiguraGeometrica() {
        color = "";
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Get & Set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Mostrar
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }

    //Otros métodos
    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}
