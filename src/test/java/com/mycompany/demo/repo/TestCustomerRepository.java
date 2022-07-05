package com.mycompany.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mycompany.demo.entities.Customer;

@RunWith(SpringRunner.class)
//@DataJpaTest
@SpringBootTest
public class TestCustomerRepository {
    @Autowired
	CustomerRepository customersRepo;
    
    @Before
	public void before() {
		System.out.println("Before...");
		customersRepo.save(new Customer("Thomas", "van der Veen"));
		customersRepo.save(new Customer("Ruben", "van der Veen"));
		customersRepo.save(new Customer("Ruben", "Achternaam"));
	}
	
	@After
	public void after() {
		System.out.println("After...");
		//customersRepo.deleteAll();	
	}
	
	@Test
	public void testFindByLastName () {
		assertThat(customersRepo.count()).isEqualTo(3);
		List<Customer> customers = customersRepo.findByLastName("van der Veen");
		assertEquals(2, customers.size());
	}
	
//	@Test
//	public void testDeleteOne () {
//		assertThat(customersRepo.count()).isEqualTo(3);
//		List<Customer> customers = customersRepo.findByLastName("Achternaam");
//		assertEquals(1, customers.size());
//		customersRepo.delete(customers.get(0));
//		assertThat(customersRepo.count()).isEqualTo(2);
//	}
}
