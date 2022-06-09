package com.yanik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappWithSpringBootApplication.class, args);
		// 1.Above line laods the default first
		// 2.Starts the boot app
		// 3.Performs a class path scan
		// 4.Starts teh local tomcat
	}

}
