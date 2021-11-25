package com.aurionpro.unlock.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.unlock.user"})
public class UnlockUserApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(UnlockUserApplication.class, args);
	}
}
