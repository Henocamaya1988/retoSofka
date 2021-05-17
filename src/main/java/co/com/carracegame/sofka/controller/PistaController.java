package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Pista;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.util.MetodosComunes;
import co.com.carracegame.sofka.view.PistaView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class PistaController implements IControllerFunction{
    private PistaView pistaView;
    private Pista pista;
    private HashMap<Integer,Pista> pistaStringHashMap;
    private int intContador;

    public PistaController(PistaView pistaView, Pista pista) {
        this.pistaView = pistaView;
        this.pista = pista;
        pistaStringHashMap = new HashMap<>();
    }

    public int limitePista(int intIdCarril){
        int intLimite = 0;

        intLimite = MetodosComunes.convertirKmMts(pistaStringHashMap.get(intIdCarril).getIntLimiteDistancia());
        System.out.println("Limite meta: "+intLimite);

        return intLimite;
    }

    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_PISTA);
            intContador = 1;
            while (resultado.next())
            {
                if (intContador<=Integer.parseInt(strKey)){
                    pistaStringHashMap.put(resultado.getInt (2),
                            new Pista(
                                    resultado.getInt (1),
                                    resultado.getInt (2),
                                    resultado.getInt (3),
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
            strResult = String.valueOf(pistaStringHashMap.get(Integer.parseInt(strKey)).getIntIdPista());
        }catch (Exception e){
            System.out.println(String.format("El Id: %s ingresado no se encuentra en la lista ",strKey));
        }
        return strResult;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<Integer, Pista> entryPista : pistaStringHashMap.entrySet()) {
            pistaView.imprimirDatoPista(
                    entryPista.getValue().getIntIdPista(),
                    entryPista.getValue().getIntIdCarril(),
                    entryPista.getValue().getIntLimiteDistancia(),
                    entryPista.getValue().getStrDescripcion()
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
        pistaStringHashMap.remove(Integer.parseInt(strId));
    }
}
