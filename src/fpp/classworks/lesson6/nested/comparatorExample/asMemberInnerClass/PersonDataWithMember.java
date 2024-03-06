package fpp.classworks.lesson6.nested.comparatorExample.asMemberInnerClass;

import fpp.classworks.lesson6.nested.comparatorExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataWithMember {
    private class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public NameComparator getNameComparator() {return new NameComparator();}

    public static void main(String[] args) {
        PersonDataWithMember personDataWithMember = new PersonDataWithMember();
        Person[] people = Person.prepareData();
        Arrays.sort(people, personDataWithMember.getNameComparator());
        Arrays.stream(people).forEach(p -> System.out.println(p.getName()));
    }
}
