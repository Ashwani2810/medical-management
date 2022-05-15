package net.javaguides.medical.services;

import java.util.List;

import net.javaguides.medical.model.MedicalRecord;

public interface MedicalRecordService{
	public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);

	public List<MedicalRecord> getAllMedicalRecord();

	public MedicalRecord getMedicalRecordById(Long medicalRecordId);

	public Boolean updateMedicalRecord(MedicalRecord medicalRecord, Long medicalRecordId);

	public Boolean deleteMedicalRecord(Long medicalRecordId);

}
