package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BusinessDetails;
import com.webcore.app.loan.main.repository.BranchRepository;
import com.webcore.app.loan.main.repository.BusinessDetailsRepository;
import com.webcore.app.loan.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	BranchRepository br;
	
	@Autowired
	BusinessDetailsRepository bdr;
	
	@Override
	public void saveData(Branch b) {
		br.save(b);
		
	}

	
	  @Override public List<Branch> getBranchData() 
	  { 
	  List<Branch> blist= (List<Branch>) br.findAll();
	  return blist; 
	  }


	@Override
	public void saveBData(BusinessDetails bd) {

     bdr.save(bd);		
	}
	 
}
