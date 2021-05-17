package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Juego;
import co.com.carracegame.sofka.model.Pista;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.view.JuegoView;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class JuegoController implements IControllerFunction{
    private JuegoView juegoView;
    private Juego juego;
    private HashMap<Integer,Juego> juegoHashMap;

    public JuegoController(JuegoView juegoView, Juego juego) {
        this.juegoView = juegoView;
        this.juego = juego;
        juegoHashMap = new HashMap<>();
    }

    public int consultarGanadorJuego(String strDescripcion, int intIdJugador){
        int intDistanciaRecorrida = 0;

        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_GANADOR_JUEGO+strDescripcion+"'  and idjugador='"+intIdJugador+"'");

            while (resultado.next())
            {
                intDistanciaRecorrida = resultado.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return intDistanciaRecorrida;
    }

    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_JUEGO+strKey+"'");
            Constante.juegoHashMapIncio = new HashMap<>();

            while (resultado.next())
            {
                    juegoHashMap.put(resultado.getInt (2),
                            new Juego(
                                    resultado.getInt (1),
                                    resultado.getInt (2),
                                    resultado.getString (3),
                                    resultado.getInt (4)
                            )
                    );
            }
            Constante.juegoHashMapIncio=juegoHashMap;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String verificarElemento(String strKey) {
        return null;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<Integer, Juego> entryJuego : juegoHashMap.entrySet()) {
            juegoView.imprimirDatosJuego(
                    entryJuego.getValue().getIntIdJuego(),
                    entryJuego.getValue().getIntIdJugador(),
                    entryJuego.getValue().getStrDescripcion(),
                    entryJuego.getValue().getIntDistancia()
            );
        }

    }

    @Override
    public void guardarDatos(Object object) throws SQLException, ClassNotFoundException {
        juego = (Juego) object;

        ConexionMySQL conexionBD = new ConexionMySQL();
        Connection con = conexionBD.obtener();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = con.prepareStatement(Constante.STR_SQL_INSERT_JUEGO);

            preparedStatement.setInt(1, juego.getIntIdJugador());
            preparedStatement.setString(2, juego.getStrDescripcion());
            preparedStatement.setInt(3, juego.getIntDistancia());

            preparedStatement.executeUpdate();

            System.out.println("Se guardo con exito en la tabla Juego!");

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
