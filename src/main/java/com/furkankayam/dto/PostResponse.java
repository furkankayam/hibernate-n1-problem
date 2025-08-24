package com.furkankayam.dto;

import lombok.Data;

import java.util.List;

@Data
public class PostResponse {
    private String title;
    private List<CommentResponse> comments;
}
