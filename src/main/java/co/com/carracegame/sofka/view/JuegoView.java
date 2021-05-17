package co.com.carracegame.sofka.view;

public class JuegoView {
    public void imprimirDatosJuego(int intIdJuego,int intIdJugador,String strDescripcion,int intDistancia){
        System.out.println(String.format("********Datos de Juego*******\n" +
                        "Id Juego: %s |" +
                        "Id Jugador: %s |" +
                        "Descripcion: %s |" +
                        "Distancia recorrida: %s |",
                intIdJuego,
                intIdJugador,
                strDescripcion,
                intDistancia));
    }
}
