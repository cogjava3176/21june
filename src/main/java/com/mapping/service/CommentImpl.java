package com.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.Comment;
import com.mapping.repo.CommentRepo;
@Service
public class CommentImpl implements CommentService {

	@Autowired
	private CommentRepo commentRepository;
	
	@Override
	public void save(Comment comments) {
		commentRepository.save(comments);
	}

	@Override
	public List<Comment> getCommentsByPostId(Long id) {
		return commentRepository.findByPostId(id);
	}

}
