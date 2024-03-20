package fpp.classworks.lesson6Nested;

public class MyOuterClass {

    private String s = "hello";

    public static void main(String[] args) {
        new MyOuterClass();
    }

    MyOuterClass() {
        MyInnerClass myInnerClass = new MyInnerClass();
        System.out.println(myInnerClass.intval);
        myInnerClass.innerMethod();
        MyInnerClass.innerStaticMethod();
        System.out.println(MyInnerClass.staticValue);
    }

    private class MyInnerClass {
        private static int staticValue = 123;
        private int intval = 3;
        String s = "inner";
        private void innerMethod() {
            System.out.println(MyOuterClass.this.s);
            System.out.println(s);
            System.out.println(staticValue);
        }
        private static void innerStaticMethod() {
            System.out.println("inner static");
            System.out.println(staticValue);
        }
    }
}
