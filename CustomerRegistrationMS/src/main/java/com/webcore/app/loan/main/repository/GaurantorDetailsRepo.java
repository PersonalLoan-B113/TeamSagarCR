package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.GaurantorDetails;

@Repository
public interface GaurantorDetailsRepo extends CrudRepository<GaurantorDetails, Integer>{

}
