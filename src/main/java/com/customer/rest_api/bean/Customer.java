package com.customer.rest_api.bean;

public class Customer {

	
	private String firstname;
	private String lastname;
	private int id;
	private String email;
	private String company;
	public Customer(String firstname, String lastname, int id, String email, String company) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.email = email;
		this.company = company;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
