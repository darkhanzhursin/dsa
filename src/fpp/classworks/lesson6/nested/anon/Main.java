package fpp.classworks.lesson6.nested.anon;

public class Main {

    public static void main(String[] args) {
        // Anonymous Inner Class on inheritance
//        Vehicle v = new Vehicle("Tesla") {
//            String modelName = "Model Y";
//
//            public String getModelName() {
//                return modelName;
//            }
//
//            @Override
//            public void printSomething() {
//                System.out.println("Vehicle " + name);
//            }
//        };
//        v.printSomething();
//
//        Vehicle v2 = new Vehicle() {
//            @Override
//            public void printSomething() {
//                System.out.println("Vehicle " + name);
//            }
//        };
//
//        v2.printSomething();
//
//        ILuxury s = new ILuxury() {
//            @Override
//            public boolean isLuxury() {
//                return false;
//            }
//
//            @Override
//            public void printSpecial() {
//                System.out.println("smt");
//            }
//
//            void print() {
//                System.out.println("print");
//            }
//        };
//
//
//
//        MyFunctionalInterface i = (x, y) -> {
//            return x + y;
//        };
//
//        MyFunctionalInterface.print();

        Calculator addition = y -> {
            int x = 100 + y;
            return x;
        };

        System.out.println(addition.calculate(1));

        MyInterface3 myInterface3 = (s1,  s2) -> {
            System.out.println(s1 + s2);
        };

        myInterface3.method("Hi, ", "there");
    }
}
