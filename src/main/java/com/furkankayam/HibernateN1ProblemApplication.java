package com.furkankayam;

import com.furkankayam.model.Comment;
import com.furkankayam.model.Post;
import com.furkankayam.repository.CommentRepository;
import com.furkankayam.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class HibernateN1ProblemApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(HibernateN1ProblemApplication.class, args);
    }

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    @Override
    public void run(String... args) {
        // New Posts
        Post post = Post.builder()
                .title("Post 1")
                .build();
        postRepository.save(post);

        // New Comments
        Comment comment1 = Comment.builder()
                .content("Comment 1")
                .post(post)
                .build();
        Comment comment2 = Comment.builder()
                .content("Comment 2")
                .post(post)
                .build();
        Comment comment3 = Comment.builder()
                .content("Comment 3")
                .post(post)
                .build();
        commentRepository.saveAll(List.of(comment1, comment2, comment3));
    }
}