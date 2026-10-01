/**
 * Beginner Lesson 02 – Variables
 */
public class Main {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 1.68;
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Is student: " + isStudent);

        // Reassignment
        age = 26;
        System.out.println("New age: " + age);
    }
}
