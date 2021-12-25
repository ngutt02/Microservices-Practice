package com.sathyatel.frienddetails.dto;

public class FriendDetailsDTO {

	private Integer id;
	private Long phoneNo;
	private Long friendNo;
	public FriendDetailsDTO() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		return "FriendDetailsDTO [id=" + id + ", phoneNo=" + phoneNo + ", friendNo=" + friendNo + "]";
	}



}
