/**
 * Intermediate Lesson 01 – Inheritance
 */
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return name + " makes a sound";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + " says woof!";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.speak());
    }
}
