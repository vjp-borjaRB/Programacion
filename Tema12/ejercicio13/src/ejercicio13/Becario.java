package ejercicio13;

/**
 *
 * @author Borja Romero
 */
public class Becario {

    private String nombreApellido;
    private String sexo;
    private int edad;
    private int numeroSuspensos;
    private String residenciaFamiliar;
    private int ingresos;

    public Becario(String nombreApellido, String sexo, int edad, int numeroSuspensos, String residenciaFamiliar, int ingresos) {
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.numeroSuspensos = numeroSuspensos;
        this.residenciaFamiliar = residenciaFamiliar;
        this.ingresos = ingresos;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroSuspensos() {
        return numeroSuspensos;
    }

    public String getResidenciaFamiliar() {
        return residenciaFamiliar;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroSuspensos(int numeroSuspensos) {
        this.numeroSuspensos = numeroSuspensos;
    }

    public void setResidenciaFamiliar(String residenciaFamiliar) {
        this.residenciaFamiliar = residenciaFamiliar;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Becario{" + "nombreApellido=" + nombreApellido + ", sexo=" + sexo + ", edad=" + edad + ", numeroSuspensos=" + numeroSuspensos + ", residenciaFamiliar=" + residenciaFamiliar + ", ingresos=" + ingresos + '}';
    }

}
