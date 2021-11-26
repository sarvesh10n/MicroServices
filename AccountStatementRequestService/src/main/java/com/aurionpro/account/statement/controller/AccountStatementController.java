package com.aurionpro.account.statement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.account.statement.requestobjects.AccountStatementRequest;
import com.aurionpro.account.statement.requestobjects.AccountStatementResponse;
import com.aurionpro.account.statement.service.AccountStatementService;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;

@RestController
@RequestMapping("/accountStatementService")
public class AccountStatementController {
	
	protected final String CREATE = "/private/accountStatement";
	private final String SECURITYID = "security";
	
	@Autowired
	private AccountStatementService accountStatementService;
	
	
	@PostMapping(CREATE)
	public AccountStatementResponse create(@RequestBody AccountStatementRequest statement,
			HttpServletRequest request) throws Exception {
		
		Ticket ticket= getTicket(request);
		AccountStatementResponse response=accountStatementService.generateStatement(ticket,statement);
		return response;
	}
	
	
	
	public Ticket getTicket(HttpServletRequest request) throws Exception{
		List<String> errors=new ArrayList<String>();
		String security = request.getHeader(SECURITYID);
		Ticket ticket = new Ticket();//(Ticket) FieldNameUtil.getObjectFromCache("Micro-"+security, ApplicationCacheContstants.TICKET);
		
		if(ticket==null)
		{
			errors.add("Ticket Not Found");
//			throw new ValidationException(errors);
		}
		
		return ticket;
	}
}
