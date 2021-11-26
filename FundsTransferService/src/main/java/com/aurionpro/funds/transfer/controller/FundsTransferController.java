package com.aurionpro.funds.transfer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.funds.transfer.service.FundsTransferService;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;

@RestController
@RequestMapping("/fundsTransferService")
public class FundsTransferController {
	
	protected final String TRANSFER = "/private/transfer";
	private final String SECURITYID = "security";
	
	@Autowired
	private FundsTransferService fundsTransferService;
	
	
	@PostMapping(TRANSFER)
	public BaseResponseMap create(@RequestBody BaseRequestMap baseRequestMap,
			HttpServletRequest request) throws Exception {
		
		Ticket ticket= getTicket(request);
		BaseResponseMap response=fundsTransferService.fundsTransfer(ticket,baseRequestMap);
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
