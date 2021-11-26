package com.aurionpro.account.statement.service;

import com.aurionpro.account.statement.requestobjects.AccountStatementRequest;
import com.aurionpro.account.statement.requestobjects.AccountStatementResponse;
import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.Ticket;

public interface AccountStatementService {

	public AccountStatementResponse generateStatement(Ticket ticket,AccountStatementRequest statement)  throws BaseException;
}
