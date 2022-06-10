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
	
	/*
	public Post getPost(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		
		return null;
	}

	public void addPost(Post listElement) {
		posts.add(listElement);
	}

	public void updatePost(Post post, int id) {
		for(int i=0; i<posts.size(); i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.set(i, post);
				return;
			}
		}
	}

	public void deletePost(int id) {
		for(int i=0; i<posts.size(); i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.remove(i);
				return;
			}
		}
	}
*/
	
}
