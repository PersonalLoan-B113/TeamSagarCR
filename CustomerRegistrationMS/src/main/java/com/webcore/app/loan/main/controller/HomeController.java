package com.webcore.app.loan.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BusinessDetails;
import com.webcore.app.loan.main.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	  @RequestMapping("/reg") 
	  public Branch register(@RequestBody Branch b) 
	  {
		  hs.saveData(b); 
		  return b;
	  
	  }
	  
	  @RequestMapping("/getBranchData") 
	  public List<Branch> getAllData() {
	  
	  List<Branch> blist=hs.getBranchData(); 
	  return blist;
	  }
	 
	  @RequestMapping("/businessDetailReg") 
	  public BusinessDetails regBusinessDetails(@RequestBody BusinessDetails bd) 
	  {
		  hs.saveBData(bd); 
		  return bd;
	  
	  }
	 

}
