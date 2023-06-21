package com.mapping.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.Comment;
@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
	
	List<Comment> findByPostId(Long postId);

}
