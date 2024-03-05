package fpp.classworks.lesson5.oop.interfaceExample;

public class MyClass implements MyInterface {

    @Override
    public void myAbstractMethod() {
        System.out.println("Implemented abstract method.");
        defaultMethodInInterface();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myAbstractMethod();
        MyInterface.staticMethodInInterface();

        //myClass.defaultMethodInInterface();
        System.out.println(MyInterface.MY_CONSTANT);
    }

//    @Override
//    public void defaultMethodInInterface() {
//        System.out.println("dasdas");
//    }
}
