package ejercicio6;

/**
 *
 * @author Borja Romero
 */
public class Persona implements Transformable {

    //Atributos
    private String nombre;
    private String apellidos;
    private String alias;

    //Constructores
    public Persona() {
        nombre = "";
        apellidos = "";
        alias = "";
    }

    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }

    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }

    @Override
    public String concatenarTodo() {
        return "" + nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
    }

    @Override
    public String obtenerCadenaMasLarga() {
        if (nombre.length() > apellidos.length() && nombre.length() > alias.length()) {
            return nombre;
        } else if (apellidos.length() > nombre.length() && apellidos.length() > alias.length()) {
            return apellidos;
        } else {
            return alias;
        }
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return cadena.equalsIgnoreCase(nombre) || cadena.equalsIgnoreCase(apellidos) || cadena.equalsIgnoreCase(alias);
    }

}
