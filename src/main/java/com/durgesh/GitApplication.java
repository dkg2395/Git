package com.durgesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {
	int a=10;
	int varsha=10;

	public static void main(String[] args) {
		int b=10;
		int c =20;
		SpringApplication.run(GitApplication.class, args);
	}

}
