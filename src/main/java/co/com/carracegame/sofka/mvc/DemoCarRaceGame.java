package co.com.carracegame.sofka.mvc;
import co.com.carracegame.sofka.controller.*;
import co.com.carracegame.sofka.model.*;
import co.com.carracegame.sofka.util.Constante;
import co.com.carracegame.sofka.util.MetodosComunes;
import co.com.carracegame.sofka.view.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class DemoCarRaceGame {



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        int cantidadJugadores = 0;
        int contadorJ = 1;
        int contadorJuego = 1;
        String opcionContinuar = "";
        String strDescripcionJuego = "";
        String strTime = "";
        int intMetaSuperada = 1;
        int intLimiteMeta = 0;
        int intContadorPuesto = 1;

        ConductorController conductorController = new ConductorController(new ConductorView(),new Conductor());;
        CarroController carroController = new CarroController(new CarroView(),new Carro());
        PistaController pistaController = new PistaController(new PistaView(),new Pista());
        JugadorController jugadorController = new JugadorController(new JugadorView(),new Jugador());
        JuegoController juegoController = new JuegoController(new JuegoView(),new Juego());
        PodioController podioController = new PodioController(new PodioView(),new Podio());
        HashMap<Integer,Integer> integerHashMapJugadores = new HashMap<>();


        int intIdCoductor = 0;
        int intIdCarro = 0;
        int intIdCarril =0;
        String strNombreJugador = "";
        JuegoView juegoView = new JuegoView();


        do {
            System.out.println("--- Iniciando Juego...  ---");
            cantidadJugadores = Integer.parseInt(MetodosComunes.ScannerTeclado("Por favor ingrese la cantidad de Jugadores:"));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            strTime = dtf.format(LocalDateTime.now());

            if (cantidadJugadores<3){
                System.out.println("La cantidad de judadores debe ser mayor que 3");
                break;
            }
            carroController.consulta(String.valueOf(cantidadJugadores));
            conductorController.consulta(String.valueOf(cantidadJugadores));
            pistaController.consulta(String.valueOf(cantidadJugadores));

            while (contadorJ<=cantidadJugadores){

                System.out.println("********Lista de Carros*******");
                carroController.imprimirDatos();
                intIdCarro = Integer.parseInt(MetodosComunes.ScannerTeclado("Seleccione el Carro - Ingresando el Id del Carro: "));
                if (carroController.verificarElemento(String.valueOf(intIdCarro)).equals(""))break;
                carroController.eliminarDatos(String.valueOf(intIdCarro));


                System.out.println("********Lista de Coductores*******");
                conductorController.imprimirDatos();
                intIdCoductor = Integer.parseInt(MetodosComunes.ScannerTeclado("Seleccione el Coductor - Ingresando el Id del Conductor: "));
                if (conductorController.verificarElemento(String.valueOf(intIdCoductor)).equals(""))break;
                conductorController.eliminarDatos(String.valueOf(intIdCoductor));

                System.out.println("********Lista de Pista*******");
                pistaController.imprimirDatos();
                intIdCarril = Integer.parseInt(MetodosComunes.ScannerTeclado("Seleccione un Carril - Ingresando el Id del Carril: "));
                if (pistaController.verificarElemento(String.valueOf(intIdCarril)).equals(""))break;
                intLimiteMeta = pistaController.limitePista(intIdCarril);
                System.out.println("Limite Pista: "+intLimiteMeta+" Mts");
                pistaController.eliminarDatos(String.valueOf(intIdCarril));


                strNombreJugador = MetodosComunes.ScannerTeclado("Ingrese el Nombre del Jugador: ");
                jugadorController.guardarDatos(new Jugador(0,intIdCarro,intIdCoductor,intIdCarril,strNombreJugador));
                jugadorController.consulta(strNombreJugador);
                jugadorController.imprimirDatos();
                strDescripcionJuego = "Juego"+contadorJuego+"-"+strTime;
                juegoController.guardarDatos(new Juego(0,Integer.parseInt(jugadorController.verificarElemento(strNombreJugador)),strDescripcionJuego,0));


                contadorJ++;
            }


            while (intMetaSuperada<=intLimiteMeta){

                juegoController.consulta(strDescripcionJuego);

                for (Map.Entry<Integer, Juego> entryJuego : Constante.juegoHashMapIncio.entrySet()) {
                    juegoView.imprimirDatosJuego(
                            entryJuego.getValue().getIntIdJuego(),
                            entryJuego.getValue().getIntIdJugador(),
                            entryJuego.getValue().getStrDescripcion(),
                            entryJuego.getValue().getIntDistancia()
                    );

                    juegoController.guardarDatos(new Juego(0,entryJuego.getValue().getIntIdJugador(),strDescripcionJuego,MetodosComunes.lanzarDado()));

                    intMetaSuperada = juegoController.consultarGanadorJuego(strDescripcionJuego,entryJuego.getValue().getIntIdJugador());

                    integerHashMapJugadores.put(entryJuego.getValue().getIntIdJugador(),intMetaSuperada);

                    System.out.println("Acumulado: "+intMetaSuperada);

                    if (intMetaSuperada>=intLimiteMeta){
                        System.out.println("Fin Juego: "+strDescripcionJuego);
                        break;
                    }
                }

            }



            intContadorPuesto = 1;

            Map<Integer, Integer> integerHashMapJugadoresIterator = integerHashMapJugadores.entrySet().stream()
                    .sorted(Comparator.comparingInt(e -> -e.getValue()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (a, b) -> { throw new AssertionError(); },
                            LinkedHashMap::new
                    ));


            for (Map.Entry<Integer, Integer> entryJugadores : integerHashMapJugadoresIterator.entrySet()) {
                System.out.println("Id participantes: "+entryJugadores.getKey()+" "+entryJugadores.getValue());
                podioController.guardarDatos(new Podio(0,intContadorPuesto,"Puesto "+intContadorPuesto,strDescripcionJuego,entryJugadores.getKey(),entryJugadores.getValue()));
                intContadorPuesto++;
            }

            podioController.consulta(strDescripcionJuego);
            podioController.imprimirDatos();

            contadorJuego++;
            opcionContinuar = MetodosComunes.ScannerTeclado("Desea continuar jugando.. Para si(y) o no(n)..");
            contadorJ = 1;
        }while (opcionContinuar.equalsIgnoreCase("s"));


    }
}
