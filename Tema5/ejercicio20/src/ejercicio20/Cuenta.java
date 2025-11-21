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
        setSaldo(saldo+cantidad);
    }
    
    public void extraer(float cantidad) {
        setSaldo(saldo-cantidad);
    }
    
    

    // public void extraer(float cantidad
    // 21 clase cuentaclave(subclase de cuenta)
    // public class CuentaClave extends Cuenta
    // private String clave
    // Los constructores no se heredan (crear constructores)
    // public CuentaClave()  {super(); clave="";}
    // public CuentaClave(float saldo, String clave) {super(saldo);this.clave=clave; }
    // Get & Set de clave 
    // Override public void extraer(float c) {(tiene que haber saldo suficiente (if) para extraer getSaldo())}
}   // super.extraer(c); o this.setSaldo(getSaldo() - c);
// Main  c ;do{switch} while()
// 1- c = new Cuenta(); 2 - saldo = pedirSaldo(); 3- new Cuenta(Saldo)
// Controlar si existe la cuenta (boolean, null o try catch)
