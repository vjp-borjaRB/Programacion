package ejercicio11;

/**
 *
 * @author Borja Romero
 */
public class Numero {

    //Atributos
    private int valor;

    // Constructores
    public Numero() {
        valor = 0;
    }

    public Numero(int valor) {
        this.valor = valor;
    }

    // Get % Set
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    // Mostrar

    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
    // Otros métodos
    
    
    
    

}
