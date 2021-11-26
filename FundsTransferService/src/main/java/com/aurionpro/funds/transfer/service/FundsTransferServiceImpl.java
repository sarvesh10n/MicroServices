package com.aurionpro.funds.transfer.service;

import org.springframework.stereotype.Service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;

@Service
public class FundsTransferServiceImpl implements FundsTransferService{

	public BaseResponseMap fundsTransfer(Ticket ticket,BaseRequestMap requestMap) throws BaseException{

		BaseResponseMap response = null;
		try {
			response = new BaseResponseMap();
			response.getResponseStatus().setMessage("Funds Transfered Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}
	
	
	
}
