package com.sathyatel.frienddetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathyatel.frienddetails.dto.FriendDetailsDTO;
import com.sathyatel.frienddetails.service.IFriendDetailsService;

@RestController
public class FriendDetailsRestController {
	@Autowired
	private IFriendDetailsService service;
	
	@PostMapping(value="/addFriend")
	public String addFriend(@RequestBody FriendDetailsDTO friendDetailsDTO)
	{
		String msg=service.addFriend(friendDetailsDTO);
		return msg;
		
	}

}
