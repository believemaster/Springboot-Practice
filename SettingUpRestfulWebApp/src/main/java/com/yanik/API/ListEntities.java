package com.yanik.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEntities {
	
	@RequestMapping("blogs")
	public String listBlogs() {
		return "listBlogs";
	}
	
}
