import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by seth on 12/21/16.
 */
public class CommandInterpreter {
    private static final Set<String> commands = new HashSet<String>() {{
        add("Keylogger");
        add("DDoS");
        add("MitM");
        add("Spam");
    }};
}
