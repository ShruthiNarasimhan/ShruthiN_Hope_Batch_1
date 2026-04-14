package Holiday_Task_2.com.PathFinder.util;

import Holiday_Task_2.com.PathFinder.graph.Graph;
import Holiday_Task_2.com.PathFinder.model.Node;
import java.util.Iterator;

public class GraphUtil {
    public static void printAllCities(Graph graph) {
        System.out.println("\nCities in the graph:");
        Iterator<Node> iterator = graph.getNodeIterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            System.out.println("- " + node.getName());
        }
    }
    public static boolean cityExists(Graph graph, String cityName) {
        return graph.getNode(cityName) != null;
    }
}