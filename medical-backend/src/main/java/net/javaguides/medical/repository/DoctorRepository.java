package net.javaguides.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.medical.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
