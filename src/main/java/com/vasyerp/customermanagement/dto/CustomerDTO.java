package com.vasyerp.customermanagement.dto;

import com.vasyerp.customermanagement.model.Customer;

public class CustomerDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	
	public CustomerDTO() {
		
	}
	public CustomerDTO(Customer customer) {
		this.id = customer.getId();
		this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.mobile = customer.getMobile();
        this.email = customer.getEmail();
        		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
