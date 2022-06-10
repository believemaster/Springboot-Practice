package com.yanik.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanik.entity.Post;
import com.yanik.services.PostsService;

@RestController
public class PostsController {

	@Autowired
	private PostsService service;
	
	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return service.getPosts();
	}
		
	/*
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable int id) {
		return new PostsService().getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/posts")
	public void addPost(@RequestBody Post listElement) {
		new PostsService().addPost(listElement);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/posts/{id}")
	public void updatePost(@RequestBody Post post,@PathVariable int id) {
		new PostsService().updatePost(post, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/posts/{id}")
	public void deletePost(@PathVariable int id) {
		new PostsService().deletePost(id);
	}
	*/
}
