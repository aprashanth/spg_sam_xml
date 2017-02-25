package com.spg.service;

import java.util.List;

import com.spg.model.Customer;
import com.spg.repository.CustomerRepository;
import com.spg.repository.HibernateCutomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;
	
//	public CustomerServiceImpl() {}
//	
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//			this.customerRepository = customerRepository;
//	}
	
	/* (non-Javadoc)
	 * @see com.spg.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
