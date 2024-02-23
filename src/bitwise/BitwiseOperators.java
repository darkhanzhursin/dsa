package bitwise;

public class BitwiseOperators {

    public static void main(String[] args) {
        // Побитовый унарный оператор NOT
        System.out.println("Пример работы с типом byte");
        byte a = 47;
        byte b = (byte) ~a;
        System.out.println(b);
        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
        System.out.println("Представление числа:" + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b) + "\n");

        System.out.println("Пример работы с типом short");
        short c = 350;
        short d = (short) ~c;
        System.out.println(d);
        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
        System.out.println("Представление числа:" + d + " в двоичной системе исчисления: " + Integer.toBinaryString(d) + "\n");

        System.out.println("Пример работы с типом int");
        int e = 555555555;
        int f = ~e;
        System.out.println(f);
        System.out.println("Представление числа: " + e + " в двоичной системе исчисления: " + Integer.toBinaryString(e));
        System.out.println("Представление числа:" + f + " в двоичной системе исчисления: " + Integer.toBinaryString(f) + "\n");

        System.out.println("Пример работы с типом long");
        long g = 111112222233333L;
        long h = ~g;
        System.out.println(h);
        System.out.println("Представление числа: " + g + " в двоичной системе исчисления: " + Long.toBinaryString(g));
        System.out.println("Представление числа:" + h + " в двоичной системе исчисления: " + Long.toBinaryString(h) + "\n");


        // Побитовый AND
//        System.out.println("Пример:");
//        int a = 7;
//        int b = 5;
//        int c = a & b;
//        System.out.println(b);
//        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
//        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
//        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));

        // Побитовый OR
//        System.out.println("Пример:");
//        int a = 7;
//        int b = 5;
//        int c = a | b;
//        System.out.println(b);
//        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
//        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
//        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));

        // Побитовый исключающее OR - XOR
        // Другими словами, обе части должны отличаться друг от друга (0 ^ 1 → 1) но (1 ^ 1 → 0).
//        System.out.println("Пример:");
//        int a = 7;
//        int b = 5;
//        int c = a ^ b;
//        System.out.println(b);
//        System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
//        System.out.println("Представление числа: " + b + " в двоичной системе исчисления: " + Integer.toBinaryString(b));
//        System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));


        // Сдвиг влево -> умножает на 2
//        int a = 1;
//        int b = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Умножим: " + a + " на 2");
//            int c = a << b;
//            System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
//            System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
//            System.out.println("Результат: " + c);
//            a = c;
//        }

        // Сдвиг вправо -> делит на 2
//        int a = 1024;
//        int b = 1;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Поделим: " + a + " на 2");
//            int c = a >> b;
//            System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
//            System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
//            System.out.println("Результат: " + c);
//            a = c;
//        }
    }
}
