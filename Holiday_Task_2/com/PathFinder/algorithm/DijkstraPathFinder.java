package Holiday_Task_2.com.PathFinder.algorithm;

import Holiday_Task_2.com.PathFinder.graph.Graph;
import Holiday_Task_2.com.PathFinder.model.Node;
import Holiday_Task_2.com.PathFinder.model.Edge;
import java.util.*;

public class DijkstraPathFinder extends PathFinder {

    public DijkstraPathFinder(Graph graph) {
        super(graph);
    }

    @Override
    public List<String> findShortestPath(String source, String destination) {

        HashMap<String, Integer> distances = new HashMap<>();
        HashMap<String, String> previous = new HashMap<>();
        ArrayList<String> visited = new ArrayList<>();

       
        for (Node node : graph.getNodes().values()) {
            distances.put(node.getName(), 999999);
        }

        distances.put(source, 0);

       
        while (true) {

           
            String current = null;
            int smallest = 999999;

            for (String name : distances.keySet()) {
                if (!visited.contains(name) && distances.get(name) < smallest) {
                    smallest = distances.get(name);
                    current = name;
                }
            }

        
            if (current == null || current.equals(destination)) {
                break;
            }

            visited.add(current);

            for (Edge edge : graph.getEdges()) {
                if (edge.getSource().getName().equals(current)) {
                    String neighbor = edge.getDestination().getName();
                    int newDistance = distances.get(current) + edge.getWeight();

                    if (newDistance < distances.get(neighbor)) {
                        distances.put(neighbor, newDistance);
                        previous.put(neighbor, current);
                    }
                }
            }
        }

        
        List<String> path = new ArrayList<>();
        String step = destination;
        while (step != null) {
            path.add(0, step);
            step = previous.get(step);
        }

        return path;
    }
}