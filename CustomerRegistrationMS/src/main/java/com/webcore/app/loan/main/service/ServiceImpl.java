package com.webcore.app.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;
import com.webcore.app.loan.main.model.CustomerDetail;
import com.webcore.app.loan.main.model.GaurantorDetails;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.PersonalDetails;
import com.webcore.app.loan.main.repository.AddressRepository;
import com.webcore.app.loan.main.repository.CustomerDetailsRepo;
import com.webcore.app.loan.main.repository.GaurantorDetailsRepo;
import com.webcore.app.loan.main.repository.HomeRepository;
import com.webcore.app.loan.main.repository.LeadRepo;
import com.webcore.app.loan.main.repository.PersonalDetailsRepo;

@Service
public class ServiceImpl implements ServiceInterf
{
	@Autowired
	HomeRepository hr;
	@Autowired
	AddressRepository ar;
	@Autowired
	CustomerDetailsRepo cr;
	@Autowired
	GaurantorDetailsRepo gd;
	@Autowired
	LeadRepo lr;
	
	@Autowired
	PersonalDetailsRepo personaldetails;
	
	
	@Override
	public void custAddress(Address adr) 
	{
		ar.save(adr);
	}

	@Override
	public void bankd(BankDetails bd) 
	{
		hr.save(bd);
	}

	@Override
	public void customerdetail(CustomerDetail cd) 
	{
	cr.save(cd);	
		
	}

	@Override
	public Iterable<CustomerDetail> getDetails() 
	{
		
		return cr.findAll();
	}

	@Override
	public void personalDetails(PersonalDetails pd)
	{
	
		personaldetails.save(pd);
		
	}

	@Override
	public void savegaurantorDetails(GaurantorDetails gaurantorDetails) 
	{
		gd.save(gaurantorDetails);
		
	}

	@Override
	public void lead(Lead lead) 
	{
		lr.save(lead);
		
	}
}
