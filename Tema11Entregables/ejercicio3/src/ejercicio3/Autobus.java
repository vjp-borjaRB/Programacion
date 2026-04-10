package ejercicio3;

import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class Autobus {

    private String matricula;
    private HashMap<String, String> listaConductores;

    public Autobus() {
        matricula = "";
        listaConductores = new HashMap<>();
    }

    public Autobus(String matricula, HashMap<String, String> listaConductores) {
        this.matricula = matricula;
        this.listaConductores = listaConductores;
    }

    public Autobus(String matricula) {
        this.matricula = matricula;
        listaConductores = new HashMap<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, String> getListaConductores() {
        return listaConductores;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setListaConductores(HashMap<String, String> listaConductores) {
        this.listaConductores = listaConductores;
    }

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", listaConductores=" + listaConductores + '}';
    }

}
