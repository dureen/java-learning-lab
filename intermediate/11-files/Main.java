/**
 * Intermediate Lesson 11 – Files
 */
import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("sample.txt");

        // Write
        Files.writeString(path, "Hello from Java Learning Lab!\nLine 2\n");

        // Read
        String content = Files.readString(path);
        System.out.println("Content:\n" + content);

        // Append
        Files.writeString(path, "Appended line\n", StandardOpenOption.APPEND);
        System.out.println("Updated:\n" + Files.readString(path));
    }
}
