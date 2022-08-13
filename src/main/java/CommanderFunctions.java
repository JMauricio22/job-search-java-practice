import cli.CLIArguments;
import com.beust.jcommander.JCommander;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class CommanderFunctions {

    public static JCommander buildCommandWithName(Object object) {
        return JCommander.newBuilder().addObject(object).build();
    }

    public static <T> JCommander buildCommandWithName(String name, Supplier<T> supplier) {
        JCommander jCommander = JCommander.newBuilder().addObject(supplier.get()).build();
        jCommander.setProgramName(name);
        return jCommander;
    }


    public static Optional<List<Object>> parseArguments(
            JCommander jCommander,
            String[] arguments,
            JCommanderError jCommanderError) {
        try {
            System.out.println("Parse Arguments");
            jCommander.parse(arguments);
            return Optional.of(jCommander.getObjects());
        } catch (Exception exception) {
            System.out.println("Parse Arguments Exception");
            jCommanderError.onError(jCommander);
        }

        return Optional.empty();
    }

    @FunctionalInterface
    interface JCommanderError {
        void onError(JCommander jCommander);
    }
}
