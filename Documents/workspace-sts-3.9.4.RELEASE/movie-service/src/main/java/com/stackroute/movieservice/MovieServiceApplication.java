package com.stackroute.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.stackroute.movieservice.repository")
public class MovieServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
}
