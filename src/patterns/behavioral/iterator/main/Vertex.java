package patterns.behavioral.iterator.main;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private final T data;
    private boolean visited;

    public Vertex(T data) {
        this.data = data;
    }

    private List<Vertex<T>> neighbors = new LinkedList<>();

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void  setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }
}
