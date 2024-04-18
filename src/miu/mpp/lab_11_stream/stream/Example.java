package miu.mpp.lab_11_stream.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Example {

    Logger log = Logger.getLogger(this.getClass().getPackageName());

    Stream<String> streamEmpty = Stream.empty();

    public Example() throws IOException {
    }

    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    Stream<String> streamOfArray = Stream.of("a", "b", "c");

    String[] arr = new String[]{"a", "b", "c"};
    Stream<String> streamOfArrayFull = Arrays.stream(arr);
    Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

    Stream<String> streamBuilder =
            Stream.<String>builder().add("a").add("b").add("c").build();
    Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);
    Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
    IntStream intStream = IntStream.range(1, 3);

    LongStream longStream = LongStream.rangeClosed(1, 3);

    Random random = new Random();
    DoubleStream doubleStream = random.doubles(3);

    IntStream streamOfChars = "abc".chars();
    Stream<String> streamOfString =
            Pattern.compile(", ").splitAsStream("a, b, c");

    Path path = Paths.get("C:\\file.txt");
    Stream<String> streamOfStrings = Files.lines(path);
    Stream<String> streamWithCharset =
            Files.lines(path, Charset.forName("UTF-8"));

    /*Stream<String> stream =
            Stream.of("a", "b", "c").filter(element -> element.contains("b"));
    Optional<String> anyElement = stream.findAny();
    Optional<String> firstElement = stream.findFirst(); // throws IllegalStateException*/

    List<String> elements =
            Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                    .collect(Collectors.toList());
    Optional<String> anyElement = elements.stream().findAny();
    Optional<String> firstElement = elements.stream().findFirst();

    Stream<String> onceModifiedStream =
            Stream.of("abcd", "bbcd", "cbcd").skip(1); // creates new stream

    Stream<String> twiceModifiedStream =
            Stream.of("abcd", "bbcd", "cbcd").skip(1).map(element -> element.substring(0, 3));

    // Stream Pipeline: stream source -> intermediate ops -> terminal op.
    List<String> list = Arrays.asList("abc1", "abc2", "abc3");
    long size = list.stream().skip(1)
            .map(element -> element.substring(0, 3)).sorted().count();

    Optional<String> stream = list.stream().filter(element -> {
        log.info("filter() was called");
        return element.contains("2");
    }).map(element -> {
        log.info("map() was called");
        return element.toUpperCase();
    }).findFirst();

    OptionalInt reduced =
            IntStream.range(1, 4).reduce((a, b) -> a + b); // 1 + 2 + 3

    int reducedTwoParams =
            IntStream.range(1, 4).reduce(10, (a, b) -> a + b); // 10 + 1 + 2 + 3

    int reducedParams = Stream.of(1, 2, 3)
            .reduce(10, (a, b) -> a + b, (a, b) -> {
                log.info("combiner was called");
                return a + b;
            }); // combiner wasn't called, result: 16

    int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
            .reduce(10, (a, b) -> a + b, (a, b) -> {
                log.info("combiner was called");
                return a + b;
            }); // combiner is called, result: 36

    List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
            new Product(14, "orange"), new Product(13, "lemon"),
            new Product(23, "bread"), new Product(13, "sugar"));

    List<String> collectorCollection =
            productList.stream().map(Product::getName).collect(Collectors.toList());

    String listToString = productList.stream().map(Product::getName)
            .collect(Collectors.joining(", ", "[", "]")); // to String

    double averagePrice = productList.stream()
            .collect(Collectors.averagingInt(Product::getPrice));

    IntSummaryStatistics statistics = productList.stream()
            .collect(Collectors.summarizingInt(Product::getPrice));

    Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
            .collect(Collectors.groupingBy(Product::getPrice));

    Map<Boolean, List<Product>> mapPartioned = productList.stream()
            .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));

    Set<Product> unmodifiableSet = productList.stream()
            .collect(Collectors.collectingAndThen(Collectors.toSet(),
                    Collections::unmodifiableSet));

    Collector<Product, ?, LinkedList<Product>> toLinkedList =
            Collector.of(LinkedList::new, LinkedList::add,
                    (first, second) -> {
                        first.addAll(second);
                        return first;
                    });

    LinkedList<Product> linkedListOfProducts =
            productList.stream().collect(toLinkedList);

    Stream<Product> streamOfCollection1 = productList.parallelStream();
    boolean isParallel = streamOfCollection1.isParallel();
    boolean bigPrice = streamOfCollection1
            .map(product -> product.getPrice() * 12)
            .anyMatch(price -> price > 200);

    IntStream intStreamParallel = IntStream.range(1, 150).parallel();
    boolean isParallel2 = intStreamParallel.isParallel();

    IntStream intStreamSequential = intStreamParallel.sequential();
    boolean isParallel3 = intStreamSequential.isParallel();
}
