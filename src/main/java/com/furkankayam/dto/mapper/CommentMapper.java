package com.furkankayam.dto.mapper;

import com.furkankayam.dto.CommentResponse;
import com.furkankayam.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public abstract class CommentMapper {

    public abstract CommentResponse toCommentResponse(Comment comment);

    public abstract List<CommentResponse> toCommentResponseList(List<Comment> comments);

}
