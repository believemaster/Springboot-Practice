package com.yanik.repository;

import org.springframework.data.repository.CrudRepository;

import com.yanik.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{
	
	

}
