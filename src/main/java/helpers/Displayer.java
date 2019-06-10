package helpers;

import graph.Neighbor;
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

    public static void stationListWithSubPath(List<Station> stations){
        for(int x = 0; x<stations.size(); x++){
            System.out.print(stations.get(x).getNom()+" - ");
            System.out.println(stations.get(x).getLignes());
            if(x<stations.size()-1){
                for(Neighbor neighbor : stations.get(x).getNeighbors()){
                    if(neighbor.getStation().getNum()==stations.get(x+1).getNum()){
                        System.out.println("Distance between : "+neighbor.getDistance()+ " m");
                        break;
                    }
                }
            }
        }
    }

}
