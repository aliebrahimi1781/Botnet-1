/**
 * Created by seth on 12/21/16.
 */
class Bot {
    Status status;
    String botId;   // Generate a unique ID for a given bot by querying the C&C
    String password;    // Generate a unique password for each bot that can be validated by the C&C

    public Bot() {
        status = Status.INIT;
    }
}


public class Worker {

    public static void main(String[] args) {
        // 1. Instantiate a bot and connection manager
        Bot bot = new Bot();
        ConnectionManager manager = new ConnectionManager();
        // 2. Connect to C&C to initialize the bot
        manager.connect(bot);
        // 3. Get commands from C&C to execute via Dispatcher
        // 4. Report findings back to C&C and wait for additional commands.
    }
}
