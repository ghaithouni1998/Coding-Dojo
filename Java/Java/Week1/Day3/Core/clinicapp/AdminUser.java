package com.caresoft.clinicapp;

import java.util.ArrayList;

import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    
    public AdminUser(Integer employeeID,String role) {
		super();
		this.employeeID=employeeID;
		this.role=role;
		this.securityIncidents = new ArrayList<String>();
	}
       
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public Integer getEmployeeID() {
		return employeeID;
	}
    
    @Override
    public boolean assignPin(int pin) {
    	return false;
    }
    

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	
	

	public String getRole() {
		return role;
	}
	
	

	public void setRole(String role) {
		this.role = role;
	}
	
	

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
	

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
    
}
