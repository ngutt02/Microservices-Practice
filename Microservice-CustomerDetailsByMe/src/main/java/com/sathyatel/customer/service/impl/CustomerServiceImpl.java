package com.sathyatel.customer.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathyatel.customer.entity.Customer;
import com.sathyatel.customer.repository.CustomerRepository;
import com.sathyatel.customer.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {


	@Autowired
	CustomerRepository repository;

	public String saveNewCustomer(Customer customer) {
		boolean flag=repository.existsById(customer.getPhoneNo());
		if(flag==false)
		{
			repository.save(customer);
			return "Customer added successfully";
		}
		else {
			return "Customer with these No Already exist";
		}
	}

	@Override
	public Integer loginCustomer(Long phoneNo,String password) {
		Integer count=0;
		count=repository.verifyCustomer(phoneNo,password);
		return count;

	}

	@Override
	public Customer getCustomerDetails(Long phoneNo) {

		Optional<Customer> opt=repository.findById(phoneNo);
		Customer customer=opt.get();
		return customer;

	}



}
