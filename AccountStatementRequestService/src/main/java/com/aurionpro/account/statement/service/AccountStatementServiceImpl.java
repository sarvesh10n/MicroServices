package com.aurionpro.account.statement.service;

import org.springframework.stereotype.Service;

import com.aurionpro.account.statement.requestobjects.AccountStatementRequest;
import com.aurionpro.account.statement.requestobjects.AccountStatementResponse;
import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AccountStatementServiceImpl implements AccountStatementService{

	public AccountStatementResponse generateStatement(Ticket ticket,AccountStatementRequest request) throws BaseException{

		AccountStatementResponse response = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			response = objectMapper.readValue(ClassLoader.getSystemResource("Account_Statement_"+request.getAccountNo()+".json"),
					AccountStatementResponse.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
}
