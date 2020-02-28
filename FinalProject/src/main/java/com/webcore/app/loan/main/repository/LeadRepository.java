package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import com.webcore.app.loan.main.model.Lead;

public interface LeadRepository extends CrudRepository<Lead,Integer>
{
	public Lead findByLeadId(int leadId);
} 