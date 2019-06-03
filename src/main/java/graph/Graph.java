package graph;


import java.util.ArrayList;
import java.util.Map;

public class Graph {
    private String[][] corresp;
    private Map<String, Station> stations;
    private ArrayList<Route> routes;
    private Map<String, Ligne> lignes;

    public String[][] getCorresp() {
        return corresp;
    }

    public void setCorresp(String[][] corresp) {
        this.corresp = corresp;
    }

    public Map<String, Station> getStations() {
        return stations;
    }

    public void setStations(Map<String, Station> stations) {
        this.stations = stations;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public Map<String, Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(Map<String, Ligne> lignes) {
        this.lignes = lignes;
    }
}
