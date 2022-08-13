package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class JobResource {

    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("results")
    @Expose
    private List<JobPosition> results;

    public List<JobPosition> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "JobResource{" +
                "page='" + page + '\'' +
                ", results=" + results +
                '}';
    }
}
