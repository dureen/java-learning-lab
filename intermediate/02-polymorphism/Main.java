/**
 * Intermediate Lesson 02 – Polymorphism
 */
class Shape {
    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Square(4)};
        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
