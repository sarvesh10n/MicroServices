package com.aurionpro.pay.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.pay.bill"})
public class PayBillApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(PayBillApplication.class, args);
	}
}
