package fpp.classworks.lesson8.iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<String> javaList = new ArrayList<>();
        javaList.add("Bob");
        javaList.add("Carol");
        javaList.add("Steve");
        javaList.forEach(n -> System.out.println(n));
        System.out.println();
        System.out.println("Iterator:");
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "Welcome", "Java", "Object",
                "Array", "String", "Inheritance"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
