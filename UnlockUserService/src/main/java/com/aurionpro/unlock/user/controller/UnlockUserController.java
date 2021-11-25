package com.aurionpro.unlock.user.controller;

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
import com.aurionpro.unlock.user.service.CorporateUserService;

@RestController
@RequestMapping("/corporateUser")
public class UnlockUserController {
	
	protected final String UNLOCKCORPUSER = "/private/unlockCorpUser";
	private final String SECURITYID = "security";
	
	@Autowired
	private CorporateUserService corporateUserService;
	
	
	@PostMapping(UNLOCKCORPUSER)
	public BaseResponseMap unlockUser(@RequestBody BaseRequestMap baseRequestMap,
			HttpServletRequest request) throws Exception {
		
		Ticket ticket= getTicket(request);
		BaseResponseMap response=corporateUserService.unlockCorpUser(ticket,baseRequestMap);
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
