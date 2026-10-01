/**
 * Advanced Lesson 07 – Design Patterns (Singleton & Factory)
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
}

class ShapeFactory {
    public static Shape create(String type, double value) {
        if ("circle".equalsIgnoreCase(type)) return new Circle(value);
        throw new IllegalArgumentException("Unknown shape");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b); // true

        Shape circle = ShapeFactory.create("circle", 5);
        System.out.println("Area: " + circle.area());
    }
}
