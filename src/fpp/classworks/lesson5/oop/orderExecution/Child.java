package fpp.classworks.lesson5.oop.orderExecution;

public class Child extends Parent {

    static String str;
    String instanceStr;

    static {
        str = "Hello World!";
        System.out.println("Child static block: " + str);
    }

    {
        instanceStr = "Hi";
        System.out.println("Child instance block str = " + instanceStr);
    }

    public Child(String s) {
        super(100);
        instanceStr = s;
        System.out.println("Child constructor instatnceStr: " + instanceStr);
    }
}
