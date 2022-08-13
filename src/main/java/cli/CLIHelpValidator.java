package cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean isHelp = Boolean.parseBoolean(value);
        if(isHelp){
            throw new ParameterException("Displaying help");
        }
    }
}
