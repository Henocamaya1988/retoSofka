package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Carro;
import co.com.carracegame.sofka.model.Conductor;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.view.ConductorView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ConductorController implements IControllerFunction{

    private ConductorView conductorView;
    private Conductor conductorModel;
    private HashMap<Integer,Conductor> conductorHashMap;
    private int intContador;

    public ConductorController(ConductorView conductorView, Conductor conductorModel) {
        this.conductorView = conductorView;
        this.conductorModel = conductorModel;
        conductorHashMap = new HashMap<>();
    }

    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_CODUCTOR);
            intContador = 1;
            while (resultado.next())
            {
                if (intContador<=Integer.parseInt(strKey)){
                    conductorHashMap.put(resultado.getInt (1),
                            new Conductor(
                                    resultado.getInt (1),
                                    resultado.getString (2)
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
            strResult = String.valueOf(conductorHashMap.get(Integer.parseInt(strKey)));
        }catch (Exception e){
            System.out.println(String.format("El Id: %s ingresado no se encuentra en la lista ",strKey));
        }
        return strResult;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<Integer, Conductor> entryConductor : conductorHashMap.entrySet()) {
            conductorView.imprimirDatoConductor(
                    entryConductor.getValue().getIntIdCoductor(),
                    entryConductor.getValue().getStrNombre()
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
        conductorHashMap.remove(Integer.parseInt(strId));
    }
}
