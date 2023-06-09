package com.example.shopmodulethree;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer registerCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	public List<Customer> getCustomer(){
		return (List<Customer>) customerRepository.findAll();
	
		
	}
	
	public void deleteCustomer(Integer customer_id) {
		
		customerRepository.deleteById(customer_id);
	}
	
	public Customer updateCustomer(Customer customer) {
		Integer customer_id = customer.getCustomer_id();
		Customer cust = customerRepository.findById(customer_id).get();
		cust.setCustomername(customer.getCustomername());
		cust.setCustomer_email(customer.getCustomer_email());
		cust.setPhone_no(customer.getPhone_no());
		
		return customerRepository.save(cust);
		
	}
}
