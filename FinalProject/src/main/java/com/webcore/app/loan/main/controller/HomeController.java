package com.webcore.app.loan.main.controller;


import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.hibernate.dialect.MySQLDialect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.Enquiry;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	 @Autowired
	 HomeService hs; 
	 
	 @RequestMapping("/saveEnquiry")
	 public void saveEnquiry(@RequestBody Enquiry enquiry)
	 {
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		
		hs.saveEnquiry(enquiry);
	 } 
	 @RequestMapping("/saveCustomer")
	 public void saveCustomer(@RequestBody CustomerDetails customerDetails)
	 {
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		//System.out.println(customerDetails.getCustomerPersonalDetails().getDpendentMember());
		hs.saveCustomer(customerDetails);
	 }  
	 
	 @RequestMapping("/getAllCustomer")
	 public List<CustomerDetails> getAllCustomer()
	 {
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		//System.out.println(customerDetails.getCustomerPersonalDetails().getDpendentMember());
		return hs.getAllCustomer();
	 }  
	 
	 @RequestMapping("/saveLead")
	 public void saveLead(@RequestBody Lead lead)
	 {
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		//System.out.println(lead.getEnquiry().getEnquiryId());
				 
		hs.saveLead(lead);
	 }
	 @RequestMapping("/getAllEnquiry")
	 public List<Enquiry> getAllEnquiry()
	 {  
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		//System.out.println( hs.getAllEnquiry());
		return hs.getAllEnquiry();
	 }  
	 @RequestMapping("/getAllLead")
	 public List<Lead> getAllLead()
	 {
		//System.out.println(lead.getEnquiry().getAddress().getArea());
		//System.out.println( hs.getAllEnquiry());
		return hs.getAllLead();
	 }
	 @RequestMapping("/getData/{leadId}")
	 public Lead getData(@PathVariable("leadId") int leadId)
	 {
		//return hs.getData(enquiryId);
		// System.out.println("Area");
		// System.out.println(enquiry.getCreatedBy());
		//hs.saveEnquiry(enquiry); 
		 return hs.getData(leadId);
	 }
	 /*
	 @RequestMapping("/getData/{enquiryId}")
	 public Enquiry getData(@PathVariable("enquiryId") int enquiryId)
	 {
		//return hs.getData(enquiryId);
		// System.out.println("Area");
		// System.out.println(enquiry.getCreatedBy());
		//hs.saveEnquiry(enquiry); 
	 }*/
}
