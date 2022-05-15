package net.javaguides.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.medical.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
