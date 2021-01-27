package com.medicalcompany.springbootapp.demo.repository;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // custom query to check the patients over a certain (hardcoded) age. I used a simple integer as date of birth for convenience
    @Query(value="SELECT  * FROM Patient Where  2021-CAST(Patient.Date_of_birth AS INT )>(:age)", nativeQuery = true)
    List<Patient> findPatientByAge(int age);

}
