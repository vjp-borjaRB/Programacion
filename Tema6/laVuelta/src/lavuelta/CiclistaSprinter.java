package lavuelta;

/**
 *
 * @author Borja Romero
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable {

    //Atributos 
    private double aceleracion;

    //Constructores
    public CiclistaSprinter() {
        super();
        aceleracion = 0;
    }

    public CiclistaSprinter(double aceleracion, String nombre, boolean estaEscapado, double kmMeta, double velocidad) {
        super(nombre, estaEscapado, kmMeta, velocidad);
        this.aceleracion = aceleracion;
    }

    // Get & Set
    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    //Mostrar - toString
    @Override
    public String toString() {
        return super.toString() + "CiclistaSprinter{" + "aceleracion=" + aceleracion + '}';
    }

    //Otros métodos
    @Override
    public void comer() {
        if (getKmMeta() > 10) {
            setEnergia(+25);
            System.out.println("El sprinter " + getNombre() + " acaba de tomar un gel. Su energia ahora es de " + getEnergia());
        }
    }

    @Override
    public void beber() {
        if (getNumeroBidones() == 0) {
            cogerBidones();
        }
        setNivelHidratacion(+5);
        tirarBidon();
        System.out.println("El sprinter " + getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de " + getNivelHidratacion());
    }

    @Override
    public void sprintar() {
        if (getKmMeta() < 1 && getEnergia() >= 50) {
            setVelocidad(+aceleracion);
            setEnergia(-50);
            System.out.println("El sprinter " + getNombre() + " esta esprintando a " + getVelocidad() + " km/h");
        } else {
            System.out.println("Aun no puedes esprintar");
        }
    }

    @Override
    public void atacar() {
        if (!isEstaEscapado()) {
            setEstaEscapado(true);
            setNivelHidratacion(-10);
            System.out.println("El sprinter " + getNombre() + " esta atacando");
        }
    }

    @Override
    public float recuperar(double kmRecuperacion) {
        if (getKmMeta() > 5) {
            setEnergia(+5 * (int) kmRecuperacion);
            System.out.println(getNombre() + " esta recuperando");
        }
        return getEnergia();
    }
}
