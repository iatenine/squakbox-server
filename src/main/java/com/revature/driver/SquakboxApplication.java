package com.revature.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.revature")
public class SquakboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquakboxApplication.class, args);
	}

}
