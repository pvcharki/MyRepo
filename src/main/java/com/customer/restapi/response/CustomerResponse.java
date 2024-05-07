package com.customer.restapi.response;

import org.springframework.stereotype.Component;

@Component
public class CustomerResponse {

	private long id;

	public long getId() {
		return id;
	}

	
	public CustomerResponse() {
		super();
	}


	public void setId(long id) {
		this.id = id;
	}

	public CustomerResponse(long id) {
		super();
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "CustomerResponse [id=" + id + "]";
	}

	
	
	
	
}
