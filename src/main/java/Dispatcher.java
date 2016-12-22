import java.util.*;

/**
 * Created by seth on 12/21/16.
 */

public class Dispatcher {
    private Map<String, Runnable> func;
    private Status status;
    private List<String> command;
    Optional<List<String>> opt;

    public Dispatcher() {
        func = new HashMap<>();
        func.put("Keylogger", this::Keylogger);
        func.put("DDoS", this::DDoS);
        func.put("MitM", this::MitM);
        func.put("Spam", this::Spam);
        func.put("Query", this::Query);
        func.put("Help", this::Help);
        status = Status.DONE;
    }

    private Status Help() {
        return Status.DONE;
    }

    private Status Query() {
        return Status.DONE;
    }

    private Status Spam() {
        return Status.DONE;
    }

    private Status MitM() {
        return Status.DONE;
    }

    private Status DDoS() {
        return Status.DONE;
    }

    private Status Keylogger() {
        return Status.DONE;
    }

    /**
     * Execute the given command on a new process.
     * @param command the full command requested by the caller including command name and arguments.
     * @return The status of the requested operation.
     */
    public Status Dispatch(String command) {
        opt = CommandInterpreter.toList(command);
        opt.orElse(new LinkedList<String>(){{add("Help");}});
        func.get(opt.get().get(0));
        return Status.DONE;
    }
}