package com.aurionpro.txn.enquiry.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.txn.enquiry.requestobjects.InstrumentQuery;
import com.aurionpro.txn.enquiry.service.TxnEnquiryService;

@RestController
@RequestMapping("/txnInquiryService")
public class TxnEnquiryController {
	
	protected final String ENQUIRY = "/private/transactionEnquiry";
	private final String SECURITYID = "security";
	
	@Autowired
	private TxnEnquiryService txnEnquiryService;
	
	
	@PostMapping(ENQUIRY)
	public InstrumentQuery unlockUser(@RequestBody BaseRequestMap baseRequestMap,
			HttpServletRequest request) throws Exception {
		
		Ticket ticket= getTicket(request);
		InstrumentQuery response=txnEnquiryService.enquiry(ticket,baseRequestMap);
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
