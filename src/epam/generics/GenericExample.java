package epam.generics;

import java.util.List;
import java.util.Objects;

public class GenericExample {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(12);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(12.1);
        doublePrinter.print();

        shout("HEY", 324);

        printList(List.of("123", 123, 21.0));
    }

    private static <T, V> T shout(T thingToShout, V otherThing) {
        System.out.println(thingToShout + "!!!!" + otherThing);
        return thingToShout;
    }

    private static void printList(List<?> myList) {
        for (Object i : myList) {
            System.out.println(i);
        }
    }
}
