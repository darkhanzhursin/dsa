package fpp.classworks.lesson6.nested;

public class EffectiveFinalExample {
    int a = 10;
    void testEffective(int z) {
        int b = 20;
        // b = 40; effective final
        class B {
            void print() {
                System.out.println(a + b + z);
            }
        }
    }
}
