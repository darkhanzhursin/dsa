package miu.fpp.classworks.lesson6Nested.comparatorExample;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person[] prepareData() {
        Person[] persons = {
                new Person("Joe"), new Person("Bob"), new Person("Anne")
        };

        return persons;
    }
}
