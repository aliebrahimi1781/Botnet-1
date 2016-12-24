import java.util.*;

/**
 * Created by seth on 12/21/16.
 */

public class Dispatcher {
    private Map<String, Command> commands;

    public Dispatcher() {
        commands = new HashMap<>();
        commands.put("Keylogger", KEYLOGGER);
        commands.put("DDoS", DDOS);
        commands.put("MitM", MITM);
        commands.put("Spam", SPAM);
        commands.put("Query", QUERY);
        commands.put("Help", HELP);
    }

    private static final Command HELP = (args) -> {
        return Status.DONE;
    };

    private static final Command QUERY = (args) -> {
        return Status.DONE;
    };

    private static final Command SPAM = (args) -> {
        return Status.DONE;
    };

    private static final Command MITM = (args) -> {
        return Status.DONE;
    };

    private static final Command DDOS = (args) -> {
        return Status.DONE;
    };

    private static final Command KEYLOGGER = (args) -> {
        return Status.DONE;
    };

    /**
     * Execute the given command on a new process.
     * @param command the full command requested by the caller including command name and arguments.
     * @return The status of the requested operation.
     */
    public Status Dispatch(String commandLine) {
        String[] args = commandLine.split("\\s");
        return Optional.ofNullable(commands.get(args[0]))
                .orElse(HELP)
                .execute(args);
    }
}

interface Command {
    Status execute(String[] args);
}