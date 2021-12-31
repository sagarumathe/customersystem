package com.vasyerp.customermanagement.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_name")
public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name = "firstname")
		private String firstName;
		
		@Column(name = "lastname")
		private String lastName;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "mobile")
		private String mobile;
		
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "addressId")
		private CustAddress address;		
		
		
		public CustAddress getAddress() {
			return address;
		}
		public void setAddress(CustAddress address) {
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
		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", mobile=" + mobile +  " "+ address.getAddress() +" ]";
		}
		
		
		
}
