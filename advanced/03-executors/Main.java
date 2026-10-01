/**
 * Advanced Lesson 03 – Executors
 */
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> future1 = executor.submit(() -> {
            Thread.sleep(500);
            return "Result from task 1";
        });

        Future<String> future2 = executor.submit(() -> {
            Thread.sleep(300);
            return "Result from task 2";
        });

        System.out.println(future1.get());
        System.out.println(future2.get());

        executor.shutdown();
    }
}
