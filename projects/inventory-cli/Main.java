/**
 * Simple Inventory CLI project
 */
import java.util.*;

public class Main {
    static class Item {
        String name;
        int quantity;

        Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return name + " (qty: " + quantity + ")";
        }
    }

    public static void main(String[] args) {
        Map<String, Item> inventory = new HashMap<>();
        inventory.put("laptop", new Item("Laptop", 5));
        inventory.put("mouse", new Item("Mouse", 20));

        System.out.println("Inventory:");
        inventory.values().forEach(System.out::println);

        // Add stock
        Item mouse = inventory.get("mouse");
        mouse.quantity += 10;
        System.out.println("\nAfter restock: " + mouse);
    }
}
