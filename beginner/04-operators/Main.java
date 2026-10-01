/**
 * Beginner Lesson 04 – Operators
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic:");
        System.out.println(a + b + " " + (a - b) + " " + (a * b) + " " + (a / b) + " " + (a % b));

        System.out.println("\nComparison:");
        System.out.println((a > b) + " " + (a == b) + " " + (a != b));

        System.out.println("\nLogical:");
        System.out.println((true && false) + " " + (true || false) + " " + (!true));

        System.out.println("\nAssignment:");
        int x = 5;
        x += 2;
        System.out.println(x);
    }
}
