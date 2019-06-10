import graph.Graph;
import graph.Neighbor;
import graph.Node;
import graph.Station;
import helpers.Displayer;
import helpers.Parser;
import search.Search;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Graph graph = Parser.JsonParser("./src/main/resources/data.json");
        Search search = new Search();

        Station initalStation = graph.getStations().get("A_1670");
        Station goalStation = graph.getStations().get("1889");

        System.out.println("----Path from "+initalStation.getNom()+" to "+goalStation.getNom()+" using BFS----");
        Displayer.stationList(search.bfs(initalStation, goalStation).getPath());

        System.out.println("----Path from "+initalStation.getNom()+" to "+goalStation.getNom()+" using Dijkstra----");
        Displayer.stationList(search.dijkstra(initalStation, goalStation).getPath());

        System.out.println("----Diameter of the graph using BFS----");
        Node diameterBfs = search.findDiameterBfs(graph);
        Displayer.stationListWithSubPath(diameterBfs.getPath());
        System.out.println("Number of nodes : "+diameterBfs.getPath().size());

        System.out.println("----Diameter of the graph using Dijkstra----");
        Node diameterDijkstra = search.findDiameterDijkstra(graph);
        Displayer.stationListWithSubPath(diameterDijkstra.getPath());
        System.out.println("Number of nodes : "+diameterDijkstra.getPath().size());
        System.out.println("Distance in meters : "+diameterDijkstra.getCost());




        System.out.println("----Edge with highest betweenness----");
        Neighbor cluster = search.findCluster(graph);
        System.out.println("Counter : "+cluster.getCounter());
        System.out.println("Edge from "+cluster.getFrom().getNom()+" to "+cluster.getStation().getNom());

    }
}
