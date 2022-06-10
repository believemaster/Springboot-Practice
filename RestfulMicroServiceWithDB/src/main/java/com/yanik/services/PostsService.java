package com.yanik.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanik.entity.Post;
import com.yanik.repository.PostRepository;

@Service
public class PostsService {
	
	@Autowired
	private PostRepository repo;

	public List<Post> getPosts() {
		List<Post> list = new ArrayList<Post>();
		
		for(Post post: repo.findAll()) {
			list.add(post);
		}
		return list;
	}
	
	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post listElement) {
		repo.save(listElement);
	}

	public void updatePost(Post post) {
		repo.save(post);
	}

	public void deletePost(int id) {
		repo.deleteById(id);
	}
	
}
