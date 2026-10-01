/**
 * Simple in-memory database app
 */
import java.util.*;

public class Main {
    static class User {
        int id;
        String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + ": " + name;
        }
    }

    public static void main(String[] args) {
        Map<Integer, User> db = new HashMap<>();
        db.put(1, new User(1, "Alice"));
        db.put(2, new User(2, "Bob"));

        System.out.println("Users in DB:");
        db.values().forEach(System.out::println);

        // Query
        User found = db.get(1);
        System.out.println("\nFound: " + found);
    }
}
