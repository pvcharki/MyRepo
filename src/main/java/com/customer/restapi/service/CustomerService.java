package com.customer.restapi.service;

import java.util.List;

import com.customer.restapi.entity.Customer;

public interface CustomerService 
{
	Customer createCustomer(Customer customer);
	Customer getCustomerById(Long id);
	List<Customer> getAllCustomers();
	Customer updateCustomer(Customer customer);

	
}
