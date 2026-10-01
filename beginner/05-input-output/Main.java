/**
 * Beginner Lesson 05 – Input & Output
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! Next year you will be " + (age + 1) + ".");

        scanner.close();
    }
}
