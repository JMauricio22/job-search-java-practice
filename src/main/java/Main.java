import api.ApiFunctions;
import api.JobPosition;
import api.JobResource;
import api.JobsApi;
import cli.CLIArguments;
import cli.CLIFunctions;
import com.beust.jcommander.JCommander;

import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        JCommander jCommander = CommanderFunctions.buildCommandWithName("job-search" , CLIArguments::new);

        Stream<CLIArguments> streamOfCLI =
                CommanderFunctions.parseArguments(jCommander, args , JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliOptional = streamOfCLI
                //Solo nos interesan los casos donde no sea la solicitud de ayuda
                .filter(cli -> !cli.isHelp())
                //Y que contengan un keyword, en otros caso no tenemos que buscar
                .findFirst();

        cliOptional
                .map(CLIFunctions::toMap)
                .map(Main::executeRequest)
                .orElse(Stream.empty())
                //Imprimos los datos por pantalla.
                .forEach(System.out::println);

    }

    public static Stream<JobResource> executeRequest(Map<String, Object> options) {
        JobsApi api = ApiFunctions.buildApi(JobsApi.class, "https://www.themuse.com/api/public/");

        return Stream.of(options)
                .map(api::jobs);

    }
}
