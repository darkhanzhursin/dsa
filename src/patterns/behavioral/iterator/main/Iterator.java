package patterns.behavioral.iterator.main;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();
}
