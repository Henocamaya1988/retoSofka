package co.com.carracegame.sofka.view;

public class PodioView {
    public void imprimirDatoPodio(int intIdPodio, int intPuesto, String strDescripcionPuesto, String strDescripcionJ, int intIdJugador, int intDistancia) {
            System.out.println(String.format("Id Podio: %s |" +
                            "Puesto: %s |" +
                            "Descripcion: %s |" +
                            "Id Juego: %s|" +
                            "Id Jugador: %s |" +
                            "Distancia Recorrida: %s |",
                    intIdPodio,
                    intPuesto,
                    strDescripcionPuesto,
                    strDescripcionJ,
                    intIdJugador,
                    intDistancia)
            );
        }
    }
