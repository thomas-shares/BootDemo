package com.mycompany.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.demo.entities.Customer;
import com.mycompany.demo.repo.CustomerRepository;

@RestController
public class CustomerController {
	 private final CustomerRepository repository;

	  public CustomerController(CustomerRepository repository) {
	    this.repository = repository;
	  }
	  
	  
	  //curl -u user:6ae3a814-d789-4672-80c5-0ecdfb4fa993 -v localhost:8080/customers
	  @GetMapping("/customers")
	  Iterable<Customer> all() {
	    return repository.findAll();
	  }
	  
	  // curl -u user:6ae3a814-d789-4672-80c5-0ecdfb4fa993  -X POST -H "Content-Type: application/json"  -d '{"key1":"value1", "key2":"value2"}'  -v localhost:8080/customers
	  @PostMapping("/customers")
	  Customer newEmployee(@RequestBody Customer newCustomer) {
	    return repository.save(newCustomer);
	  }
}
