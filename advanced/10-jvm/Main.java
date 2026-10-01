/**
 * Advanced Lesson 10 – JVM Basics
 */
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Max memory (MB): " + runtime.maxMemory() / (1024 * 1024));
        System.out.println("Total memory (MB): " + runtime.totalMemory() / (1024 * 1024));
        System.out.println("Free memory (MB): " + runtime.freeMemory() / (1024 * 1024));

        System.out.println("\nJava version: " + System.getProperty("java.version"));
        System.out.println("JVM name: " + System.getProperty("java.vm.name"));
    }
}
