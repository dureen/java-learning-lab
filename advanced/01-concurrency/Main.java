/**
 * Advanced Lesson 01 – Concurrency (basic threads)
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread-A starting");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread-A finished");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread-B starting");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            System.out.println("Thread-B finished");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("All done");
    }
}
