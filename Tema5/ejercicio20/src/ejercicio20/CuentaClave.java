package ejercicio20;

/**
 *
 * @author Borja Romero
 */
public class CuentaClave extends Cuenta {
    
    private String clave;

    //Constructores
    public CuentaClave() {
        super();
        clave = "";
    }
    
    public CuentaClave(float saldo, String clave) {
        super(saldo);
        this.clave = clave;
    }
    // Get & Set

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public void extraer(float saldo) {
        if (saldo < this.getSaldo()) {
            super.extraer(saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaClave{" + "clave=" + clave + '}';
    }
    
}
