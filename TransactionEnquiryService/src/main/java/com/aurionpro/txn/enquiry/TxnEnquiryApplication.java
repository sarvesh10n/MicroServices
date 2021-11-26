package com.aurionpro.txn.enquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages={
"com.aurionpro.txn.enquiry"})
public class TxnEnquiryApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(TxnEnquiryApplication.class, args);
	}
}
