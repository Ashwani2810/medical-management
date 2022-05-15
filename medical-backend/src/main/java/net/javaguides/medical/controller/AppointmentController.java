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

import net.javaguides.medical.model.Appointment;
import net.javaguides.medical.services.AppointmentService;

@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;

	@GetMapping("/appointments")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointment();
	}

	@PostMapping
	public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment) {
		return new ResponseEntity<Appointment>(appointmentService.saveAppointment(appointment), HttpStatus.CREATED);
	}

	@GetMapping("/{appointmentId}")
	public ResponseEntity<Appointment> getAppointmentById(@PathVariable Long appointmentId) {
		return new ResponseEntity<Appointment>(appointmentService.getAppointmentById(appointmentId), HttpStatus.OK);
	}

}
