package fpp.classworks.lesson6.nested.comparatorExample.asStaticNestedClass;

import java.util.Comparator;

public class Person2 {

    private String name;

    static class NameComparator implements Comparator<Person2> {
        @Override
        public int compare(Person2 p1, Person2 p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
