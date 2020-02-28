package com.webcore.app.loan.main.service;

import java.util.List;

import com.webcore.app.loan.main.model.CustomerDetails;
//import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.Enquiry;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.PersonalDetails;

public interface HomeService 
{
	//public void registerCust(CustomerDetails cust);
	public void saveEnquiry(Enquiry enquiry);
	public void saveLead(Lead lead);
	public void saveCustomer(CustomerDetails customer);
	public Lead getData(int leadId);
	public List<Enquiry> getAllEnquiry();
	public List<Lead> getAllLead();
	public List<CustomerDetails> getAllCustomer();
	
}
