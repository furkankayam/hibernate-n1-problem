package com.furkankayam.repository;

import com.furkankayam.model.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    @EntityGraph(attributePaths = {"comments"})
    List<Post> findAll();

    @Query("SELECT p FROM Post p JOIN FETCH p.comments")
    List<Post> findAllJoinFetch();

}
