package co.com.carracegame.sofka.view;

public class JugadorView {
    public void imprimirDatosJugador(int intIdJugador,int intIdCarro,int intIdConductor,int intIdCarril,String strNombre){
        System.out.println(String.format("Id Jugador: %s |" +
                        "Id Carro:%s |" +
                        "Id Coductor: %s |" +
                        "Id Carril: %s |" +
                        "Nombre: %s |",
                intIdJugador,
                intIdCarro,
                intIdConductor,
                intIdCarril,
                strNombre));
    }
}
