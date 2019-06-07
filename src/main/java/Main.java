import graph.Graph;
import graph.Node;
import graph.Station;
import helpers.Displayer;
import helpers.Parser;
import search.Search;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Graph g = Parser.JsonParser("./src/main/resources/data.json");

        Search s = new Search();

        //Displayer.stationList(s.dijkstra(g.getStations().get("1907"), g.getStations().get("1889")).getPath());
        Node l = s.findDiameterDijkstra(g);
        Displayer.stationList(l.getPath());
        System.out.println(l.getPath().size());
        System.out.println(l.getCost());
    }
}
