package pe.edu.upc.mivecindario.services;

import pe.edu.upc.mivecindario.model.Post;

/**
 * Created by AlfredoRegis on 12/5/16.
 */

public class WallServices {
    public static String WALL_URL = "http://localhost:8080/RestAppMovRA/rest/acceso/";

    private Post currentPost;

    public Post getCurrentPost(){return currentPost;}
    public void setCurrentPost(Post post){currentPost = post;}
}
