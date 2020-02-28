package com.webcore.app.loan.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.webcore.app.loan.main.model.Enquiry;


public interface EnquiryRepository extends CrudRepository<Enquiry,Integer>
{
	public Enquiry findByEnquiryId(int enquiryId);
}
        