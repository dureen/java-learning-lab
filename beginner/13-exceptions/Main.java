/**
 * Beginner Lesson 13 – Exceptions
 */
public class Main {
    public static Double safeDivide(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
            return null;
        } finally {
            System.out.println("Division attempt finished");
        }
    }

    public static void main(String[] args) {
        System.out.println(safeDivide(10, 2));
        System.out.println(safeDivide(10, 0));

        try {
            int number = Integer.parseInt("not a number");
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
