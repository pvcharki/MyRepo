package com.customer.rest_api.controller;

import java.util.Random;
import java.util.UUID;

import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rest_api.bean.Customer;
import com.customer.rest_api.response.CustomerResponse;

@RestController
@RequestMapping("customer")  // base url
public class CustomerController {

	//http://localhost:8081/customer/getById?id=123
	
	@GetMapping("getById")
	public Customer getCustomerById(@RequestParam int id)
	{
	  return new Customer("John", "Doe", id, "jhon.doe@cts.com", "cts"); 
				
	}
	
	//http://localhost:8080/customer/saveCustomer
	
	@PostMapping("saveCustomer")
	public  ResponseEntity<CustomerResponse> saveCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer.getFirstname());
		System.out.println(customer.getLastname());
		System.out.println(customer.getId());
		System.out.println(customer.getEmail());
		System.out.println(customer.getCompany()); 
		
	//	System.out.println("Customer:"+customer);
		
		
		CustomerResponse resp = new CustomerResponse();
	//	resp.setId(UUID.randomUUID().toString());
		Random random = new Random();
		int userid = random.nextInt(Integer.MAX_VALUE);
		resp.setId(userid);
		return ResponseEntity.ok(resp);
	}
	
	
	
}
