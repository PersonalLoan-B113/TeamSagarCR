package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.Enquiry;

public interface CustomerDetailsRepository extends CrudRepository<CustomerDetails,Integer>
{
	//public Enquiry findByEnquiryId(int enquiryId);
}

