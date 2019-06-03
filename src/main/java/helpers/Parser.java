package helpers;



import com.fasterxml.jackson.databind.ObjectMapper;
import graph.Graph;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static void JsonParser(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Graph graph = objectMapper.readValue(new File("./src/main/resources/data.json"), Graph.class);
        System.out.println(graph.getStations().get("1621").getNom());
    }

}
