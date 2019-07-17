package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post>  posts = new ArrayList<>();

        Post post = new Post();
        post.setTitle("Post 1");
        post.setBody("This is post 1");
        post.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("This is post 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("This is post 3");
        post3.setDate(new Date());

        posts.add(post);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost(){
        ArrayList<Post>  posts = new ArrayList<>();

        Post post = new Post();
        post.setTitle("This is your first post");
        post.setBody("This is your first post, lorem ipsum dolor sit amet, lorem ipsum dolor sit smet");
        post.setDate(new Date());

        posts.add(post);

        return posts;
    }
}
