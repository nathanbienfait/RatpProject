package graph;

import java.util.ArrayList;

public class Node {
    private Station station;
    private ArrayList<Station> path;
    private double cost;

    public Node(Station station, ArrayList<Station> path, double cost) {
        this.station = station;
        this.path = path;
        this.cost = cost;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public ArrayList<Station> getPath() {
        return path;
    }

    public void setPath(ArrayList<Station> path) {
        this.path = path;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
