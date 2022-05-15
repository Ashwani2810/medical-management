package net.javaguides.medical.services;

import java.util.List;

import net.javaguides.medical.model.Doctor;

public interface DoctorService {
	public Doctor saveDoctor(Doctor doctor);

	public List<Doctor> getAllDoctor();

	public Doctor getDoctorById(Long doctorId);

	public Boolean deleteDoctor(Long doctorId);

	public Boolean updateDoctor(Doctor doctor, Long doctorId);

}
