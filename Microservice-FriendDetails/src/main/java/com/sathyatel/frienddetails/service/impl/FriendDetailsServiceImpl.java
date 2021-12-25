package com.sathyatel.frienddetails.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathyatel.frienddetails.dto.FriendDetailsDTO;
import com.sathyatel.frienddetails.entity.FriendDetails;
import com.sathyatel.frienddetails.repository.FriendDetailsRepository;
import com.sathyatel.frienddetails.service.IFriendDetailsService;
@Service
public class FriendDetailsServiceImpl implements IFriendDetailsService {

	@Autowired
	FriendDetailsRepository repository;
	@Override
	public String addFriend(FriendDetailsDTO friendDetailsDTO) {
		FriendDetails friendDetails=new FriendDetails();
		BeanUtils.copyProperties(friendDetailsDTO, friendDetails);
		if(friendDetails.equals(null))
		{
			return "sorry Invalid Input provided";
		}
		else {
			repository.save(friendDetails);
			return "Friend Added successfully";
			
		}
		
	}

	@Override
	public List<Long> getFriendNoByPhoneNo(Long phoneNo) {
		
		return null;
	}

}
