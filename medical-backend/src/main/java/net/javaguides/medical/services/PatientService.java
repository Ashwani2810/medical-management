package net.javaguides.medical.services;

import java.util.List;

import net.javaguides.medical.model.Patient;

public interface PatientService {
	public Patient savePatient(Patient patient);

	public List<Patient> getAllPatient();

	public Patient getpatientById(Long patientId);

	public Boolean deletePatient(Long patientId);

	public Boolean updatePatient(Long patientId);

}
