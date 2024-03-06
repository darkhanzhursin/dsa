package fpp.classworks.lesson6.nested;

public class MyOuterClass2 {
    MyInnerClass inner;
    private String  param;

    public MyOuterClass2(String param) {
        inner = new MyInnerClass("innerStr");
        this.param = param; // the outer class version og this
    }

    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
        // String t = inner.this.innerParam; // compiler error
    }

    class MyInnerClass {
        private String innerParam;

        public MyInnerClass(String innerParam) {
            // the inner class version of 'this'
            this.innerParam = innerParam;
        }
        void innerMethod() {
            // accessing enclosing class's version of this
            System.out.println(MyOuterClass2.this.param);
            // same as the following
            System.out.println(param);
        }

        class InnerClass2 {
            void innerMethod() {
                // accessing enclosing class's version of this
                System.out.println(MyOuterClass2.this.param);
                // same as the following
                System.out.println(param);
            }
        }
    }

    public static void main(String[] args) {
        (new MyOuterClass2("outerStr")).outerMethod();
    }
}
