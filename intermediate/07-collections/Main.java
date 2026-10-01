/**
 * Intermediate Lesson 07 – Collections
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>(list);
        System.out.println("Set: " + set);

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Map: " + map);
    }
}
