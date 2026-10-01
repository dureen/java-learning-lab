/**
 * Intermediate Lesson 13 – Unit Testing (example functions)
 * Use JUnit 5 for real tests.
 */
public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(isEven(4));
    }
}
