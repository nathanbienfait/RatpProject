import graph.Graph;
import helpers.Displayer;
import helpers.Parser;
import search.Search;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Graph g = Parser.JsonParser("./src/main/resources/data.json");

        Search s = new Search();

        Displayer.stationList(s.dijkstra(g.getStations().get("1907"), g.getStations().get("1874")));

    }
}
