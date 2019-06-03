package graph;

import java.util.ArrayList;

public class Node {
    private Station station;
    private ArrayList<Station> path;
    private int cost;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
