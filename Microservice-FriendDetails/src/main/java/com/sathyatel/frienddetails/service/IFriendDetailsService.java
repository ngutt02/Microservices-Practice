package com.sathyatel.frienddetails.service;

import java.util.List;

import com.sathyatel.frienddetails.dto.FriendDetailsDTO;

public interface IFriendDetailsService {

	public String addFriend(FriendDetailsDTO friendDetailsDTO);
	public List<Long> getFriendNoByPhoneNo(Long phoneNo);

}
