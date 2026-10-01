/**
 * Beginner Lesson 07 – Loops
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nWhile loop:");
        int n = 5;
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        System.out.println("\nLoop with break/continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            if (i == 7) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
