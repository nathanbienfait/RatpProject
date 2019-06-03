package graph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Station {
    private String commune;
    private String lat;
    private Object lignes;
    private String lng;
    private String nom;
    private String num;
    private String type;
    private boolean isHub;
    private int[][] routes;

    public ArrayList<Station> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<Station> neighbours) {
        this.neighbours = neighbours;
    }

    private ArrayList<Station> neighbours;

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Object getLignes() {
        return lignes;
    }

    public void setLignes(Object lignes) {
        this.lignes = lignes;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsHub() {
        return isHub;
    }

    public void setIsHub(boolean isHub) {
        this.isHub = isHub;
    }

    public int[][] getRoutes() {
        return routes;
    }

    public void setRoutes(int[][] routes) {
        this.routes = routes;
    }
}
