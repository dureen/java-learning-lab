/**
 * Advanced Lesson 05 – Reflection
 */
import java.lang.reflect.Method;

public class Main {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Main.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getMethod("sayHello", String.class);
        method.invoke(instance, "Reflection");
    }
}
