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

import net.javaguides.medical.model.Patient;
import net.javaguides.medical.services.PatientService;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patient")
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
	}

	@PostMapping
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		return new ResponseEntity<Patient>(patientService.savePatient(patient), HttpStatus.CREATED);
	}

	@GetMapping("/{patientId}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long patientId) {
		return new ResponseEntity<Patient>(patientService.getpatientById(patientId), HttpStatus.OK);
	}
}
