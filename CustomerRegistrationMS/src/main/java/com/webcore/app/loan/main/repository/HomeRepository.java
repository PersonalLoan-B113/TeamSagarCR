package com.webcore.app.loan.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;
import com.webcore.app.loan.main.model.Branch;

@Repository
public interface HomeRepository  extends CrudRepository<BankDetails	, Integer>
{


	
	

	
	
}
