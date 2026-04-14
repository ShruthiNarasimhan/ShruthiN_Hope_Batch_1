package Holiday_Task_2.com.PathFinder.algorithm;

import Holiday_Task_2.com.PathFinder.graph.Graph;
import java.util.List;

public abstract class PathFinder {
    
    protected Graph graph;

    public PathFinder(Graph graph) {
        this.graph = graph;
    }

    public abstract List<String> findShortestPath(String source, String destination);
}
