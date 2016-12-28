import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by seth on 12/21/16.
 */
public class CommandInterpreter {

    Bot bot;

    public CommandInterpreter(Bot bot) {
        this.bot = bot;
    }

    /**
     * get Initialization info for the given bot from the C&C
     * @return true if the query was sent a response.
     */
    public boolean queryInitialization() {
        return false;
    }
}
