package com.aurionpro.create.user.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Filter;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.generic.requestobject.User;
import com.aurionpro.generic.utils.DateUtils;

@Service
public class CorporateUserServiceImpl implements CorporateUserService{

	public BaseResponseMap createUser(Ticket ticket,User user) throws BaseException{

		BaseResponseMap response = null;
		try {
			response = new BaseResponseMap();
			response.getResponseStatus().setMessage("User Created Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}
	
	
	
}
