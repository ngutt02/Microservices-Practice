package com.sathyatel.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sathyatel.customer.entity.Customer;
import com.sathyatel.customer.model.CustomerDTO;
import com.sathyatel.customer.model.Login;
import com.sathyatel.customer.model.PlanDTO;
import com.sathyatel.customer.repository.CustomerRepository;
import com.sathyatel.customer.service.ICustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private ICustomerService service;
	
	@Autowired
	private CustomerRepository repository;

	@PostMapping("/register")
	public String registerNewCustomer(@RequestBody Customer customer)
	{

		return service.saveNewCustomer(customer);
	}

	@PostMapping(value="/login",produces="application/json")
	public Integer loginCustomer(@RequestBody Login login)
	{
		Integer count=0;
		count=service.loginCustomer(login.getPhoneNo(),login.getPassword());
		return count;
	}

	@GetMapping(value="/profile/{phoneNo}",produces="application/json")
	public ResponseEntity getCustomerProfile(@PathVariable Long phoneNo)
	{
		String POST_URL_1="http://localhost:4444/PlanDetailsApi/plan-199";
		String POST_URL_2 = "http://localhost:5577/FriendApi/friends/9893787401";
                 /* Integer n=repository.verifyCustomerByPhoneNumber(phoneNo);
                  if(n==1)
                  {*/
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<PlanDTO> responseEntity= restTemplate.exchange(POST_URL_1,HttpMethod.GET,null,PlanDTO.class);
		PlanDTO planDTO=responseEntity.getBody();
		System.out.println(planDTO);
		ResponseEntity<List> responseEntity1= restTemplate.exchange(POST_URL_2,HttpMethod.GET,null,List.class);
		List friendNoList=responseEntity1.getBody();
		CustomerDTO customerDTO=new CustomerDTO();
		
		
		customerDTO.setFriends(friendNoList);
		customerDTO.setCurrentPlan(planDTO);
		Customer customer=service.getCustomerDetails(phoneNo);
		customerDTO.setPhoneNo(customer.getPhoneNo());
		customerDTO.setName(customer.getName());
		customerDTO.setPlanId(customer.getPlanId());
		ResponseEntity<CustomerDTO> rs=new ResponseEntity<CustomerDTO>(customerDTO,HttpStatus.OK);
		return rs;
                 /* }
                  else {
                	  ResponseEntity<CustomerDTO> customerDT=new ResponseEntity<CustomerDTO>();
                	  return 
                  }*/
	}


}
