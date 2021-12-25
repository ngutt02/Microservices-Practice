package com.sathyatel.ui.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterBean {
	@NotNull      
	private Long phoneNo;
	@NotEmpty
	@Size(min=8,max=20)
	private String password;
	@NotEmpty
	private String name;
	@NotEmpty
	private String planId;
	private List<PlanDTO> planDtoList;
	private List<String> plansIdList;
	public List<String> getPlansIdList() {
		return plansIdList;
	}
	public void setPlansIdList(List<String> plansIdList) {
		this.plansIdList = plansIdList;
	}
	public RegisterBean() {
		super();
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public List<PlanDTO> getPlanDtoList() {
		return planDtoList;
	}
	public void setPlanDtoList(List<PlanDTO> planDtoList) {
		this.planDtoList = planDtoList;
	}
	@Override
	public String toString() {
		return "RegisterBean [phoneNo=" + phoneNo + ", password=" + password + ", name=" + name + ", planId=" + planId
				+ ", planDtoList=" + planDtoList + ", plansIdList=" + plansIdList + "]";
	}




}
