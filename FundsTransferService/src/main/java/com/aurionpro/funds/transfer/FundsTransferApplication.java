package com.aurionpro.funds.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.funds.transfer"})
public class FundsTransferApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(FundsTransferApplication.class, args);
	}
}
