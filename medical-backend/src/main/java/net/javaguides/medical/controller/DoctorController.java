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

import net.javaguides.medical.model.Doctor;
import net.javaguides.medical.services.DoctorService;

@RestController
@RequestMapping("/api/doctor/")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	// get all doctors

	@PostMapping
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {System.out.println("hello "+doctor);
		return new ResponseEntity<Doctor>(doctorService.saveDoctor(doctor), HttpStatus.CREATED);
	}

	@GetMapping("/doctors")
	public List<Doctor> getAllDoctor() {
		return doctorService.getAllDoctor();
	}

	@GetMapping("/{doctorId}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable long id) {
		return new ResponseEntity<Doctor>(doctorService.getDoctorById(id), HttpStatus.OK);
	}
}
