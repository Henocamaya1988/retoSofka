package co.com.carracegame.sofka.model;

public class Carro {

    private int intIdCarro;
    private String strPlaca;
    private String strMarca;
    private String strModelo;

    public Carro(){
        this.intIdCarro = 0;
        this.strPlaca = "";
        this.strMarca = "";
        this.strModelo = "";

    }
    public Carro(int intIdCarro, String strPlaca, String strMarca, String strModelo) {
        this.intIdCarro = intIdCarro;
        this.strPlaca = strPlaca;
        this.strMarca = strMarca;
        this.strModelo = strModelo;
    }

    public int getIntIdCarro() {
        return intIdCarro;
    }

    public void setIntIdCarro(int intIdCarro) {
        this.intIdCarro = intIdCarro;
    }

    public String getStrPlaca() {
        return strPlaca;
    }

    public void setStrPlaca(String strPlaca) {
        this.strPlaca = strPlaca;
    }

    public String getStrMarca() {
        return strMarca;
    }

    public void setStrMarca(String strMarca) {
        this.strMarca = strMarca;
    }

    public String getStrModelo() {
        return strModelo;
    }

    public void setStrModelo(String strModelo) {
        this.strModelo = strModelo;
    }

}
