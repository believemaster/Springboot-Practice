package com.yanik.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yanik.entity.Post;

@Service
public class PostsService {
	
	
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "Datatype", "Sample Txt"),
					new Post(2, "Classes", "Sample Txt"),
					new Post(3, "Object", "Sample Txt"),
					new Post(4, "OOPS concepts", "Sample Txt")
			));

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

	
}
