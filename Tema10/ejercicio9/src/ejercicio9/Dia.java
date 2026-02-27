package ejercicio9;

/**
 *
 * @author Borja Romero
 */
public class Dia {

    private String nombreDia;
    private int temperatura;

    public Dia() {
        nombreDia = "";
        temperatura = 0;
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }

}
