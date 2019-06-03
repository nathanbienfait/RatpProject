package graph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ligne {
    private String [][] arrets;
    private String name;
    private String num;
    private String color;
    private String type;
    private int [][] labels;

    public String[][] getArrets() {
        return arrets;
    }

    public void setArrets(String[][] arrets) {
        this.arrets = arrets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[][] getLabels() {
        return labels;
    }

    public void setLabels(int[][] labels) {
        this.labels = labels;
    }
}
