package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int bid;
		private String bankAccountNo;
		private String bankAccountHolderName;
		@OneToOne(cascade = CascadeType.ALL)
		private Branch bankBranch;
		
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}
	public Branch getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(Branch bankBranch) {
		this.bankBranch = bankBranch;
	}

}
