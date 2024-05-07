package com.customer.restapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.customer.restapi.entity.Customer;
import com.customer.restapi.respository.CustomerRespository;
import com.customer.restapi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
    private CustomerRespository customerRespository;
    
    
	public CustomerServiceImpl(CustomerRespository customerRespository) {
		super();
		this.customerRespository = customerRespository;
	}


	@Override
	public Customer createCustomer(Customer customer) {
		
		return customerRespository.save(customer);
	}


	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> customer = customerRespository.findById(id);
		return customer.get();
		
	}


	@Override
	public List<Customer> getAllCustomers() {
	
		return customerRespository.findAll();
	}


	@Override
	public Customer updateCustomer(Customer customer) {
	
		// check the user
	 Customer existing_cust =  customerRespository.findById(customer.getId()).get();
	 
	 // update the customer
	 existing_cust.setFirstname(customer.getFirstname());
	 existing_cust.setLastname(customer.getLastname());;
	 existing_cust.setEmail(customer.getEmail());;
	 existing_cust.setCompany(customer.getCompany());
	 
	 
	 Customer updatedCustomer = customerRespository.save(existing_cust);
		
		return updatedCustomer;
	}


	
	
}
