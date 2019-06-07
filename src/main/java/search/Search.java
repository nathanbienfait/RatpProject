package search;

import graph.Graph;
import graph.Neighbor;
import graph.Node;
import graph.Station;
import helpers.Calculator;

import java.util.*;

public class Search {


    @SuppressWarnings("Duplicates")
    public Node bfs(Station initialState, Station goalState) {
        List<Station> visited = new ArrayList<>();
        Queue<Node> fringe = new LinkedList<>();


        ArrayList<Station> path = new ArrayList<>();
        path.add(initialState);

        fringe.add(new Node(initialState, path, 0));

        while (!fringe.isEmpty()) {
            Node node = fringe.remove();
            if (node.getStation() == goalState)
                return node;

            if (!visited.contains(node.getStation())) {
                visited.add(node.getStation());
                List<Neighbor> neighbors = node.getStation().getNeighbors();
                for (Neighbor neighbor : neighbors) {
                    ArrayList<Station> currentPath = new ArrayList<>(node.getPath());
                    currentPath.add(neighbor.getStation());
                    neighbor.setCounter(neighbor.getCounter()+1);
                    fringe.add(new Node(neighbor.getStation(), currentPath, 0));
                }
            }
        }
        return null;
    }

    @SuppressWarnings("Duplicates")
    public Node dijkstra(Station initialState, Station goalState) {
        List<Station> visited = new ArrayList<>();
        ArrayList<Node> fringe = new ArrayList<>();


        ArrayList<Station> path = new ArrayList<>();
        path.add(initialState);

        fringe.add(new Node(initialState, path, 0));

        while (!fringe.isEmpty()) {
            Node node = getNextNode(fringe);
            if (node.getStation() == goalState)
                return node;

            if (!visited.contains(node.getStation())) {
                visited.add(node.getStation());
                List<Neighbor> neighbors = node.getStation().getNeighbors();
                for (Neighbor neighbor : neighbors) {
                    ArrayList<Station> currentPath = new ArrayList<>(node.getPath());
                    currentPath.add(neighbor.getStation());
                    double cost = neighbor.getDistance() + node.getCost();
                    if (neighbor.getType().equals("corresp")) {
                        cost += 1000;
                    }

                    fringe.add(new Node(neighbor.getStation(), currentPath, cost));
                }
            }
        }
        return null;
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

    public Node findDiameterBfs(Graph graph) {
        ArrayList<Station> li = new ArrayList<>();
        li.add(graph.getStations().get(0));
        Node diameter = new Node(graph.getStations().get(0), li, 0);
        for (Map.Entry<String, Station> station : graph.getStations().entrySet()) {
            for (Map.Entry<String, Station> station2 : graph.getStations().entrySet()) {
                Node node = bfs(station.getValue(), station2.getValue());
                try {
                    if (diameter.getPath().size() < node.getPath().size()) {
                        diameter = node;
                    }
                } catch (NullPointerException e) {

                }
            }

        }
        return diameter;
    }

    public Node findDiameterDijkstra(Graph graph) {
        ArrayList<Station> li = new ArrayList<>();
        li.add(graph.getStations().get(0));
        Node diameter = new Node(graph.getStations().get(0), li, 0);
        for (Map.Entry<String, Station> station : graph.getStations().entrySet()) {
            for (Map.Entry<String, Station> station2 : graph.getStations().entrySet()) {
                Node node = dijkstra(station.getValue(), station2.getValue());
                try {
                    if (diameter.getCost() < node.getCost()) {
                        diameter = node;
                    }
                } catch (NullPointerException e) {

                }
            }

        }
        return diameter;
    }

    public Neighbor findCluster(Graph graph){
        Neighbor finalNeighbor = new Neighbor(null, null, null,0);
        for(Map.Entry<String, Station> station : graph.getStations().entrySet()){
            for (Map.Entry<String, Station> station2 : graph.getStations().entrySet()) {
                Node node = bfs(station.getValue(),station2.getValue());
                try{
                    for(Neighbor neighbor : node.getStation().getNeighbors()){
                        if(finalNeighbor.getCounter()<neighbor.getCounter())
                            finalNeighbor=neighbor;
                    }
                }catch (NullPointerException e){

                }

            }
        }
        return finalNeighbor;
    }
}
