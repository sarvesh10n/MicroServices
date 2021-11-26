package com.aurionpro.pay.bill.service;

import org.springframework.stereotype.Service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.pay.bill.requestobjects.PayBill;

@Service
public class PayBillServiceImpl implements PayBillService{

	public BaseResponseMap payBill(Ticket ticket,PayBill payBill) throws BaseException{

		BaseResponseMap response = null;
		try {
			response = new BaseResponseMap();
			response.getResponseStatus().setMessage("Bill Payment Successfull");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
}
