package com.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test5Application {

	public static void main(String[] args) {
		int x=100;
		int y=200;
		System.out.println(x);
		SpringApplication.run(Test5Application.class, args);
	}

}
