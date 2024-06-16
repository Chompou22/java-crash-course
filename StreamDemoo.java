import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemoo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 7, 4, 2, 8, 5, 9, 6);

        // Map: Increment each number by 1
        List<Integer> incrementedNumbers = numbers.stream()
                                                  .map(n -> n + 1)
                                                  .collect(Collectors.toList());
        System.out.println("Mapped Numbers: " + incrementedNumbers);

        // Filter: Select even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Reduce: Sum all numbers
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);
        System.out.println("Sum: " + sum.orElse(0));

        // Sorted: Sort the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
