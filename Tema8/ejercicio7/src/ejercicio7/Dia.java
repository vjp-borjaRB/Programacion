package ejercicio7;

/**
 *
 * @author Borja Romero
 */
public class Dia {

    //Atributos 
    private String nombreDia;
    private int temperatura;

    //Constructores
    public Dia() {
        nombreDia = "";
        temperatura = 0;
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    // Get & Set

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
    
    //Mostrar / toString

    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
    // Otros métodos
    

}
