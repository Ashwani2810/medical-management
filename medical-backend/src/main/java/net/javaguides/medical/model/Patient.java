package net.javaguides.medical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	private String firstname;
	private String lastname;
	private String password;
	private String address;
	private String prescription;

	public Patient() {

	}

	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", address=" + address + ", prescription=" + prescription + "]";
	}

	
	
}
