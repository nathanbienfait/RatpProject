package helpers;

import graph.Node;
import graph.Station;


import java.util.List;

public class Displayer {

    public static void stationList(List<Station> stations){
        for(Station station : stations){
            System.out.print(station.getNom()+" - ");
            System.out.println(station.getLignes());
        }
    }

}
