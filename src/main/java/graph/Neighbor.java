package graph;

public class Neighbor {
    private Station station;
    private String type;
    private double distance;
    private Station from;
    private int counter;


    public Neighbor(Station station, String type,Station from, double distance) {
        this.station = station;
        this.type = type;
        this.distance = distance;
        this.from = from;
        this.counter = 0;


    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    public Station getFrom() {
        return from;
    }

    public void setFrom(Station from) {
        this.from = from;
    }

}
