package co.com.carracegame.sofka.view;

public class ConductorView {
    public void imprimirDatoConductor(int intIdCoductor,String strNombre){
        System.out.println(String.format("Id: %s |" +
                        "Nombre: %s |",
                intIdCoductor,
                strNombre));
    }

}
