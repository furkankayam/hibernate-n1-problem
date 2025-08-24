package com.furkankayam.controller;

import com.furkankayam.dto.PostResponse;
import com.furkankayam.dto.mapper.PostMapper;
import com.furkankayam.model.Post;
import com.furkankayam.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PostController {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @GetMapping("/entity-graph")
    public List<PostResponse> getAllPostsEntityGraph() {
        List<Post> posts = postRepository.findAll();
        return postMapper.toPostResponseList(posts);
    }

    @GetMapping("/join-fetch")
    public List<PostResponse> getAllPostsJoinFetch() {
        List<Post> posts = postRepository.findAllJoinFetch();
        return postMapper.toPostResponseList(posts);
    }

}




