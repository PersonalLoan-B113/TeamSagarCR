package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoanDetail 
{
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int previusRemainingEmi;
	private Double remainingAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails prvbankdetail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPreviusRemainingEmi() {
		return previusRemainingEmi;
	}
	public void setPreviusRemainingEmi(int previusRemainingEmi) {
		this.previusRemainingEmi = previusRemainingEmi;
	}
	public Double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public BankDetails getPrvbankdetail() {
		return prvbankdetail;
	}
	public void setPrvbankdetail(BankDetails prvbankdetail) {
		this.prvbankdetail = prvbankdetail;
	}
	
	
	
}
