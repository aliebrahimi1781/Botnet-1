import java.util.HashSet;
import java.util.Set;

/**
 * Created by seth on 12/22/16.
 */

enum Status {
    WAITING, RUNNING, DONE, COMMAND_NOT_FOUND,
    COULD_NOT_EXECUTE, ERROR
};

class Tools {

    private static final Set<String> commands = new HashSet<String>() {{
        add("Keylogger");
        add("DDoS");
        add("MitM");
        add("Spam");
        add("Help");
    }};

    static String HelpMessage() {
        StringBuilder msg = new StringBuilder("Possible Commands:\n");
        for (String s : (String[])commands.toArray()) {
            msg.append(s).append("\n");
        }
        return msg.toString();
    }

    static String HelpMessage(Status stat) {
        return stat + "\n" + HelpMessage();
    }
}
