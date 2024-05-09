package com.customer.rest_api.bean;

public class Student 
{
  private int id;
  private String firstname;
public Student(int id, String firstname) {
	super();
	this.id = id;
	this.firstname = firstname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
  
  


}
