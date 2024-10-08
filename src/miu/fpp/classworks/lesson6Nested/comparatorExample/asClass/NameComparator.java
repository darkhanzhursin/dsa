package miu.fpp.classworks.lesson6Nested.comparatorExample.asClass;

import miu.fpp.classworks.lesson6Nested.comparatorExample.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
