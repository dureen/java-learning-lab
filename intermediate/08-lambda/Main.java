/**
 * Intermediate Lesson 08 – Lambda
 */
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Simple lambda
        Runnable r = () -> System.out.println("Hello from lambda");
        r.run();

        // Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Comparator
        java.util.List<String> names = java.util.Arrays.asList("Charlie", "Alice", "Bob");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}
