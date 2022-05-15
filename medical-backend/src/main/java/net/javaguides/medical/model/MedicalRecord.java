package net.javaguides.medical.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long medicalRecordId;
	private Long petientid;
	private Long doctorid;
	private String preception;
	private String healthproblem;
	private Date dateofrecord;

	public MedicalRecord() {

	}

	public Long getMedicalRecordId() {
		return medicalRecordId;
	}

	public void setMedicalRecordId(Long medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public Long getPetientid() {
		return petientid;
	}

	public void setPetientid(Long petientid) {
		this.petientid = petientid;
	}

	public Long getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(Long doctorid) {
		this.doctorid = doctorid;
	}

	public String getPreception() {
		return preception;
	}

	public void setPreception(String preception) {
		this.preception = preception;
	}

	public String getHealthproblem() {
		return healthproblem;
	}

	public void setHealthproblem(String healthproblem) {
		this.healthproblem = healthproblem;
	}

	public Date getDateofrecord() {
		return dateofrecord;
	}

	public void setDateofrecord(Date dateofrecord) {
		this.dateofrecord = dateofrecord;
	}

	@Override
	public String toString() {
		return "MedicalRecord [medicalRecordId=" + medicalRecordId + ", petientid=" + petientid + ", doctorid="
				+ doctorid + ", preception=" + preception + ", healthproblem=" + healthproblem + ", dateofrecord="
				+ dateofrecord + "]";
	}

}
