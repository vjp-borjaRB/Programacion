package lavuelta;

/**
 *
 * @author Borja Romero
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable {

    //Atributos
    private double potencia;
    private double fuerza;

    //Constructores
    public CiclistaEscalador() {
        super();
        potencia = 0;
        fuerza = 0;
    }

    public CiclistaEscalador(double potencia, double fuerza, String nombre, boolean estaEscapado, double kmMeta, double velocidad) {
        super(nombre, estaEscapado, kmMeta, velocidad);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }

    // Get & Set
    public double getPotencia() {
        return potencia;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    //Mostrar - toString
    @Override
    public String toString() {
        return super.toString() + "CiclistaEscalador{" + "potencia=" + potencia + ", fuerza=" + fuerza + '}';
    }

    // Otros métodos
    @Override
    public void comer() {
        if (getKmMeta() > 20) {
            setEnergia(+30);
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel, su energia ahora es de " + getEnergia());
        }
    }

    @Override
    public void beber() {
        if (getNumeroBidones() == 0) {
            cogerBidones();
        }
        setNivelHidratacion(+10);
        tirarBidon();
        tirarBidon();
        System.out.println("El escalador " + getNombre() + " se ha deshidratado, su nivel de hidratacion ahora es de " + getNivelHidratacion());
    }

    @Override
    public void sprintar() {
        if (getKmMeta() < 0.3 && getEnergia() >= 20) {
            setVelocidad(potencia / fuerza);
            setEnergia(-20);
            System.out.println("El escalador " + getNombre() + " esta esprintando a " + getVelocidad() + " km/h");
        } else {
            System.out.println("Aun no puedes esprintar");
        }
    }

    @Override
    public void atacar() {
        if (!isEstaEscapado()) {
            setEstaEscapado(true);
            setNivelHidratacion(-20);
            System.out.println("El escalador " + getNombre() + " esta atacando");
        }
    }

    @Override
    public float recuperar(double kmRecuperacion) {
        if (getKmMeta() > 15) {
            setEnergia(+5 * (int) kmRecuperacion);
            System.out.println(getNombre() + " esta recuperando");
        }
        return getEnergia();
    }

}
