package data;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Tutorial implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;
    private String tutname;
    private String description;
    private String url;
    private String imageUrl;


    public Tutorial(int id, String name, String tutname, String description, String url, String imageUrl) {
        this.id = id;
        this.name = name;
        this.tutname = tutname;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    public Tutorial() {
    }


    @Override
    public String toString() {
        return this.id+" "+" "+this.name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutname() {
        return tutname;
    }

    public void setTutname(String tutname) {
        this.tutname = tutname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
