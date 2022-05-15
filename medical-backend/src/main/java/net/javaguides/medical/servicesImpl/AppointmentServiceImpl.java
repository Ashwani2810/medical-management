package net.javaguides.medical.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.medical.model.Appointment;
import net.javaguides.medical.repository.AppointmentRepository;
import net.javaguides.medical.services.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);

	}

	@Override
	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment getAppointmentById(Long appointmentId) {
		// TODO Auto-generated method stub
		return appointmentRepository.getById(appointmentId);
	}

	@Override
	public Boolean updateAppointment(Appointment appointment, Long appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAppointment(Long appointmentId) {
		// TODO Auto-generated method stub
		try {
			appointmentRepository.deleteById(appointmentId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}