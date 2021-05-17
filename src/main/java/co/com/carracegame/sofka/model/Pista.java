package co.com.carracegame.sofka.model;

public class Pista {
    private int intIdPista;
    private int intIdCarril;
    private int intLimiteDistancia;
    private String strDescripcion;

    public Pista(){
        this.intIdPista = 0;
        this.intIdCarril = 0;
        this.intLimiteDistancia = 0;
        this.strDescripcion = "";
    }

    public Pista(int intIdPista, int intIdCarril, int intLimiteDistancia, String strDescripcion) {
        this.intIdPista = intIdPista;
        this.intIdCarril = intIdCarril;
        this.intLimiteDistancia = intLimiteDistancia;
        this.strDescripcion = strDescripcion;
    }

    public int getIntIdPista() {
        return intIdPista;
    }

    public void setIntIdPista(int intIdPista) {
        this.intIdPista = intIdPista;
    }

    public int getIntIdCarril() {
        return intIdCarril;
    }

    public void setIntIdCarril(int intIdCarril) {
        this.intIdCarril = intIdCarril;
    }

    public int getIntLimiteDistancia() {
        return intLimiteDistancia;
    }

    public void setIntLimiteDistancia(int intLimiteDistancia) {
        this.intLimiteDistancia = intLimiteDistancia;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }
}
