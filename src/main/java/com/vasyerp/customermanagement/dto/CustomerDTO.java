package com.vasyerp.customermanagement.dto;

import com.vasyerp.customermanagement.model.CustAddress;
import com.vasyerp.customermanagement.model.Customer;

public class CustomerDTO {
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String address;
	
	
	public CustomerDTO() {
		
	}
	
	public CustomerDTO(int id, String firstName, String lastName, String email, String mobile, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
}
