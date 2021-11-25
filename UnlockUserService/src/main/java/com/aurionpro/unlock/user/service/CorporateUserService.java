package com.aurionpro.unlock.user.service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;

public interface CorporateUserService {

	public BaseResponseMap unlockCorpUser(Ticket ticket,BaseRequestMap requestMap)  throws BaseException;
}
