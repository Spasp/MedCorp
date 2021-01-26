package com.medicalcompany.springbootapp.demo.repository;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
