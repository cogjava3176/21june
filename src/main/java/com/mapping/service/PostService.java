package com.mapping.service;

import java.util.List;

import com.mapping.model.Post;

public interface PostService {


	void save(Post post);

	List<Post> get();

	Post get(Long id);
}
