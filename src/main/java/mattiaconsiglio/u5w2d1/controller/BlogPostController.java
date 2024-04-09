package mattiaconsiglio.u5w2d1.controller;

import mattiaconsiglio.u5w2d1.entities.BlogPost;
import mattiaconsiglio.u5w2d1.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;


    @GetMapping
    public List<BlogPost> getBlogPosts() {
        return this.blogPostService.getBlogPosts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost addBlogPost(@RequestBody BlogPost blogPost) {
        return this.blogPostService.addBlogPost(blogPost);
    }

    @GetMapping("/{id}")
    public BlogPost getBlogPost(@PathVariable("id") int id) {
        return this.blogPostService.getBlogPost(id);
    }

    @PutMapping("/{id}")
    public BlogPost updateBlogPost(@PathVariable("id") int id, @RequestBody BlogPost blogPost) {
        return this.blogPostService.updateBlogPost(id, blogPost);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBlogPost(@PathVariable("id") int id) {
        this.blogPostService.deleteBlogPost(id);
    }


}
