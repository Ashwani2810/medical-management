package net.javaguides.medical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long doctorId;

	private String firstname;

	private String lastname;

	private String emailId;
	private String password;

	private String qulification;
	private String specialization;

	public Doctor() {

	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public String getspecialization() {
		return specialization;
	}

	public void setspecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId="
				+ emailId + ", password=" + password + ", qulification=" + qulification + ", specialization=" + specialization
				+ "]";
	}

	
}
