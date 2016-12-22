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

    public static Optional<List<String>> toList(String fullCommand) {
        // segments the string into a list of its parts
        List<String> retVal = Arrays.stream(fullCommand.split(" "))
                                    .map(String::toLowerCase)
                                    .collect(Collectors.toList());

        // if the command exists, return the list containing the command.
        return (commands.contains(retVal.get(0))) ? Optional.of(retVal) : Optional.empty();
    }
}
