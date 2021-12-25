package com.sathyatel.ui.model;

public class Friend {

	private Long phoneNo;
	private Long friendNo;
	public Friend() {
		super();
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getFriendNo() {
		return friendNo;
	}
	public void setFriendNo(Long friendNo) {
		this.friendNo = friendNo;
	}
	@Override
	public String toString() {
		return "Friend [phoneNo=" + phoneNo + ", friendNo=" + friendNo + "]";
	}



}
