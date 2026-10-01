/**
 * Advanced Lesson 04 – Synchronization
 */
public class Main {
    private static int shared = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (lock) {
                    shared++;
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Shared value: " + shared);
    }
}
