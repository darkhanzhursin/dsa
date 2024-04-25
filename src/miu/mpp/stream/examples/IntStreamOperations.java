package miu.mpp.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamOperations {

    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        List<Integer> ints = Arrays.asList(3, 5, 2, 3, 8);
        List<int[]> intArrs = ints.stream().map(int[]::new).toList();
        List<String> intArrsStr = intArrs.stream().map(Arrays::toString).toList();
        System.out.println(intArrsStr);
        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);

        int max = ints.stream().mapToInt(Integer::intValue).max().getAsInt();

        String[] strsArr = Stream.of("Eleven", "strike", "the", "clock").toArray(String[]::new);
        System.out.println(Arrays.toString(strsArr));

        List<String> stringList = Arrays.asList("Joe", "Tom", "Abe");
        Stream<Stream<Character>> res = stringList.stream().map(s -> characterStream(s));
        Stream<Character> flatRes = stringList.stream().flatMap(s -> characterStream(s));

        // display original values
        System.out.print("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        System.out.printf("Min: %d%n",
                IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n",
                IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n",
                IntStream.of(values).average().getAsDouble());

        // sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y));

        // sum of squares of values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, (x, y) -> x + y * y));
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(1, (x, y) -> x * y));
        // even values displayed in sorted order
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)  //Predicate
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        System.out.printf(
                "Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1, 10).sum());

        // sum range of integers from 1 to 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());
    }

    static Stream<Character> characterStream(String s) {
        List<Character> characterList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characterList.add(c);
        }
        return characterList.stream();
    }
}
