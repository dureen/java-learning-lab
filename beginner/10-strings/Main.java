/**
 * Beginner Lesson 10 – Strings
 */
public class Main {
    public static void main(String[] args) {
        String text = "  Java Learning Lab  ";
        System.out.println(text.trim());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace("Lab", "Repository"));

        String[] words = "apple,banana,cherry".split(",");
        System.out.println(String.join("-", words));

        String name = "Alice";
        System.out.println("Hello, " + name + "!");
    }
}
