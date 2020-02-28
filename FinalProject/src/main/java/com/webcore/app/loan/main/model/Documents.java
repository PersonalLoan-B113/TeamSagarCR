package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Id;

@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentId;
	private	String addressProof;
	private String bankStatement;//form1
	private	String itrFile;
	private	String photo;
	private	String signature;
	private	String thumb;
	private	String bankCheque;
	private	String salarySlip;
	private	String adhaarCard;
	private	String panCard;
	private String previousLoanStatement;
	
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
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
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getBankCheque() {
		return bankCheque;
	}
	public void setBankCheque(String bankCheque) {
		this.bankCheque = bankCheque;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
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
