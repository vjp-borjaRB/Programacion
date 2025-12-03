package ejercicio4;

/**
 *
 * @author Borja Romero
 */
public abstract class Animal {

    //Atributos
    private String nombre;
    private int edad;
    private int peso;

    //Constructores
    public Animal() {
        nombre = "";
        edad = 0;
        peso = 0;
    }

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Mostrar
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }

    public void mostrarAnimal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        mostrarSonido();
        mostrarAlimentacion();
        mostrarHabitat();
        mostrarNombreCientifico();
        System.out.println("\n");
    }

    public abstract void mostrarSonido();

    public abstract void mostrarAlimentacion();

    public abstract void mostrarHabitat();

    public abstract void mostrarNombreCientifico();
}
