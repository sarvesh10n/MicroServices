package com.aurionpro.create.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.create.user"})
public class CreateUserApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(CreateUserApplication.class, args);
	}
}
