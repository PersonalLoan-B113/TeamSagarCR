package com.webcore.app.loan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PersonalDetails 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fatherName;
	private String motherName;
	private int noOfFamilyMember;
	private int noOfchild;
	private String maritalStatus;
	private String dependentMember;
	private double familyIncome;
	private String spouseName;
	private String nationality;
	    
	   
	    @OneToOne(cascade = CascadeType.ALL)
	    private Documents document;   
	    
	
	public Documents getDocument() {
		return document;
	}
	public void setDocument(Documents document) {
		this.document = document;
	}
	public int getId() 
	
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getNoOfFamilyMember() {
		return noOfFamilyMember;
	}
	public void setNoOfFamilyMember(int noOfFamilyMember) {
		this.noOfFamilyMember = noOfFamilyMember;
	}
	public int getNoOfchild() {
		return noOfchild;
	}
	public void setNoOfchild(int noOfchild) {
		this.noOfchild = noOfchild;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDependentMember() {
		return dependentMember;
	}
	public void setDependentMember(String dependentMember) {
		this.dependentMember = dependentMember;
	}
	public double getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
