package helpers;



import com.fasterxml.jackson.databind.ObjectMapper;
import graph.Graph;
import graph.Route;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static Graph JsonParser(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Graph graph = objectMapper.readValue(new File(filePath), Graph.class);
        findNeighbours(graph);
        return graph;
    }

    private static void findNeighbours(Graph graph){
        for (Route route : graph.getRoutes()) {
            for(int x=0;x<route.getArrets().length-1;x++){
                graph.getStations().get(route.getArrets()[x]).getNeighbors().add(graph.getStations().get(route.getArrets()[x+1]));
            }
        }
    }

}
