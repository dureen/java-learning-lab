/**
 * Intermediate Lesson 10 – Optional
 */
import java.util.Optional;

public class Main {
    public static Optional<String> findName(String id) {
        if ("1".equals(id)) {
            return Optional.of("Alice");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> name = findName("1");
        name.ifPresent(n -> System.out.println("Found: " + n));

        String result = findName("2").orElse("Unknown");
        System.out.println(result);
    }
}
