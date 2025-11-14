package ejercicio12;

/**
 *
 * @author Borja Romero
 */
public class Triangulo {

    //Atributos
    private double cateto1;
    private double cateto2;

    // Constructores 
    public Triangulo() {
        cateto1 = 0;
        cateto2 = 0;
    }

    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    // Get & Set
    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }
    
    // Mostrar

    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }
    
    

}
