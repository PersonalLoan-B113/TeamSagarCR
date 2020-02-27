package com.webcore.app.loan.main.service;

import java.util.List;


import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;
import com.webcore.app.loan.main.model.Branch;

public interface ServiceInterf {

	void custAddress(Address adr);

	//List<Branch> branchd(Branch branch);

	void bankd(BankDetails bd);

	

}
