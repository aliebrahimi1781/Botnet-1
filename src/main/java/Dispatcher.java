import java.util.HashMap;
import java.util.Map;

/**
 * Created by seth on 12/21/16.
 */

public class Dispatcher {
    private Map<String, Runnable> func;
    private Status status;

    public Dispatcher() {
        func = new HashMap<>();
        func.put("Keylogger", this::Keylogger);
        func.put("DDoS", this::DDoS);
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

    private void DDoS() {
    }

    private void Keylogger() {
    }

    /**
     * Execute the given command on a new process.
     * @param command the full command requested by the caller including command name and arguments.
     * @return The status of the requested operation.
     */
    public Status Dispatch(String command) {

        return status;

    }
}