package co.com.carracegame.sofka.model;

public class Podio {
    private int intIdPodio;
    private int intPuesto;
    private String strDescripcionPuesto;
    private String strDescripcionJuego;
    private int intIdJugador;
    private int intDistancia;

    public Podio(){
        this.intIdPodio = 0;
        this.intPuesto = 0;
        this.strDescripcionPuesto = "";
        this.strDescripcionJuego = "";
        this.intIdJugador = 0;
        this.intDistancia = 0;
    }
    public Podio(int intIdPodio, int intPuesto, String strDescripcionPuesto, String strDescripcionJuego, int intIdJugador, int intDistancia) {
        this.intIdPodio = intIdPodio;
        this.intPuesto = intPuesto;
        this.strDescripcionPuesto = strDescripcionPuesto;
        this.strDescripcionJuego = strDescripcionJuego;
        this.intIdJugador = intIdJugador;
        this.intDistancia = intDistancia;
    }

    public int getIntIdPodio() {
        return intIdPodio;
    }

    public void setIntIdPodio(int intIdPodio) {
        this.intIdPodio = intIdPodio;
    }

    public int getIntPuesto() {
        return intPuesto;
    }

    public void setIntPuesto(int intPuesto) {
        this.intPuesto = intPuesto;
    }

    public String getStrDescripcionPuesto() {
        return strDescripcionPuesto;
    }

    public void setStrDescripcionPuesto(String strDescripcionPuesto) {
        this.strDescripcionPuesto = strDescripcionPuesto;
    }

    public String getStrDescripcionJuego() {
        return strDescripcionJuego;
    }

    public void setStrDescripcionJuego(String strDescripcionJuego) {
        this.strDescripcionJuego = strDescripcionJuego;
    }

    public int getIntIdJugador() {
        return intIdJugador;
    }

    public void setIntIdJugador(int intIdJugador) {
        this.intIdJugador = intIdJugador;
    }

    public int getIntDistancia() {
        return intDistancia;
    }

    public void setIntDistancia(int intDistancia) {
        this.intDistancia = intDistancia;
    }
}








