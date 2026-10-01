/**
 * Intermediate Lesson 04 – Abstract Classes
 */
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();

    public void stop() {
        System.out.println(brand + " stopped");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.start();
        car.stop();
    }
}
