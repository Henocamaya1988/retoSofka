package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Juego;
import co.com.carracegame.sofka.model.Pista;
import co.com.carracegame.sofka.model.Podio;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.view.PodioView;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class PodioController implements IControllerFunction{
    private PodioView podioView;
    private Podio podio;
    private HashMap<Integer, Podio> podioHashMap;

    public PodioController(PodioView podioView, Podio podio) {
        this.podioView = podioView;
        this.podio = podio;
        podioHashMap = new HashMap<>();
    }

    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_PODIO+strKey+"'");

            while (resultado.next())
            {
               podioHashMap.put(resultado.getInt (1),
                        new Podio(
                                resultado.getInt (1),
                                resultado.getInt (2),
                                resultado.getString (3),
                                resultado.getString (4),
                                resultado.getInt (5),
                                resultado.getInt (6)
                        )
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String verificarElemento(String intKey) {
        return null;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<Integer, Podio> entryPodio : podioHashMap.entrySet()) {
           podioView.imprimirDatoPodio(
                    entryPodio.getValue().getIntIdPodio(),
                    entryPodio.getValue().getIntPuesto(),
                    entryPodio.getValue().getStrDescripcionPuesto(),
                    entryPodio.getValue().getStrDescripcionJuego(),
                    entryPodio.getValue().getIntIdJugador(),
                    entryPodio.getValue().getIntDistancia()
            );
        }

    }

    @Override
    public void guardarDatos(Object object) throws SQLException, ClassNotFoundException {
        podio = (Podio) object;

        ConexionMySQL conexionBD = new ConexionMySQL();
        Connection con = conexionBD.obtener();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = con.prepareStatement(Constante.STR_SQL_INSERT_PODIO);

            preparedStatement.setInt(1, podio.getIntPuesto());
            preparedStatement.setString(2, podio.getStrDescripcionPuesto());
            preparedStatement.setString(3, podio.getStrDescripcionJuego());
            preparedStatement.setInt(4, podio.getIntIdJugador());
            preparedStatement.setInt(5, podio.getIntDistancia());

            preparedStatement.executeUpdate();

            System.out.println("Se guardo con exito en la tabla Podio!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void actualizarDatos() {

    }

    @Override
    public void eliminarDatos(String strId) {

    }
}
