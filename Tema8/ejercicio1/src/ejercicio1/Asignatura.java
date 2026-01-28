package ejercicio1;

public class Asignatura {

//Atributos
    private String nombre;
    private double nota;

//Constructores
    public Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

// Get & Set
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

// Mostrar / ToString
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
// Otros métodos
    

}
