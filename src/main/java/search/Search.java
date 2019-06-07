package search;

import graph.Graph;
import graph.Node;
import graph.Station;
import helpers.Calculator;

import java.util.*;

public class Search {
    @SuppressWarnings("Duplicates")
    public List<Station> bfs(Station initialState, Station goalState) {
        List<Station> visited = new ArrayList<>();
        Queue<Node> fringe = new LinkedList<>();


        ArrayList<Station> path = new ArrayList<>();
        path.add(initialState);

        fringe.add(new Node(initialState, path, 0));

        while (!fringe.isEmpty()) {
            Node node = fringe.remove();
            if (node.getStation() == goalState)
                return node.getPath();

            if (!visited.contains(node.getStation())) {
                visited.add(node.getStation());
                List<Station> neighbors = node.getStation().getNeighbors();
                for (Station neighbor : neighbors) {
                    ArrayList<Station> currentPath = new ArrayList<>(node.getPath());
                    currentPath.add(neighbor);
                    fringe.add(new Node(neighbor, currentPath, 0));
                }
            }
        }
        return new ArrayList<>();
    }

    @SuppressWarnings("Duplicates")
    public List<Station> dijkstra(Station initialState, Station goalState) {
        List<Station> visited = new ArrayList<>();
        ArrayList<Node> fringe = new ArrayList<>();


        ArrayList<Station> path = new ArrayList<>();
        path.add(initialState);

        fringe.add(new Node(initialState, path, 0));

        while (!fringe.isEmpty()) {
            Node node = getNextNode(fringe);
            if (node.getStation() == goalState)
                return node.getPath();

            if (!visited.contains(node.getStation())) {
                visited.add(node.getStation());
                List<Station> neighbors = node.getStation().getNeighbors();
                for (Station neighbor : neighbors) {
                    ArrayList<Station> currentPath = new ArrayList<>(node.getPath());
                    currentPath.add(neighbor);
                    double cost = Calculator.distanceBetweenStations(node.getStation(),neighbor) + node.getCost();
                    fringe.add(new Node(neighbor, currentPath, cost));
                }
            }
        }
        return new ArrayList<>();
    }

    public Node getNextNode(ArrayList<Node> fringe) {
        Node bestNode = fringe.get(0);
        int bestNodeIndex = 0;

        for (Node node : fringe) {
            if (node.getCost() < bestNode.getCost()) {
                bestNode = node;
                bestNodeIndex = fringe.indexOf(node);
            }
        }
        return fringe.remove(bestNodeIndex);

    }

    /*public List<Station> findDiameterBfs(Graph graph){
        TreeMap<Float, List<Node>> treeMap = new TreeMap<>();
        for(Map.Entry<String,Station> station : graph.getStations().entrySet()){
            for(Map.Entry<String,Station> station2 : graph.getStations().entrySet()){
                List<Node> listStation = bfs(station.getValue(),station2.getValue());
                treeMap.put(listStation.get(listStation.size()-1).get,bfs(station.getValue(),station2.getValue()));
            }

        }
    }*/

}
