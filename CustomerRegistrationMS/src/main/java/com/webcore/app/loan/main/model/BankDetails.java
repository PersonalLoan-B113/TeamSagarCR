package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BankDetails {

	@Id
	private int bankId;
	private String bankAccountNo;
	private int status;
	private int custId;
	
	@OneToMany(cascade=CascadeType.ALL )
	
	private List<Branch> bankBranch;
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	
	public List<Branch> getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(List<Branch> bankBranch) {
		this.bankBranch = bankBranch;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	
}
