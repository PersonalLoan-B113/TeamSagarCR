package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cibill
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cibilId;
    private int leadId;
    private double cibilScore;
    private String cibilScoreDateAndTime;
    private int statusCode;
    private String Remarks;
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public double getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(double cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilScoreDateAndTime() {
		return cibilScoreDateAndTime;
	}
	public void setCibilScoreDateAndTime(String cibilScoreDateAndTime) {
		this.cibilScoreDateAndTime = cibilScoreDateAndTime;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
   
}
