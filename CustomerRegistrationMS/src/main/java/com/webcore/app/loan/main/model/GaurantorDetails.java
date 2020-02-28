package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GaurantorDetails {
	@Id
	private int gId;
	private String gname;
	private String gMobile;
	private String gEmailId;
	private String gGender;
	private String gDob;
	
	private String gAge;
	private String gProfession;
	private String gPolicStation;
	private String gResidenceType;
	private String gMaritalStatus;
	private String dateTime;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetail previousLoanDetail;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;
	
	
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getgMobile() {
		return gMobile;
	}
	public void setgMobile(String gMobile) {
		this.gMobile = gMobile;
	}
	public String getgEmailId() {
		return gEmailId;
	}
	public void setgEmailId(String gEmailId) {
		this.gEmailId = gEmailId;
	}
	public String getgGender() {
		return gGender;
	}
	public void setgGender(String gGender) {
		this.gGender = gGender;
	}
	public String getgDob() {
		return gDob;
	}
	public void setgDob(String gDob) {
		this.gDob = gDob;
	}
	public String getgAge() {
		return gAge;
	}
	public void setgAge(String gAge) {
		this.gAge = gAge;
	}
	public String getgProfession() {
		return gProfession;
	}
	public void setgProfession(String gProfession) {
		this.gProfession = gProfession;
	}
	public String getgPolicStation() {
		return gPolicStation;
	}
	public void setgPolicStation(String gPolicStation) {
		this.gPolicStation = gPolicStation;
	}
	public String getgResidenceType() {
		return gResidenceType;
	}
	public void setgResidenceType(String gResidenceType) {
		this.gResidenceType = gResidenceType;
	}
	public String getgMaritalStatus() {
		return gMaritalStatus;
	}
	public void setgMaritalStatus(String gMaritalStatus) {
		this.gMaritalStatus = gMaritalStatus;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public PreviousLoanDetail getPreviousLoanDetail() {
		return previousLoanDetail;
	}
	public void setPreviousLoanDetail(PreviousLoanDetail previousLoanDetail) {
		this.previousLoanDetail = previousLoanDetail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Documents getDocuments() {
		return documents;
	}
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}
	
	
}
