package com.mycompany.demo.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCustomer {
	
	@Test
	public void testFullName () {
		Customer customer = new Customer("Thomas", "van der Veen");
		
		String fullName =  customer.getFullName();
		assertEquals("Thomas van der Veen", fullName);
	}

}
