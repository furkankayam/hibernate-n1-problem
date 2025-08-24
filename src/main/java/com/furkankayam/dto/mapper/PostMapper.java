package com.furkankayam.dto.mapper;

import com.furkankayam.dto.PostResponse;
import com.furkankayam.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = CommentMapper.class
)
public abstract class PostMapper {

    public abstract PostResponse toPostResponse(Post post);

    public abstract List<PostResponse> toPostResponseList(List<Post> posts);

}
