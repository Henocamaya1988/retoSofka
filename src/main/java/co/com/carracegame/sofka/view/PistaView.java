package co.com.carracegame.sofka.view;

public class PistaView {
    public void imprimirDatoPista(int intIdPista,int intIdCarril, int intDistancia,String strDescripcion){
        System.out.println(String.format("Id Pista: %s |" +
                        "Id Carril: %s |" +
                        "Distancia: %s KM |" +
                        "Descripcion: %s|",
                intIdPista,
                intIdCarril,
                intDistancia,
                strDescripcion));
    }
}
