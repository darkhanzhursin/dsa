package miu.fpp.classworks.lesson6Nested.comparatorExample.asMemberInnerClass;

import miu.fpp.classworks.lesson6Nested.comparatorExample.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDataWithMember {
    protected class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public NameComparator getNameComparator() {return new NameComparator();}

    public static void main(String[] args) {
        int x = 0;
        int y = x++ * x;
        System.out.println(y);
        PersonDataWithMember personDataWithMember = new PersonDataWithMember();
        Person[] people = Person.prepareData();
        Arrays.sort(people, personDataWithMember.getNameComparator());
        Arrays.stream(people).forEach(p -> System.out.println(p.getName()));
    }
}
