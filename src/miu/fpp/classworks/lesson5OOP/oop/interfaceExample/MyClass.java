package miu.fpp.classworks.lesson5OOP.oop.interfaceExample;

public class MyClass implements MyInterface {

    @Override
    public void myAbstractMethod() {
        MyInterface.staticMethodInInterface();
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
