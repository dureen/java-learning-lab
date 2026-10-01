/**
 * Beginner Lesson 08 – Methods
 */
public class Main {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String greet() {
        return greet("World");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(greet("Java"));
        System.out.println(add(3, 5));
    }
}
