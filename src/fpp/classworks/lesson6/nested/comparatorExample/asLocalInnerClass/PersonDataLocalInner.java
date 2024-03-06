package fpp.classworks.lesson6.nested.comparatorExample.asLocalInnerClass;

import fpp.classworks.lesson6.nested.comparatorExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataLocalInner {

    public static void main(String[] args) {
        PersonDataLocalInner personDataLocalInner = new PersonDataLocalInner();
        Person[] people = Person.prepareData();
        personDataLocalInner.sort(people);
        Arrays.stream(people).forEach(p -> System.out.println(p.getName()));
    }

    private void sort(Person[] people) {
        class NameComparator implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        }

        Arrays.sort(people, new NameComparator());
    }
}
