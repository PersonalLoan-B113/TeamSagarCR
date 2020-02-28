package com.webcore.app.loan.main.service;
import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;
import com.webcore.app.loan.main.model.CustomerDetail;
import com.webcore.app.loan.main.model.GaurantorDetails;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.PersonalDetails;

public interface ServiceInterf 
{

	void custAddress(Address adr);
	
	void bankd(BankDetails bd);

	void customerdetail(CustomerDetail cd);

	Iterable<CustomerDetail> getDetails();

	void personalDetails(PersonalDetails pd);

	void savegaurantorDetails(GaurantorDetails gaurantorDetails);

	void lead(Lead lead);
}
