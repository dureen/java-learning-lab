/**
 * Beginner Lesson 03 – Data Types
 */
public class Main {
    public static void main(String[] args) {
        // Primitive types
        byte b = 100;
        short s = 1000;
        int i = 42;
        long l = 100000L;
        float f = 19.99f;
        double d = 3.14159;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // Type conversion
        int fromString = Integer.parseInt("10");
        System.out.println("Parsed: " + (fromString + 5));
    }
}
