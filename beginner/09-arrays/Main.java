/**
 * Beginner Lesson 09 – Arrays
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println("First fruit: " + fruits[0]);

        // Iterate
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Multi-dimensional
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("matrix[1][0] = " + matrix[1][0]);

        // Utility
        int[] numbers = {5, 2, 8, 1};
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
