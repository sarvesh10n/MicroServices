package com.aurionpro.txn.enquiry.service;

import com.aurionpro.generic.exceptions.BaseException;
import com.aurionpro.generic.request.BaseRequestMap;
import com.aurionpro.generic.request.BaseResponseMap;
import com.aurionpro.generic.request.Ticket;
import com.aurionpro.txn.enquiry.requestobjects.InstrumentQuery;

public interface TxnEnquiryService {

	public InstrumentQuery enquiry(Ticket ticket,BaseRequestMap requestMap)  throws BaseException;
}
