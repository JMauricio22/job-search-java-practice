package cli;

import com.beust.jcommander.Parameter;
import feign.Param;

public class CLIArguments {

    @Parameter(names = {"-p", "--page"}, description = "Page number")
    private int page = 1;

    @Parameter(names = {"-d", "--descending"}, description = "Whether to show descending results")
    private boolean descending = false;

    @Parameter(names = {"-c", "--company"}, description = "Only get jobs for these companies")
    private String company = null;

    @Parameter(names = {"-le", "--level"}, description = "The experience level required for the job")
    private String level = null;

    @Parameter(names = {"-l", "--location"}, description = "The experience level required for the job")
    private String location = null;

    @Parameter(names = {"-h", "--help"}, description = "Show help", help = true, validateWith = CLIHelpValidator.class)
    private boolean help = false;

    public boolean isHelp() {
        return help;
    }

    public int getPage() {
        return page;
    }

    public boolean isDescending() {
        return descending;
    }

    public String getCompany() {
        return company;
    }

    public String getLevel() {
        return level;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "page=" + page +
                ", descending=" + descending +
                ", company='" + company + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", help=" + help +
                '}';
    }
}
