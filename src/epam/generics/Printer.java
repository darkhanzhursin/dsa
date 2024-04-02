package epam.generics;

public class Printer<T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    void print() {
        System.out.println(thingToPrint);
    }
}
