package com.mapping.service;

import java.util.List;

import com.mapping.model.Comment;

public interface CommentService {

	void save(Comment comments);

	List<Comment> getCommentsByPostId(Long id);

}
