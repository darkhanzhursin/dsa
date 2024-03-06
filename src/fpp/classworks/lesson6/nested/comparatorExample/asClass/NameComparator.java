package fpp.classworks.lesson6.nested.comparatorExample.asClass;

import fpp.classworks.lesson6.nested.comparatorExample.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
