package com.bankapp.web.controller.beans;

public class AccountReq {
	private Double accountBalance;
	private String type;
	private Boolean blocked;
	private String name;
	private String phone;
	private String email;
	private String address;
	public AccountReq() {
		// TODO Auto-generated constructor stub
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getBlocked() {
		return blocked;
	}
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AccountReq(Double accountBalance, String type, Boolean blocked, String name, String phone, String email,
			String address) {
		super();
		this.accountBalance = accountBalance;
		this.type = type;
		this.blocked = blocked;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
}
