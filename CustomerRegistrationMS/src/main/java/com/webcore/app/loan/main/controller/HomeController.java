package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;

import com.webcore.app.loan.main.model.CustomerDetail;
import com.webcore.app.loan.main.model.GaurantorDetails;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.PersonalDetails;
import com.webcore.app.loan.main.service.ServiceInterf;

@RestController
@CrossOrigin("*")
public class HomeController 
{
	@Autowired
    ServiceInterf si;
	
	@PostMapping("/regist")
	public String custAddress(@RequestBody Address adr)
	{   
		si.custAddress(adr);
		return "Address added";
	}
	
	@PostMapping("/bank")
	public void bankd(@RequestBody BankDetails bd)
	{
		System.out.println(bd.getBankId());
		si.bankd(bd);
		
	}
	
	@PostMapping("/custDetails")
	public void customerDetails(@RequestBody CustomerDetail cd)
	{
		si.customerdetail(cd);
	}
	
	@GetMapping("/getDetails")
	
	public List<CustomerDetail> getDetails()
	{
		List<CustomerDetail> list=(List<CustomerDetail>) si.getDetails();
		
		return list;
	}
	
	@PostMapping("/personalDetail")
	public void personalDetails(@RequestBody PersonalDetails pd)
	{
		si.personalDetails(pd);
	}
	
	@PostMapping("/gaurantorDetails")
	public void gaurantorDetails(@RequestBody GaurantorDetails gaurantorDetails)
	{
		si.savegaurantorDetails(gaurantorDetails);
	}  
	
	@PostMapping("/lead")
	public void lead(@RequestBody Lead lead)
	{
		si.lead(lead);
	}
	
}
