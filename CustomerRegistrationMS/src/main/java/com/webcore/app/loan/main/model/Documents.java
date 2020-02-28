package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Documents 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dId;
	private String addressProof;
	private String bankStatement;
	private String itrFile;
	private String photo;
	private String sign;
	private String thumb;
	private String blankCheque;
	private String salarySlip;
	private String adharCard;
	private String panCard;
	private String previousLoanStatement;
	
	    
	
	
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	public String getBankStatement() {
		return bankStatement;
	}
	public void setBankStatement(String bankStatement) {
		this.bankStatement = bankStatement;
	}
	public String getItrFile() {
		return itrFile;
	}
	public void setItrFile(String itrFile) {
		this.itrFile = itrFile;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getBlankCheque() {
		return blankCheque;
	}
	public void setBlankCheque(String blankCheque) {
		this.blankCheque = blankCheque;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getPreviousLoanStatement() {
		return previousLoanStatement;
	}
	public void setPreviousLoanStatement(String previousLoanStatement) {
		this.previousLoanStatement = previousLoanStatement;
	}
	
	
	
	
}
