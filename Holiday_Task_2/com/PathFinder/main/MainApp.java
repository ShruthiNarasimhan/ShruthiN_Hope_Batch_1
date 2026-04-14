package Holiday_Task_2.com.PathFinder.main;

import Holiday_Task_2.com.PathFinder.graph.Graph;
import Holiday_Task_2.com.PathFinder.service.PathService;
import Holiday_Task_2.com.PathFinder.util.GraphUtil;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        graph.addNode("Chennai");
        graph.addNode("Bangalore");
        graph.addNode("Hyderabad");
        graph.addNode("Mumbai");
        graph.addNode("Delhi");

        graph.addEdge("Chennai", "Bangalore", 350);
        graph.addEdge("Chennai", "Hyderabad", 600);
        graph.addEdge("Bangalore", "Hyderabad", 300);
        graph.addEdge("Bangalore", "Mumbai", 1000);
        graph.addEdge("Hyderabad", "Mumbai", 700);
        graph.addEdge("Mumbai", "Delhi", 1400);
        graph.addEdge("Hyderabad", "Delhi", 500);

        GraphUtil.printAllCities(graph);

        System.out.print("\nEnter your starting city: ");
        String start = sc.nextLine();
        System.out.print("Enter your destination city: ");
        String end = sc.nextLine();

        if (!GraphUtil.cityExists(graph, start) || !GraphUtil.cityExists(graph, end)) {
            System.out.println("One or both cities not found!");
        } else {
            PathService pathService = new PathService(graph);
            pathService.findAndPrintPath(start, end);
        }

        sc.close();
    }
}