package miu.fpp.classworks.lesson6Nested.comparatorExample.asAnonymous;

import miu.fpp.classworks.lesson6Nested.comparatorExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataAnon {

    public static void main(String[] args) {

        Person[] persons = Person.prepareData();
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //Arrays.sort(persons, Comparator.comparing(Person::getName));
        Arrays.stream(persons).forEach(p -> System.out.println(p.getName()));
    }
}
