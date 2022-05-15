package net.javaguides.medical.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.medical.model.MedicalRecord;
import net.javaguides.medical.repository.MedicalRecordRepository;
import net.javaguides.medical.services.MedicalRecordService;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

	@Autowired
	MedicalRecordRepository medicalRecordRepository;

	@Override
	public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord) {
		// TODO Auto-generated method stub
		return medicalRecordRepository.save(medicalRecord);
	}

	@Override
	public List<MedicalRecord> getAllMedicalRecord() {
		// TODO Auto-generated method stub
		return medicalRecordRepository.findAll();
	}

	@Override
	public MedicalRecord getMedicalRecordById(Long medicalRecordId) {
		// TODO Auto-generated method stub
		return medicalRecordRepository.getById(medicalRecordId);
	}

	@Override
	public Boolean updateMedicalRecord(MedicalRecord medicalRecord, Long medicalRecordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteMedicalRecord(Long medicalRecordId) {
		// TODO Auto-generated method stub
		try {
			medicalRecordRepository.deleteById(medicalRecordId);
		return true;
	}catch (Exception e) {
		return false;
		}
	}
}