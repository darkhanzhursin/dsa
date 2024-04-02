package epam.func_comp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    static Predicate<String> startsWithA = text -> text.startsWith("A");
    static Predicate<String> endsWithX = text -> text.endsWith("x");
    static boolean checkWithComposition1(String str) {
        Predicate<String> startsWithAAndEndsWithX =
                text -> startsWithA.test(text) && endsWithX.test(text);
        return startsWithAAndEndsWithX.test(str);
    }

    static boolean composeAnd(String str) {
        Predicate<String> composed = startsWithA.and(endsWithX);
        return composed.test(str);
    }

    static boolean composeOr(String str) {
        Predicate<String> composed = startsWithA.or(endsWithX);
        return composed.test(str);
    }

    static void composeAndThen(String str) {
        Consumer<String> lowerPrint = text -> System.out.println(text.toLowerCase());
        Consumer<String> upperPrint = text -> System.out.println(text.toUpperCase());
        lowerPrint.andThen(upperPrint).accept(str);
    }

    static Integer compose(int n) {
        Function<Integer, Integer> multiply = value -> value * 2;
        Function<Integer, Integer> add = value -> value + 3;
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        return addThenMultiply.apply(n);
    }
    public static void main(String[] args) {
        String  input = "A hardworking person must relax";
        boolean result = checkWithComposition1(input);
        System.out.println(result);

        boolean resultAnd = composeAnd(input);
        System.out.println(resultAnd);

        composeAndThen("Menin Elim");
        int c = compose(3);
        System.out.println(c);
    }
}
