package co.com.carracegame.sofka.controller;

import co.com.carracegame.sofka.model.Carro;
import co.com.carracegame.sofka.model.Jugador;
import co.com.carracegame.sofka.util.ConexionMySQL;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.view.JugadorView;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class JugadorController implements  IControllerFunction{
    private JugadorView jugadorView;
    private Jugador jugador;
    private HashMap<String,Jugador> jugadorHashMap;


    public JugadorController(JugadorView jugadorView, Jugador jugador) {
        this.jugadorView = jugadorView;
        this.jugador = jugador;
        jugadorHashMap = new HashMap<>();
    }

    @Override
    public void consulta(String strKey) {
        try {
            Statement sentencia= ConexionMySQL.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(Constante.STR_SQL_SELECT_JUGADOR+strKey+"'");

            while (resultado.next())
            {
                jugadorHashMap.put(resultado.getString (5),
                        new Jugador(
                                resultado.getInt (1),
                                resultado.getInt (2),
                                resultado.getInt (3),
                                resultado.getInt (4),
                                resultado.getString (5)
                        )
                );
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String verificarElemento(String strKey) {
        String strResult = "";
        try{
            strResult = String.valueOf(jugadorHashMap.get(strKey).getIntIdJugador());
        }catch (Exception e){
            System.out.println(String.format("El nombre: %s ingresado no se encuentra en la lista ",strKey));
        }

        return strResult;
    }

    @Override
    public void imprimirDatos() {
        for (Map.Entry<String, Jugador> entryJugador : jugadorHashMap.entrySet()) {
            jugadorView.imprimirDatosJugador(
                    entryJugador.getValue().getIntIdJugador(),
                    entryJugador.getValue().getIntIdCarro(),
                    entryJugador.getValue().getIntIdConductor(),
                    entryJugador.getValue().getIntIdCarril(),
                    entryJugador.getValue().getStrNombre()
            );
        }

    }

    @Override
    public void guardarDatos(Object object) throws SQLException, ClassNotFoundException {

        jugador = (Jugador) object;

        // Establecer conexión con la base de datos
        ConexionMySQL conexionBD = new ConexionMySQL();

        // Pasamos el objeto Connection de nuestra clase "ConexionBD" a esta instancia por medio del método getConnection()
        Connection con = conexionBD.obtener();

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = con.prepareStatement(Constante.STR_SQL_INSERT_JUGADOR);

            preparedStatement.setInt(1, jugador.getIntIdCarro());
            preparedStatement.setInt(2, jugador.getIntIdConductor());
            preparedStatement.setInt(3, jugador.getIntIdCarril());
            preparedStatement.setString(4, jugador.getStrNombre());

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Se guardo con exito en la tabla Jugador!");

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
