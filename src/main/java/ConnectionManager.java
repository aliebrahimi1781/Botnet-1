import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by seth on 12/21/16.
 */
public class ConnectionManager {

    private BlockingQueue<Bot> connected;

    public ConnectionManager() {
        connected = new LinkedBlockingQueue<Bot>();
    }
    /**
     * Connect the given bot to the Command and Control.
     * If the bot has not been initialized, initialize it.
     * @param bot the Bot to be connected to the C&C server.
     * @return true if the connection was established.
     */
    public boolean connect(Bot bot) {
        try {
            connected.put(bot);
        } catch (InterruptedException e) {
            return false;
        }
        if (bot.status == Status.INIT) {
            // Somehow get initialization info from C&C
            CommandInterpreter cmdInt = new CommandInterpreter(bot);
            cmdInt.queryInitialization();
        }
        return true;
    }

    /**
     * Disconnect the given bot to the Command and Control.
     * @param bot the Bot to be disconnected from the C&C server.
     * @return true if the connection was terminated.
     */
    public boolean disconnect(Bot bot) {
        return false;
    }

    /**
     * Poll the connection manager for details about the state of the C&C
     * @return will change this so it's own return type later.  Perhaps a Digest() class???
     */
    public Object poll() {
        return new Object();
    }
}
