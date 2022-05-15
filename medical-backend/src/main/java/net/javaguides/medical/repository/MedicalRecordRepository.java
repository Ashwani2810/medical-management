package net.javaguides.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.medical.model.MedicalRecord;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

}
