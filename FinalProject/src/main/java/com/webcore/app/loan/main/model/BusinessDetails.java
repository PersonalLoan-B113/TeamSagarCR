package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class BusinessDetails 
{
	@Id
	private int businessId;
	private	String businessType;
	private	String businessName;
	private String businessCertificateNo;
	@OneToOne
	private	Address businessAddress;
	private byte[] businessProof;//store image
	private byte[] businessPanCard;
	private byte[] businessLician;

}
