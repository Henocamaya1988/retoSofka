package co.com.carracegame.sofka.view;

public class CarroView {
    public void imprimirDatoCarro(int intIdCarro,String strPlaca,String strMarca,String strModelo){
        System.out.println(String.format("IdCarro: %s | Placa: %s | Marca: %s | Modelo: %s |", intIdCarro,strPlaca,strMarca,strModelo));
    }
}
