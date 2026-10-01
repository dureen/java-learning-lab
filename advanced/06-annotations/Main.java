/**
 * Advanced Lesson 06 – Annotations
 */
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info {
    String value();
}

public class Main {
    @Info("This is a demo method")
    public void demo() {
        System.out.println("Demo running");
    }

    public static void main(String[] args) throws Exception {
        Method method = Main.class.getMethod("demo");
        if (method.isAnnotationPresent(Info.class)) {
            Info info = method.getAnnotation(Info.class);
            System.out.println("Annotation value: " + info.value());
        }
        new Main().demo();
    }
}
