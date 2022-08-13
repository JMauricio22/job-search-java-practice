package cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {

    public static Map<String, Object> toMap(CLIArguments cliArguments) {
        Map<String, Object> mappedArguments  = new HashMap<>();
        mappedArguments.put("page" , cliArguments.getPage());
        mappedArguments.put("descending" , cliArguments.isDescending());

        if(cliArguments.getCompany() != null){
            mappedArguments.put("company" , cliArguments.getCompany());
        }

        if(cliArguments.getLocation() != null){
            mappedArguments.put("location" , cliArguments.getLocation());
        }

        if(cliArguments.getLevel() != null){
            mappedArguments.put("level" , cliArguments.getLevel());
        }

        return  mappedArguments;
    }

}
