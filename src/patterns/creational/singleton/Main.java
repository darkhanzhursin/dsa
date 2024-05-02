package patterns.creational.singleton;

/*
In Java, Singleton is a design pattern that ensures that a class can only have one object. SingletonUML To create a
singleton class, a class must implement the following properties:

Create a private constructor of the class to restrict object creation outside of the class.
Create a private attribute of the class type that refers to the single object.
Create a public static method that allows us to create and access the object we created. Inside the method, we will
create a condition that restricts us from creating more than one object.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("Geekific"));
        Singleton singleton = Singleton.getInstance("Singleton");
        System.out.println(singleton);
        System.out.println(singleton.getData());
    }
}
