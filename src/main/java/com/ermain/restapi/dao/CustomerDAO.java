package com.ermain.restapi.dao;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ermain.restapi.model.Customer;

@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
@Component
public class CustomerDAO{
	
	// Create a dummy database
	private static List customers;
	
	{
		customers = new ArrayList();
		customers.add(new Customer(101, "John", "Doe", "djhon@gmail.com", "121-232-3435"));
		customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
	}
	
	// Return a list of customer
	public List list() {
		return customers;
	}
	
	/*
	 * Return a customer object for a given id from the dummy database. 
	 * If a customer is not found for the given id, return null
	 */

}
