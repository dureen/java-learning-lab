/**
 * Simple Todo CLI project
 */
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {
    private static final Path TODO_FILE = Paths.get("todos.txt");

    public static List<String> loadTodos() throws IOException {
        if (!Files.exists(TODO_FILE)) return new ArrayList<>();
        return Files.readAllLines(TODO_FILE);
    }

    public static void saveTodos(List<String> todos) throws IOException {
        Files.write(TODO_FILE, todos);
    }

    public static void main(String[] args) throws IOException {
        List<String> todos = loadTodos();
        System.out.println("Current todos:");
        for (int i = 0; i < todos.size(); i++) {
            System.out.println((i + 1) + ". " + todos.get(i));
        }

        todos.add("Learn Java");
        saveTodos(todos);
        System.out.println("\nAdded 'Learn Java'");
    }
}
