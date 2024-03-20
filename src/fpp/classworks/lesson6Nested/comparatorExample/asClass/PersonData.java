package fpp.classworks.lesson6Nested.comparatorExample.asClass;

import fpp.classworks.lesson6Nested.comparatorExample.Person;

import java.util.Arrays;

public class PersonData {

    public static void main(String[] args) {
        Person[] persons = Person.prepareData();
        Arrays.sort(persons, new NameComparator());
        Arrays.stream(persons).forEach(p -> System.out.println(p.getName()));
    }
}
