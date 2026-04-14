package Holiday_Task_2.com.PathFinder.graph;

import Holiday_Task_2.com.PathFinder.model.Node;
import Holiday_Task_2.com.PathFinder.model.Edge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Graph {
    private HashMap<String, Node> nodes;
    private ArrayList<Edge> edges;

    public Graph() {
        nodes = new HashMap<>();
        edges = new ArrayList<>();
    }

    public void addNode(String name) {
        nodes.put(name, new Node(name));
    }

    public void addEdge(String sourceName, String destName, int weight) {
        Node source = nodes.get(sourceName);
        Node dest = nodes.get(destName);
        edges.add(new Edge(source, dest, weight));
        edges.add(new Edge(dest, source, weight)); // both directions
    }

    public Node getNode(String name) {
        return nodes.get(name);
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public HashMap<String, Node> getNodes() {
        return nodes;
    }

    // Iterator concept
    public Iterator<Node> getNodeIterator() {
        return nodes.values().iterator();
    }
}