package com.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.Post;
import com.mapping.repo.PostRepo;

@Service
public class PostImpl implements PostService {

	@Autowired
	private PostRepo postRepository;
	
	@Override
	public void save(Post post) {
		postRepository.save(post);
	}

	@Override
	public List<Post> get() {
		return postRepository.findAll();
	}

	@Override
	public Post get(Long id) {
		return postRepository.findById(id).isPresent() ? postRepository.findById(id).get() : null;
	}

}
