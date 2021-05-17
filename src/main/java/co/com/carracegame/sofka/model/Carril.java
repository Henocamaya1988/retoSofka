package co.com.carracegame.sofka.model;

public class Carril {
    private int intIdCarril;
    private String strDescripcion;

    public Carril(int intIdCarril, String strDescripcion) {
        this.intIdCarril = intIdCarril;
        this.strDescripcion = strDescripcion;
    }

    public int getIntIdCarril() {
        return intIdCarril;
    }

    public void setIntIdCarril(int intIdCarril) {
        this.intIdCarril = intIdCarril;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }
}
