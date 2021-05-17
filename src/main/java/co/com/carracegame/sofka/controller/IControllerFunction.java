package co.com.carracegame.sofka.controller;

import java.sql.SQLException;

public interface IControllerFunction {
    public void consulta(String strKey);
    public String verificarElemento(String intKey);
    public void imprimirDatos();
    public void guardarDatos(Object object) throws SQLException, ClassNotFoundException;
    public void actualizarDatos();
    public void eliminarDatos(String strId);
}
