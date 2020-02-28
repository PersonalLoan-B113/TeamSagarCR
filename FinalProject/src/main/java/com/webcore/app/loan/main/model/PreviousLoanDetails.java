package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private int remainingEmi;
	private double remainingAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;  
	
	  
	public int getPreviousLoanId() {  
		return previousLoanId;
	}
	public void setPreviousLoanId(int previousLoanId) {
		this.previousLoanId = previousLoanId;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public BankDetails getBankdetails() {
		return bankDetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankDetails = bankdetails;
	}
	public int getRemainingEmi() {
		return remainingEmi;
	}
	public void setRemainingEmi(int remainingEmi) {
		this.remainingEmi = remainingEmi;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}


}
