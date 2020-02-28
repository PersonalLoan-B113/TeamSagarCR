package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="lead")
public class Lead 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leadId;
	@OneToOne(cascade=CascadeType.MERGE)
	private Enquiry enquiry;
	private String customerAdharcard;
	private String customerPancard;
	private long custAdhaarNo;
	private long  custPanCardNo;
	private String date;
	private int statusCode;
	private String lesadDateAndTime;
	 
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public Enquiry getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}
	public String getCustomerAdharcard() {
		return customerAdharcard;
	}
	public void setCustomerAdharcard(String customerAdharcard) {
		this.customerAdharcard = customerAdharcard;
	}
	public String getCustomerPancard() {
		return customerPancard;
	}
	public void setCustomerPancard(String customerPancard) {
		this.customerPancard = customerPancard;
	}
	public long getCustAdhaarNo() {
		return custAdhaarNo;
	}
	public void setCustAdhaarNo(long custAdhaarNo) {
		this.custAdhaarNo = custAdhaarNo;
	}
	public long getCustPanCardNo() {
		return custPanCardNo;
	}
	public void setCustPanCardNo(long custPanCardNo) {
		this.custPanCardNo = custPanCardNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getLesadDateAndTime() {
		return lesadDateAndTime;
	}
	public void setLesadDateAndTime(String lesadDateAndTime) {
		this.lesadDateAndTime = lesadDateAndTime;
	}

}
