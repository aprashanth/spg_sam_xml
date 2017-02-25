package com.spg.repository;

import java.util.ArrayList;
import java.util.List;

import com.spg.model.Customer;

public class HibernateCutomerRepositoryImpl implements CustomerRepository {
	
	
	private String dbUserName;

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	/* (non-Javadoc)
	 * @see com.spg.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUserName);
		Customer customer  = new Customer();
		
		List<Customer> customers = new ArrayList();
		
		customer.setFirstName("John");
		customer.setLastName("Doe");
		
		customers.add(customer);
		
		return customers;
		
		
	}
	
}
