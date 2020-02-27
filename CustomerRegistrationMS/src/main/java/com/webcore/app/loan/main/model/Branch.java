package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
	@Id
	
	private int branchId;
	private String branchName;
	private String branchType;
	private String ifsccode;
	private String micrcode;
	private String branchcode;
	private String branchcontactNo;
	private String emailId;
	
	@ManyToOne(cascade =CascadeType.ALL )
	
	private BankDetails bankd;

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

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getMicrcode() {
		return micrcode;
	}

	public void setMicrcode(String micrcode) {
		this.micrcode = micrcode;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getBranchcontactNo() {
		return branchcontactNo;
	}

	public void setBranchcontactNo(String branchcontactNo) {
		this.branchcontactNo = branchcontactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
