package fpp.classworks.lesson6.nested.funcInterface;

public class Main {

    public static void main(String[] args) {
        MyInterface2 myInterface2 = (l, f) -> l + f;
        System.out.println(myInterface2.method2("test1", "test2"));

        Capitalize capitalize = c -> Character.toUpperCase(c);
        System.out.println(capitalize.toCapital('c'));
    }
}
