package Holiday_Task_2.com.PathFinder.service;

import Holiday_Task_2.com.PathFinder.algorithm.DijkstraPathFinder;
import Holiday_Task_2.com.PathFinder.algorithm.PathFinder;
import Holiday_Task_2.com.PathFinder.graph.Graph;
import java.util.List;

public class PathService {

    private PathFinder pathFinder;

    public PathService(Graph graph) {
        // Polymorphism - PathFinder reference points to DijkstraPathFinder object
        this.pathFinder = new DijkstraPathFinder(graph);
    }

    public void findAndPrintPath(String source, String destination) {

        System.out.println("\nFinding shortest path from " + source + " to " + destination + "...");

        List<String> path = pathFinder.findShortestPath(source, destination);
        if (path.isEmpty() || !path.get(0).equals(source)) {
            System.out.println("No path found!");
        } else {
            System.out.println("Shortest path: " + String.join(" -> ", path));
        }
    }
}