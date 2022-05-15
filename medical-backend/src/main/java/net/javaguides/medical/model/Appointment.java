package net.javaguides.medical.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentId;
	private String healthProblem;
	private String appointmentStatus;
	private Date dateOfAppointment;

	public Appointment() {

	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getHealthProblem() {
		return healthProblem;
	}

	public void setHealthProblem(String healthProblem) {
		this.healthProblem = healthProblem;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", healthProblem=" + healthProblem
				+ ", appointmentStatus=" + appointmentStatus + ", dateOfAppointment=" + dateOfAppointment + "]";
	}

}