package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Physician(Integer id) {
		super();
		this.setId(id);
		this.patientNotes= new ArrayList<String>();
	}
    // TO DO: Implement HIPAACompliantUser!
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	

	@Override
	public boolean assignPin(int pin) {
		if(pin>999 && pin<10000) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID==this.getId()) {
			return true;
		}else {			
		return false;
		}
	}
	
	
	
	
	// TO DO: Setters & Getters
	
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
	
}