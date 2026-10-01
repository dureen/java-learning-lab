/**
 * Advanced Lesson 08 – JDBC (example structure)
 * Requires a JDBC driver and running database.
 */
public class Main {
    public static void main(String[] args) {
        // Typical JDBC pattern:
        //
        // String url = "jdbc:sqlite:demo.db";
        // try (Connection conn = DriverManager.getConnection(url);
        //      Statement stmt = conn.createStatement()) {
        //     stmt.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT)");
        //     stmt.execute("INSERT INTO users (name) VALUES ('Alice')");
        //     ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        //     while (rs.next()) {
        //         System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
        //     }
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }

        System.out.println("JDBC example structure shown in comments.");
        System.out.println("Add a real driver (e.g. SQLite) to try it.");
    }
}
