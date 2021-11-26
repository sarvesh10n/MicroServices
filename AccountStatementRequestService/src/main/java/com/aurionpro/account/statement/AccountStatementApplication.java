package com.aurionpro.account.statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.account.statement"})
public class AccountStatementApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(AccountStatementApplication.class, args);
	}
}
