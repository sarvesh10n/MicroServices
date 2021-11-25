package com.aurionpro.unlock.user.service;

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
import com.aurionpro.generic.utils.DateUtils;

@Service
public class CorporateUserServiceImpl implements CorporateUserService{

	public BaseResponseMap unlockCorpUser(Ticket ticket,BaseRequestMap requestMap) throws BaseException{

		BaseResponseMap response = null;
		Map<String, Object> filterMap = getFilterMap(requestMap
				.getFilters());
		try {
			response = new BaseResponseMap();
			response.getResponseStatus().setMessage("User Unlocked Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}
	
	
	
	private Map<String, Object> getFilterMap(List<Filter> filters) throws BaseException{

		Map<String, Object> filterMap = new HashMap<String, Object>();
		if (null != filters) {
			for (Filter filter : filters) {

				if (filter.getType().equals(Date.class.getSimpleName())
						&& filter.getValue() != null) {
					filterMap.put(filter.getName(),
							DateUtils.toDate((String) filter.getValue()));

				} else if (filter.getType()
						.equals(String.class.getSimpleName())
						&& filter.getValue() != null
						&& ((String) filter.getValue()).length() >= 0) {

					filterMap.put(filter.getName(), (String) filter.getValue());

				} else if (filter.getType().equals(
						Integer.class.getSimpleName())
						&& filter.getValue() != null) {

					filterMap
							.put(filter.getName(), (Integer) filter.getValue());

				} else {
//					throw new BaseException("Err");
				}
			}

		} else {
			throw new BaseException("No Filters in input");
		}
		return filterMap;

	}
	
}
