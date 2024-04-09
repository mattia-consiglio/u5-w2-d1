package mattiaconsiglio.u5w2d1.service;

import mattiaconsiglio.u5w2d1.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogPosts = new ArrayList<>();

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }
    public BlogPost addBlogPost(BlogPost blogPost) {
        blogPost.setId(new Random().nextInt(1000000000));
        blogPost.setCover("https://picsum.photos/200/300");
        blogPosts.add(blogPost);
        return blogPost;
    }

    public BlogPost getBlogPost(int id) {
        return blogPosts.stream().filter(blogPost -> blogPost.getId() == id).findFirst().orElseThrow(()->new RuntimeException("Blog post not found"));
    }

    public BlogPost updateBlogPost(int id,  BlogPost blogPost) {
        BlogPost existingBlogPost = getBlogPost(id);
        existingBlogPost.setTitle(blogPost.getTitle());
        existingBlogPost.setCategory(blogPost.getCategory());
        existingBlogPost.setContent(blogPost.getContent());
        existingBlogPost.setCover(blogPost.getCover());
        return existingBlogPost;
    }

    public void deleteBlogPost(int id) {
        blogPosts.removeIf(blogPost -> blogPost.getId() == id);
    }
}
