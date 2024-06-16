import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream Creation
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Stream<String> streamFromList = list.stream();

        // Intermediate Operations: Filtering, Mapping, Sorting, Distinct
        streamFromList.filter(s -> s.startsWith("a"))
                      .map(String::toUpperCase)
                      .sorted()
                      .distinct()
                      .forEach(System.out::println);

        // Terminal Operations: Collecting, Reducing, Counting
        List<String> result = list.stream().filter(s -> s.length() > 5)
                                           .collect(Collectors.toList());

        Optional<String> reduced = list.stream().reduce((s1, s2) -> s1 + "#" + s2);

        long count = list.stream().count();

        // Reduction Operations: Min, Max
        Optional<String> longestString = list.stream().max(Comparator.comparing(String::length));

        // Parallel Streams
        list.parallelStream().filter(s -> s.startsWith("a"))
                              .forEach(System.out::println);

        // Lazy Evaluation
        Stream<String> filteredStream = list.stream().filter(s -> s.length() > 5);
        // Intermediate operations are lazy, so no processing happens until a terminal operation is invoked.
    }
}

