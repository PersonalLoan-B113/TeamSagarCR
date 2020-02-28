package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="enquiry")
public class Enquiry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId;
	private String customerFname;
	private String customerMname;
	private String customerLname;
	private String customerGender;
	private String customerMobNo; 
	private String customerDOB;
	private String customerEmailId;
	private String createdBy;
	private  int  statusCode;  
	private double loanRequired;
	private String address;
	private String dateTime;
	public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getCustomerFname() {
		return customerFname;
	}
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}
	public String getCustomerMname() {
		return customerMname;
	}
	public void setCustomerMname(String customerMname) {
		this.customerMname = customerMname;
	}
	public String getCustomerLname() {
		return customerLname;
	}
	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerMobNo() {
		return customerMobNo;
	}
	public void setCustomerMobNo(String customerMobNo) {
		this.customerMobNo = customerMobNo;
	}
	public String getCustomerDOB() {
		return customerDOB;
	}
	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public double getLoanRequired() {
		return loanRequired;
	}
	public void setLoanRequired(double loanRequired) {
		this.loanRequired = loanRequired;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}   
	
	
	
}