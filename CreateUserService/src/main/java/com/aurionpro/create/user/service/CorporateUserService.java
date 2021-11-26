package com.aurionpro.create.user.service;


import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.generic.requestobject.User;

public interface CorporateUserService {

	public BaseResponseMap createUser(Ticket ticket,User user)  throws BaseException;
}
