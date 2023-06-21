package com.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {



}
