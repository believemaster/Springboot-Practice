package com.yanik.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yanik.entity.Post;
import com.yanik.services.PostsService;

@RestController
public class PostsController {

//	By default spring boot convert list into JSON response on localhost:8080/posts
	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return new PostsService().getPosts();
	}
		
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {
		return new PostsService().getPost(id);
	}
}
