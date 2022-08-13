package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.Objects;
@Generated("jsonschema2pojo")
public class JobPosition {
    @SerializedName("contents")
    @Expose
    private String contents;

    private String name;

    private String type;

    @SerializedName("publication_date")
    private String publicationDate;


    public JobPosition(String contents, String name, String type, String publicationDate) {
        this.contents = contents;
        this.name = name;
        this.type = type;
        this.publicationDate = publicationDate;
    }


    public String getContents() {
        return contents;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(contents, that.contents) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(publicationDate, that.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents, name, type, publicationDate);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "contents='" + contents + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
