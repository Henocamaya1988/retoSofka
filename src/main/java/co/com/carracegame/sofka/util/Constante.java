package co.com.carracegame.sofka.util;

import co.com.carracegame.sofka.model.Juego;

import java.util.HashMap;

public class Constante {
    public static final String STR_SQL_INSERT_CONDUCTOR ="INSERT INTO conductor";
    public static final String STR_SQL_SELECT_CODUCTOR = "SELECT * FROM conductor";
    public static final String STR_SQL_INSERT_JUGADOR ="INSERT INTO jugador (idcarro,idconductor,idcarril,nombre) values (?,?,?,?)";
    public static final String STR_SQL_SELECT_JUGADOR = "SELECT * FROM jugador where nombre ='";
    public static final String STR_SQL_SELECT_CARRO ="SELECT * FROM carro";
    public static final String STR_SQL_SELECT_PISTA = "SELECT * FROM pista";
    public static final String STR_SQL_SELECT_JUEGO ="SELECT * FROM juego where descripcion='";
    public static final String STR_SQL_INSERT_JUEGO = "INSERT INTO juego (idjugador,descripcion,distanciaRecorrida) values(?,?,?)";
    public static final String STR_SQL_SELECT_GANADOR_JUEGO = "SELECT sum(distanciaRecorrida) FROM carracegame.juego where descripcion='";
    public static final String STR_SQL_SELECT_PODIO = "SELECT * FROM podio where DescripcionJuego='";
    public static final String STR_SQL_INSERT_PODIO = "INSERT INTO podio(puesto,descripcionP,DescripcionJuego,idJugador,DistanciaRecorrida) values(?,?,?,?,?)";

    public static HashMap<Integer, Juego> juegoHashMapIncio;
}
