package graph;

public class Neighbor {
    private Station station;
    private String type;

    public Neighbor(Station station, String type) {
        this.station = station;
        this.type = type;
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
}
