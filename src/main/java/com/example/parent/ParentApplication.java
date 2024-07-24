package com.example.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentApplication {
	// TODO : Create HibernateUtil class for joined example instead of controller and repository layers
	// TODO : Create a Main Class
	public static void main(String[] args) {
		SpringApplication.run(ParentApplication.class, args);
	}

}
