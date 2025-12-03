package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public abstract class Calculadora {

    //Atributos
    private double numero;

    //Constructores
    public Calculadora() {
        numero = 0;
    }

    public Calculadora(double numero) {
        this.numero = numero;
    }

    //Get & Set
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }

    // Otros metodos
    public abstract void realizarOperacion();

}
