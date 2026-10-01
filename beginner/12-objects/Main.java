/**
 * Beginner Lesson 12 – Objects
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void haveBirthday() {
        age++;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Bob", 30);
        System.out.println(p.getName() + " is " + p.getAge());
        p.haveBirthday();
        System.out.println("After birthday: " + p.getAge());
    }
}
