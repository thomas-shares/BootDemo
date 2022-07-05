package com.mycompany.demo.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestCustomer {
	
	@Test
	public void testFullName () {
		Customer customer = new Customer("Thomas", "van der Veen");
		
		String fullName =  customer.getFullName();
		assertEquals("Thomas van der Veen", fullName);
	}

	@Test
	public void testUpdateTime () throws InterruptedException {
		Customer customer = new Customer("Thomas", "van der Veen");
		
		Date firstTime =  customer.getLastUpdated();
		
		Thread.sleep(10);
		customer.setLastName("New");
		
		Date secondTime = customer.getLastUpdated();
		
		assertNotEquals(firstTime, secondTime);
		
		assertEquals("Thomas New", customer.getFullName());
	}
}
