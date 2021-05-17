package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Carro;
import co.com.carracegame.sofka.model.Pista;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.view.CarroView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CarroController implements IControllerFunction{
    private CarroView carroView;
    private Carro carro;
    private HashMap<Integer,Carro> carroHashMap;
    private int intContador;

    public CarroController(CarroView carroView, Carro carro) {
        this.carroView = carroView;
        this.carro = carro;
        carroHashMap = new HashMap<>();
    }


    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_CARRO);
            intContador = 1;

            while (resultado.next())
            {
                if (intContador<=Integer.parseInt(strKey)){
                    carroHashMap.put(resultado.getInt (1),
                            new Carro(
                                    resultado.getInt (1),
                                    resultado.getString (2),
                                    resultado.getString (3),
                                    resultado.getString (4)
                            )
                    );
                }
                intContador++;
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String verificarElemento(String strKey) {
        String strResult = "";
        try{
            strResult = String.valueOf(carroHashMap.get(Integer.parseInt(strKey)).getIntIdCarro());
        }catch (Exception e){
            System.out.println(String.format("El Id: %s ingresado no se encuentra en la lista ",strKey));
        }
        return strResult;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<Integer, Carro> entryCarro : carroHashMap.entrySet()) {
            carroView.imprimirDatoCarro(
                    entryCarro.getValue().getIntIdCarro(),
                    entryCarro.getValue().getStrPlaca(),
                    entryCarro.getValue().getStrMarca(),
                    entryCarro.getValue().getStrModelo()
            );
        }
    }

    @Override
    public void guardarDatos(Object object) {

    }

    @Override
    public void actualizarDatos() {

    }

    @Override
    public void eliminarDatos(String strId) {
        carroHashMap.remove(Integer.parseInt(strId));
    }
}
