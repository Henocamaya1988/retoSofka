package co.com.carracegame.sofka.model;

public class Jugador {
    private int intIdJugador;
    private int intIdCarro;
    private int intIdConductor;
    private int intIdCarril;
    private String strNombre;

    public Jugador(){
        this.intIdJugador = 0;
        this.intIdCarro = 0;
        this.intIdConductor = 0;
        this.intIdCarril = 0;
        this.strNombre = "";

    }
    public Jugador(int intIdJugador, int intIdCarro, int intIdConductor, int intIdCarril, String strNombre) {
        this.intIdJugador = intIdJugador;
        this.intIdCarro = intIdCarro;
        this.intIdConductor = intIdConductor;
        this.intIdCarril = intIdCarril;
        this.strNombre = strNombre;
    }

    public int getIntIdJugador() {
        return intIdJugador;
    }

    public void setIntIdJugador(int intIdJugador) {
        this.intIdJugador = intIdJugador;
    }

    public int getIntIdCarro() {
        return intIdCarro;
    }

    public void setIntIdCarro(int intIdCarro) {
        this.intIdCarro = intIdCarro;
    }

    public int getIntIdConductor() {
        return intIdConductor;
    }

    public void setIntIdConductor(int intIdConductor) {
        this.intIdConductor = intIdConductor;
    }

    public int getIntIdCarril() {
        return intIdCarril;
    }

    public void setIntIdCarril(int intIdCarril) {
        this.intIdCarril = intIdCarril;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }
}
