package co.com.carracegame.sofka.model;

public class Juego {

    private int intIdJuego;
    private int intIdJugador;
    private String strDescripcion;
    private int intDistancia;

    public Juego(){
        this.intIdJuego = 0;
        this.intIdJugador = 0;
        this.strDescripcion = "";
        this.intDistancia = 0;
    }

    public Juego(int intIdJuego, int intIdJugador, String strDescripcion, int intDistancia) {
        this.intIdJuego = intIdJuego;
        this.intIdJugador = intIdJugador;
        this.strDescripcion = strDescripcion;
        this.intDistancia = intDistancia;
    }

    public int getIntIdJuego() {
        return intIdJuego;
    }

    public void setIntIdJuego(int intIdJuego) {
        this.intIdJuego = intIdJuego;
    }

    public int getIntIdJugador() {
        return intIdJugador;
    }

    public void setIntIdJugador(int intIdJugador) {
        this.intIdJugador = intIdJugador;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    public int getIntDistancia() {
        return intDistancia;
    }

    public void setIntDistancia(int intDistancia) {
        this.intDistancia = intDistancia;
    }
}
