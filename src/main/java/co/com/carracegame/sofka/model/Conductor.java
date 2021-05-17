package co.com.carracegame.sofka.model;

public class Conductor {
    private int intIdCoductor;
    private String strNombre;

    public Conductor(){
        this.intIdCoductor = 0;
        this.strNombre = "";
    }
    public Conductor(int intIdCoductor, String strNombre) {
        this.intIdCoductor = intIdCoductor;
        this.strNombre = strNombre;
    }

    public int getIntIdCoductor() {
        return intIdCoductor;
    }

    public void setIntIdCoductor(int intIdCoductor) {
        this.intIdCoductor = intIdCoductor;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }
}
