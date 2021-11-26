package com.aurionpro.pay.bill.service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.pay.bill.requestobjects.PayBill;

public interface PayBillService {

	public BaseResponseMap payBill(Ticket ticket,PayBill payBill)  throws BaseException;
}
