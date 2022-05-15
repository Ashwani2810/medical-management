package net.javaguides.medical.services;

import java.util.List;

import net.javaguides.medical.model.Appointment;

public interface AppointmentService {
	public Appointment saveAppointment(Appointment appointment);

	public List<Appointment> getAllAppointment();

	public Appointment getAppointmentById(Long appointmentId);

	public Boolean updateAppointment(Appointment appointment, Long appointmentId);

	public Boolean deleteAppointment(Long appointmentId);

}
