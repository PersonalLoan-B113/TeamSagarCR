package com.webcore.app.loan.main.service;

import java.util.List;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BusinessDetails;

public interface HomeService {

	public void saveData(Branch b);

	 public List getBranchData();

	public void saveBData(BusinessDetails bd); 

}
