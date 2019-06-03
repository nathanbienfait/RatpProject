package graph;

import java.util.Map;

public class Route {
    private String [] arrets;
    private String direction;
    private String type;
    private String ligne;
    private Map<String,Object[]> intersections;

    public String[] getArrets() {
        return arrets;
    }

    public void setArrets(String[] arrets) {
        this.arrets = arrets;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLigne() {
        return ligne;
    }

    public void setLigne(String ligne) {
        this.ligne = ligne;
    }

    public Map<String, Object[]> getIntersections() {
        return intersections;
    }

    public void setIntersections(Map<String, Object[]> intersections) {
        this.intersections = intersections;
    }
}
