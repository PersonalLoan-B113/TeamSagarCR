package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;

import com.webcore.app.loan.main.service.ServiceInterf;

@RestController
public class HomeController 
{ @Autowired
	
	ServiceInterf si;
	

	@RequestMapping("/regist")
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
	
	
}
