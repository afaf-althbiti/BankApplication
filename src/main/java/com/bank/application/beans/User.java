package com.bank.application.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.DateTime;

enum userType{
	
	EMPLOYEE, CUSTOMER
}

@Entity
public class User {

	@Id
	private String userName;
	private String password;
	private String fName;
	private String lName;
	private String mName;
	private userType type;

	private DateTime dob;
	
	private String phone;
	private Address address;
	
	//Setters and getters
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public DateTime getDob() {
		return dob;
	}
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public userType getType() {
		return type;
	}
	public void setType(userType type) {
		this.type = type;
	}
	
	
}
