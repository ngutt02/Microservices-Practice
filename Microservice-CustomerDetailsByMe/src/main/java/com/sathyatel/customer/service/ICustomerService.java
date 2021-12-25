package com.sathyatel.customer.service;

import com.sathyatel.customer.entity.Customer;

public interface ICustomerService {

	String saveNewCustomer(Customer customer);
	
	Integer loginCustomer(Long phoneNo,String password);

	Customer getCustomerDetails(Long phoneNo);
	
}
