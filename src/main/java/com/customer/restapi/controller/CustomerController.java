package com.customer.restapi.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.restapi.entity.Customer;
import com.customer.restapi.response.CustomerResponse;
import com.customer.restapi.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController 
{
	private CustomerService customerService;
    
	@Autowired
	private CustomerResponse customerResponse;
	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
/*	@PostMapping("saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
	{  
		Customer saveCustomer = customerService.createCustomer(customer);
		//return new ResponseEntity<Customer>(saveCustomer, HttpStatus.OK); 
		
		Random random = new Random();
		int cust_id = random.nextInt(Integer.MAX_VALUE);
	    customerResponse.setId(cust_id);
		return new ResponseEntity<Customer>(saveCustomer, HttpStatus.OK);
		
	} */
	@PostMapping("saveCustomer")
	public  ResponseEntity<CustomerResponse> saveCustomer(@RequestBody Customer customer)
	{
		
	/*    Random random = new Random();
		int userid = random.nextInt(Integer.MAX_VALUE);
		customerResponse.setId(userid);
		return  ResponseEntity.ok(customerResponse); */
		
		Customer cust=customerService.createCustomer(customer);
		customerResponse.setId(cust.getId());
		return  ResponseEntity.ok(customerResponse);
	}
	

	@GetMapping("getById")
	public ResponseEntity<Customer> getCustomerById(@RequestParam Long id)
	{
		Customer customer= customerService.getCustomerById(id);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
	}
	
	
   //get all customers
	@GetMapping
	 public List<Customer> getAllCustomers()
	 {
		return customerService.getAllCustomers();
		 
	 }
	
	
	@PutMapping("{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,
			@PathVariable("id") Long cust_id)
	{
		customer.setId(cust_id);
		Customer updateCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<Customer>(updateCustomer, HttpStatus.OK);
		
		
	}
	 
}
