package miu.mpp.best_practices;

import java.util.List;
import java.util.function.Function;

public class Example {
    Function<List<String>, List<String>> elementFirstToUpperCasLambdas = words -> words.stream().map(word -> {
        char firstChar = Character.toUpperCase(word.charAt(0));
        return firstChar + word.substring(1);
    }).toList();
}
