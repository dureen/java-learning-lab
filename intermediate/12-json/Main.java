/**
 * Intermediate Lesson 12 – JSON (simple manual example)
 * For real projects prefer Jackson or Gson.
 */
public class Main {
    public static void main(String[] args) {
        // Simple JSON-like string representation
        String json = """
            {
              "name": "Alice",
              "age": 25,
              "skills": ["Java", "Git"]
            }
            """;

        System.out.println("JSON example:");
        System.out.println(json);

        // In real code you would parse with a library:
        // ObjectMapper mapper = new ObjectMapper();
        // Person p = mapper.readValue(json, Person.class);
    }
}
