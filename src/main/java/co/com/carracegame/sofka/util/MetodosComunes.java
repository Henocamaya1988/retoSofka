package co.com.carracegame.sofka.util;

import java.util.*;

public class MetodosComunes {

    public static String ScannerTeclado(String strMensaje){
        String strResult = "";

        System.out.print(strMensaje);
        Scanner scanner = new Scanner(System.in);
        strResult = scanner.nextLine();

        return strResult;
    }

    public static int convertirKmMts(int intKm){
        int intMts = 0;

        intMts = intKm*1000;

        return intMts;
    }

    public static int lanzarDado(){
        int intDistanciaRecorrer = 0;

        intDistanciaRecorrer =(int)(Math.random()*6+1);

        System.out.println("Resultado del lanzamiento: "+intDistanciaRecorrer+" Avanza: "+intDistanciaRecorrer*100+" Mts.");

        return 0;

    }

    // function to sort hashmap by values
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}

