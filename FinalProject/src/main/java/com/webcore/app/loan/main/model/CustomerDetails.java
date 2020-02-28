package com.webcore.app.loan.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String customerMobileNo;
	private String customerEmailId;
	private String customerGender;
	private String customerDob;
	
	private int customerAge;
	private String customerQualification;
	private String policeStation;
	private Double incomeDetails;
	private String occupationType;
	private int loanNo;
	private String maritalStatus;
	private int statusCode; 
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDetails customerPersonalDetails;
	
	
	
	public PersonalDetails getCustomerPersonalDetails() {
		return customerPersonalDetails;
	}
	public void setCustomerPersonalDetails(PersonalDetails customerPersonalDetails) {
		this.customerPersonalDetails = customerPersonalDetails;
	} 
	private int leadId;
	@OneToOne(cascade = CascadeType.ALL) 
	private Address customerAddress; 
	      
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
   
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	@OneToOne(cascade = CascadeType.ALL) 
	private PreviousLoanDetails previousLoanDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	
	public int getCustomerId() {
		return customerId; 
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerQualification() {
		return customerQualification;
	}
	public void setCustomerQualification(String customerQualification) {
		this.customerQualification = customerQualification;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	
	/*
	 * public List<Address> getCurrentAddress() { return currentAddress; } public
	 * void setCurrentAddress(List<Address> currentAddress) { this.currentAddress =
	 * currentAddress; } public List<Address> getParamanatAddress() { return
	 * paramanatAddress; } public void setParamanatAddress(List<Address>
	 * paramanatAddress) { this.paramanatAddress = paramanatAddress; }
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	} 
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public String getOccupationType() {
		return occupationType;
	}
	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}
	public Double getIncomeDetails() {
		return incomeDetails;
	}
	public void setIncomeDetails(Double incomeDetails) {
		this.incomeDetails = incomeDetails;
	}
	public PreviousLoanDetails getPreviousLoanDetails() {
		return previousLoanDetails;
	}
	public void setPreviousLoanDetails(PreviousLoanDetails previousLoanDetails) {
		this.previousLoanDetails = previousLoanDetails;
	}
	public GuarantorDetails getGuarantorDetails() {
		return guarantorDetails;
	}
	public void setGuarantorDetails(GuarantorDetails guarantorDetails) {
		this.guarantorDetails = guarantorDetails;
	}
	
	
	
}
