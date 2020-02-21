package com.webcore.app.loan.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
@Entity
public class BusinessDetails {
	@Id
private int businessId;
private String businessType;
private String businessName;
private String businessCertificationNo;
private String businessProof;
private String businessLicenceNo;
public List<Address> getBusinessAddress() {
	return businessAddress;
}
public void setBusinessAddress(List<Address> businessAddress) {
	this.businessAddress = businessAddress;
}
@OneToMany(cascade = CascadeType.ALL)
private List<Address>businessAddress;
public int getBusinessId() {
	return businessId;
}
public void setBusinessId(int businessId) {
	this.businessId = businessId;
}
public String getBusinessType() {
	return businessType;
}
public void setBusinessType(String businessType) {
	this.businessType = businessType;
}
public String getBusinessName() {
	return businessName;
}
public void setBusinessName(String businessName) {
	this.businessName = businessName;
}
public String getBusinessCertificationNo() {
	return businessCertificationNo;
}
public void setBusinessCertificationNo(String businessCertificationNo) {
	this.businessCertificationNo = businessCertificationNo;
}
	 
public String getBusinessProof() {
	return businessProof;
}
public void setBusinessProof(String businessProof) {
	this.businessProof = businessProof;
}
public String getBusinessLicenceNo() {
	return businessLicenceNo;
}
public void setBusinessLicenceNo(String businessLicenceNo) {
	this.businessLicenceNo = businessLicenceNo;
}



}
