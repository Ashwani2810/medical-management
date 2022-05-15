package net.javaguides.medical.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.medical.model.Patient;
import net.javaguides.medical.repository.PatientRepository;
import net.javaguides.medical.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient getpatientById(Long patientId) {
		// TODO Auto-generated method stub
		return patientRepository.getById(patientId);
	}

	@Override
	public Boolean deletePatient(Long patientId) {
		// TODO Auto-generated method stub
		try {
			patientRepository.deleteById(patientId);
			return true;
		}catch (Exception e) {
		return false;
		}
	}

	@Override
	public Boolean updatePatient(Long patientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
