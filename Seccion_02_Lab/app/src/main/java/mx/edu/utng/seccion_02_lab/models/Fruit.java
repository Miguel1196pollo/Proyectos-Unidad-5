package mx.edu.utng.seccion_02_lab.models;

/**
 * Created by Toshiba on 09/04/2017.
 */
public class Fruit {
    private String name;
    private int icon;
    private String origen;

    public Fruit(){

    }

    public Fruit(String name, int icon, String origen) {
        this.name = name;
        this.icon = icon;
        this.origen = origen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
