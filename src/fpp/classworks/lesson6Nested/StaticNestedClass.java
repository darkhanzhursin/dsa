package fpp.classworks.lesson6Nested;

public class StaticNestedClass {
    private String s = "hello";

    public static void main(String[] args) {
        new StaticNestedClass();
    }

    StaticNestedClass() {
        // access static methods in the usual way
        MyStaticNestedClass.myStaticMethod();
        // access instance methods in the usual way too
        // except that now private methods are also accessible
        MyStaticNestedClass cl = new MyStaticNestedClass();
        cl.myOtherMethod();
        // as with inner classes, private instance variables are accessible
        int y = cl.x;
    }

    static class MyStaticNestedClass {
        private int x = 0;

        static void myStaticMethod() {
            System.out.println();
        }

        private void myOtherMethod() {
            System.out.println("Other method");
        }
    }
}

class AnotherClass {
    public static void main(String[] args) {
        StaticNestedClass.MyStaticNestedClass cl = new StaticNestedClass.MyStaticNestedClass();
        StaticNestedClass ob = new StaticNestedClass();

    }
}
