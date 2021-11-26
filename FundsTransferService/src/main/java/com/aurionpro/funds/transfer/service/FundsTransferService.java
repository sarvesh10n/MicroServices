package com.aurionpro.funds.transfer.service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;

public interface FundsTransferService {

	public BaseResponseMap fundsTransfer(Ticket ticket,BaseRequestMap requestMap)  throws BaseException;
}
