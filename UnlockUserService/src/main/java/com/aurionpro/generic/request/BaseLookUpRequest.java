/*
 * 
 */
package com.aurionpro.generic.request;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseLookUpRequest.
 */
public class BaseLookUpRequest extends BaseRequest {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8366928876230742071L;
	
	/** The filters. */
	private List<Filter> filters;

	/**
	 * Gets the filters.
	 *
	 * @return the filters
	 */
	public List<Filter> getFilters() {
		return filters;
	}

	/**
	 * Sets the filters.
	 *
	 * @param filters the new filters
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

}
