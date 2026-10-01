/**
 * Beginner Lesson 06 – Conditionals
 */
public class Main {
    public static String checkNumber(int n) {
        if (n > 0) {
            return "positive";
        } else if (n < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static void main(String[] args) {
        for (int value : new int[]{5, -3, 0}) {
            System.out.println(value + " is " + checkNumber(value));
        }

        int age = 18;
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("Age " + age + " → " + status);
    }
}
