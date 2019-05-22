package helpers;



import com.fasterxml.jackson.databind.ObjectMapper;
import graph.Node;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Parser {
    public static void JsonParser(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Node> map = objectMapper.readValue(new File("./src/main/resources/data.json"), Map.class);
        System.out.println(map);
    }

}
