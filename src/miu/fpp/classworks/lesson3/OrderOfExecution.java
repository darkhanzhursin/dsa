package miu.fpp.classworks.lesson3;

public class OrderOfExecution {
    OrderOfExecution(int x) {
        System.out.println("ONE argument constructor");
    }
    OrderOfExecution() {
        //this(1);
        System.out.println("Empty Constructor");
    }
    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }
    public static void main(String[] args) {
        new OrderOfExecution();
        new OrderOfExecution(8);
    }
}
