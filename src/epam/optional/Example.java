package epam.optional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Example {

    Optional<String> empty = Optional.empty();

    String name = "java";
    Optional<String> opt = Optional.of(name);

    Optional<String> optNullable = Optional.ofNullable(name);




    void test() {
        System.out.println(opt.get());

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min.get());
        }

        System.out.println(min.orElse(-1));

        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(100)));

        System.out.println(min.orElseThrow(IllegalStateException::new));

        min.ifPresent(v -> System.out.println(v));
        min.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
    }
}
