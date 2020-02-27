package com.webcore.app.loan.main.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;

import com.webcore.app.loan.main.repository.AddressRepository;
import com.webcore.app.loan.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceInterf
{
	@Autowired
	HomeRepository hr;
	AddressRepository ar;
	
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

	

}
