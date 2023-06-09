package com.example.shopmodulethree;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_id;
	private String customername;
	private String customer_email;
	private Integer phone_no;
	
	public Customer(Integer customer_id, String customername, String customer_email, Integer phone_no) {
		super();
		this.customer_id = customer_id;
		this.customername = customername;
		this.customer_email = customer_email;
		this.phone_no = phone_no;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public Integer getPhone_no() {
		return phone_no;
	}
	
	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customername=" + customername + ", customer_email="
				+ customer_email + ", phone_no=" + phone_no + "]";
	}
	
	
}

