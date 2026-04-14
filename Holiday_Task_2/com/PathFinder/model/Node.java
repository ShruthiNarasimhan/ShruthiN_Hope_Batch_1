package Holiday_Task_2.com.PathFinder.model;

public class Node implements Comparable<Node> {
    private String name;
    private int distance;

    public Node(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }

    @Override
    public String toString() {
        return name;
    }
}