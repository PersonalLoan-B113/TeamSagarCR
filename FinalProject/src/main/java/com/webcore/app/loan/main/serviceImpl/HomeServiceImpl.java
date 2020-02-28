package com.webcore.app.loan.main.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.CustomerDetails;
//import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.Enquiry;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.PersonalDetails;
import com.webcore.app.loan.main.repository.CustomerDetailsRepository;

import com.webcore.app.loan.main.repository.EnquiryRepository;
import com.webcore.app.loan.main.repository.LeadRepository;
import com.webcore.app.loan.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	

	 @Autowired
	 EnquiryRepository er;

	 @Autowired
	 LeadRepository lr;
	 
	 @Autowired
	 CustomerDetailsRepository cdr;
	 
	 //@Autowired
	// CustomerPersonalDetails cpd;
	
	//public void registerCust(CustomerDetails cust) {
		// TODO Auto-generated method stub
		
	//}
	@Override
	public void saveEnquiry(Enquiry enquiry) {
		// TODO Auto-generated method stub
		er.save(enquiry);
		
	}



	@Override
	public Lead getData(int leadId) {
		// TODO Auto-generated method stub
		return lr.findByLeadId(leadId);
	}

	@Override
	public void saveLead(Lead lead) {
		lr.save(lead);
	}



	@Override
	public List<Enquiry> getAllEnquiry() {
		List<Enquiry> list= (List<Enquiry>) er.findAll();
		return list;
	}



	@Override
	public List<Lead> getAllLead() {
		List<Lead> list=(List<Lead>)lr.findAll();
		return list;
	}



	@Override
	public void saveCustomer(CustomerDetails customer) {
		cdr.save(customer);
		
	}



	@Override
	public List<CustomerDetails> getAllCustomer() {
		List<CustomerDetails> list=(List<CustomerDetails>) cdr.findAll();
		return list;
	}

 

	
	
}
