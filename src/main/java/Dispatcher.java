import java.util.HashMap;
import java.util.Map;

/**
 * Created by seth on 12/21/16.
 */

enum Status {WAITING, RUNNING, DONE, ERROR};

public class Dispatcher {
    private Map<String, Runnable> func;
    private Status status;

    public Dispatcher() {
        func = new HashMap<>();
        func.put("Keylogger", this::Keylogger);
        func.put("DDoS", this::DDos);
        func.put("MitM", this::MitM);
        func.put("Spam", this::Spam);
        func.put("Query", this::Query);
        status = Status.DONE;
    }

    private void Query() {
    }

    private void Spam() {
    }

    private void MitM() {
    }

    private void DDos() {
    }

    private void Keylogger() {
    }

    /**
     * Execute the given command on a new process.
     * @param args the command and list of arguments.  args[0] is the command to execute and
     *             args[1...args.length] are the arguments supplied to the command.
     * @return The status of the requested operation.
     */
    public Status Dispatch(String[] args) {
        return status;
    }
}