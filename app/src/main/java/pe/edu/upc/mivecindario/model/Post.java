package pe.edu.upc.mivecindario.model;

/**
 * Created by AlfredoRegis on 12/5/16.
 */

public class Post {

    private String image;
    private String content;
    private String date;


    public Post() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
