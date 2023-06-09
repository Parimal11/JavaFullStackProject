package com.example.shopmodulethree;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
		// RESTful API method for Create operation
		@PostMapping("/customer")
		public Customer registerCustomer(@RequestBody Customer customer)
		{
			return customerService.registerCustomer(customer);
		}
		
		
		@GetMapping("/getCustomer")
		public List<Customer> getCustomer(){
			return customerService.getCustomer();
			
			
		}
		
		@DeleteMapping("/deleteCustomer")
		public void deleteCustomer(@RequestParam Integer customer_id) {
			customerService.deleteCustomer(customer_id);
		}
		
		@PutMapping("/updateCustomer")
		public Customer updateCustomer(@RequestBody Customer customer) {
			return customerService.updateCustomer(customer);
		}

}
