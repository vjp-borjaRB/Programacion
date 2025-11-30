package ejercicio20;

/**
 *
 * @author Borja Romero
 */
public class Cuenta {

    private float saldo;

    //Constructores
    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    // Get & Set

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }

    // Otros métodos
    public void ingresar(float cantidad) {
        setSaldo(saldo + cantidad);
    }

    public void extraer(float cantidad) {
        setSaldo(saldo - cantidad);
    }
}
