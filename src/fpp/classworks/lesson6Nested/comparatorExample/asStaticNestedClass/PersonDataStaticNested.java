package fpp.classworks.lesson6Nested.comparatorExample.asStaticNestedClass;


import java.util.Arrays;

public class PersonDataStaticNested {

    public static void main(String[] args) {
        Person2[] people = prepareData();
        Arrays.sort(people, new Person2.NameComparator());
        Arrays.stream(people).forEach(p -> System.out.println(p.getName()));
    }

    public static Person2[] prepareData() {
        Person2[] persons = {
                new Person2("Joe"), new Person2("Bob"), new Person2("Anne")
        };

        return persons;
    }
}
