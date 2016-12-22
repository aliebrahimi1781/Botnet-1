import static spark.Spark.*;

public class CommandAndControl {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        System.out.println("DSF");
        stop();
    }
}