package com.yanik.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yanik.entity.Post;

@Service
public class PostsService {
	
	
	List<Post> posts = new ArrayList<>();

	public PostsService() {
		posts.add(new Post(1, "Datatype", "Sample Txt"));
		posts.add(new Post(2, "Classes", "Sample Txt"));
		posts.add(new Post(3, "Object", "Sample Txt"));
		posts.add(new Post(4, "OOPS concepts", "Sample Txt"));
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	
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

	
}
