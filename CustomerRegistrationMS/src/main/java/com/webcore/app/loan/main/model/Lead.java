package com.webcore.app.loan.main.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Lead 
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leadId;
	private String customerAdharCard;
	private String customerPanCard;
	private long customerAdarNo;
	private String customerPanNo;
	private String date;
	private int statusCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "enqiryId")
	private List<Enquiry> enquiryId;

	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	public String getCustomerAdharCard() {
		return customerAdharCard;
	}

	public void setCustomerAdharCard(String customerAdharCard) {
		this.customerAdharCard = customerAdharCard;
	}

	public String getCustomerPanCard() {
		return customerPanCard;
	}

	public void setCustomerPanCard(String customerPanCard) {
		this.customerPanCard = customerPanCard;
	}

	public long getCustomerAdarNo() {
		return customerAdarNo;
	}

	public void setCustomerAdarNo(long customerAdarNo) {
		this.customerAdarNo = customerAdarNo;
	}

	public String getCustomerPanNo() {
		return customerPanNo;
	}

	public void setCustomerPanNo(String customerPanNo) {
		this.customerPanNo = customerPanNo;
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

	public List<Enquiry> getEnquiryId() 
	{
		return enquiryId;
	}

	public void setEnquiryId(List<Enquiry> enquiryId) {
		this.enquiryId = enquiryId;
	}

	

	
	
}
