import spark.Spark;

import static spark.Spark.*;

public class CommandAndControl {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        System.out.println("DSF");
        Spark.stop();
    }

    /**
     * Sets the initialization for a given bot.  Called when a ConnectionManager connects an
     * uninitialized bot to the C&C
     * @param bot the bot to be initialized
    */
    public static void initialize(Bot bot) {

    }
}