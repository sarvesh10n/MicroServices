package com.aurionpro.pay.bill.controller;

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
import com.aurionpro.pay.bill.requestobjects.PayBill;
import com.aurionpro.pay.bill.service.PayBillService;

@RestController
@RequestMapping("/billPaymentService")
public class PayBillController {
	
	protected final String CREATE = "/private/create";
	private final String SECURITYID = "security";
	
	@Autowired
	private PayBillService payBillService;
	
	
	@PostMapping(CREATE)
	public BaseResponseMap create(@RequestBody PayBill payBill,
			HttpServletRequest request) throws Exception {
		
		Ticket ticket= getTicket(request);
		BaseResponseMap response=payBillService.payBill(ticket,payBill);
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
