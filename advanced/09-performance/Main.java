/**
 * Advanced Lesson 09 – Simple Performance Tips
 */
public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();

        // Prefer StringBuilder for many concatenations
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        String result = sb.toString();

        long end = System.nanoTime();
        System.out.println("Time (ns): " + (end - start));
        System.out.println("Length: " + result.length());
    }
}
