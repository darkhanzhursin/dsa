package miu.fpp.classworks.lesson12Exception;

import java.io.IOException;

public class FinallyTest {
    public static void test() {
        try {
            System.out.println("Inside test.");
            myMethod();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //throw new Exception("second");
        } finally {
//            System.exit(0);
            System.out.println("finally!");
        }
        System.out.println("last statement");
        System.exit(0);
    }

    static void myMethod() throws IOException {
        throw new IOException("myMethod");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hi");
            test();
        } catch (Exception ex) {
            System.out.println("Inside main method: " + ex.getMessage());
        }
        System.out.println("END");
    }
}
