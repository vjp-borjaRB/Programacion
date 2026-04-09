package ejercicio3;

import java.util.HashMap;

/**
 *
 * @author Borja Romero
 */
public class Autobus {

    private String matricula;
    private HashMap<String, Object> listaConductores;

    public Autobus() {
        matricula = "";
        listaConductores = new HashMap<>();
    }

    public Autobus(String matricula, HashMap<String, Object> listaConductores) {
        this.matricula = matricula;
        this.listaConductores = listaConductores;
    }

    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, Object> getListaConductores() {
        return listaConductores;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setListaConductores(HashMap<String, Object> listaConductores) {
        this.listaConductores = listaConductores;
    }

}
