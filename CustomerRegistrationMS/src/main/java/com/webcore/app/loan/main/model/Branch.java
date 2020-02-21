package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
private int branchId;
private String branchName;
private String branchType;
private String ifscCode;
private long micrCode;
private int branchCode;
private long branchContactNo;
private String branchEmailId;
private int status;
@OneToOne(cascade = CascadeType.ALL)
private Address branchAddress;

public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBranchType() {
	return branchType;
}
public void setBranchType(String branchType) {
	this.branchType = branchType;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public long getMicrCode() {
	return micrCode;
}
public void setMicrCode(long micrCode) {
	this.micrCode = micrCode;
}
public int getBranchCode() {
	return branchCode;
}
public void setBranchCode(int branchCode) {
	this.branchCode = branchCode;
}
public long getBranchContactNo() {
	return branchContactNo;
}
public void setBranchContactNo(long branchContactNo) {
	this.branchContactNo = branchContactNo;
}
public String getBranchEmailId() {
	return branchEmailId;
}
public void setBranchEmailId(String branchEmailId) {
	this.branchEmailId = branchEmailId;
}

	
	  public Address getBranchAddress()
	  { 
		  return branchAddress;
	  }
	  public void setBranchAddress(Address branchAddress) 
	  { 
		  this.branchAddress = branchAddress;
	  }
	 
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}


}
