package net.javaguides.medical.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.medical.model.Doctor;
import net.javaguides.medical.repository.DoctorRepository;
import net.javaguides.medical.services.DoctorService;

@Service
public class DoctorserviceImpl  implements DoctorService{
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
		}

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Long doctorId) {
		// TODO Auto-generated method stub
		return doctorRepository.getById(doctorId);
	}

	@Override
	public Boolean deleteDoctor(Long doctorId) {
		try {
			doctorRepository.deleteById(doctorId);
			return true;
		}
		catch (Exception e) {
		// TODO Auto-generated method stub
		return false ;
		}
	}

	@Override
	public Boolean updateDoctor(Doctor doctor, Long doctorId) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
