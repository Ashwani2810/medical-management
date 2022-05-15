package net.javaguides.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.medical.model.MedicalRecord;
import net.javaguides.medical.services.MedicalRecordService;

@RestController
@RequestMapping("/api/medicalRecord/")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordService;

	@GetMapping("/medicalRecord")
	public List<MedicalRecord> getAllMedicalRecord() {
		return medicalRecordService.getAllMedicalRecord();
	}

	@PostMapping
	public ResponseEntity<MedicalRecord> saveMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
		return new ResponseEntity<MedicalRecord>(medicalRecordService.saveMedicalRecord(medicalRecord),
				HttpStatus.CREATED);
	}

	@GetMapping("/{medicalRecordId}")
	public ResponseEntity<MedicalRecord> getMedicalRecordById(@PathVariable long id) {
		return new ResponseEntity<MedicalRecord>(medicalRecordService.getMedicalRecordById(id), HttpStatus.OK);
	}

}
