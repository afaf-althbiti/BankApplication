package com.bank.application.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

enum Type{
	TIER1, TIER2, ADMIN
}

enum Branch{
	ALABAMA, 
	ALASKA, 
	ARIZONA, 
	ARKANSAS, 
	CALIFORNIA, 
	COLORADO, 
	CONNECTICUT, 
	DELAWARE, 
	FLORIDA, 
	GEORGIA, 
	HAWAII, 
	IDAHO,
	ILLINOIS, INDIANA, 
	IOWA, 
	KANSAS, 
	KENTUCKY, 
	LOUISIANA, 
	MAINE, 
	MARYLAND, 
	MASSACHUSETTS, 
	MICHIGAN, 
	MINNESOTA, 
	MISSISSIPPI, 
	MISSOURI, 
	MONTANA,
	NEBRASKA, 
	NEVADA, 
	NEWHAMPSHIRE, 
	NEWJERSEY, 
	NEWMEXICO, 
	NEWYORK, 
	NORTHCAROLINA, 
	NORTHDAKOTA, 
	OHIO,
	OKLAHOMA, 
	OREGON,
	PENNSYLVANIA,
	RHODEISLAND,
	SOUTHCAROLINA, 
	SOUTHDAKOTA, 
	TENNESSEE, 
	TEXAS, 
	UTAH, 
	VERMONT, 
	VIRGINIA, 
	WASHINGTON, 
	WESTVIRGINIA, 
	WISCONSIN, 
	WYOMING
}

@Entity
public class Employee extends User{

	@Id
	private int employeeID;
	private Type employeeType;
	private Branch branch;
	
	
	//setters and getters
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public Type getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(Type employeeType) {
		this.employeeType = employeeType;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
