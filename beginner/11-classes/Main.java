/**
 * Beginner Lesson 11 – Classes
 */
class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String bark() {
        return name + " says woof!";
    }

    @Override
    public String toString() {
        return "Dog(name=" + name + ", age=" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        System.out.println(dog);
        System.out.println(dog.bark());
    }
}
