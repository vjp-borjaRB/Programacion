package ejercicio1;

/**
 *
 * @author Borja Romero
 */
public class Potencia extends Calculadora {

    //Atributos
    private double exponente;

    //Constructores
    public Potencia() {
        super();
        exponente = 0;
    }
    
    public Potencia(double numero, double exponente) {
        super(numero);
        this.exponente = exponente;
    }
    
    @Override
    public void realizarOperacion() {
        System.out.println(Math.pow(getNumero(), exponente));
    }
}
