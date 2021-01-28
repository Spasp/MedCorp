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

    @Query(value="Select Patient_id  from Patient_Morbidity where Morbidity_id In (:morbidities) group by Patient_id HAVING COUNT(Patient_id)=(:length)",nativeQuery = true)
     List<Integer>  findPatientByMorbList(String[] morbidities, int length);

//Find Patients older than 65 and with multiple (>1) morbidity groups
    @Query(value="Select Distinct Patient_id from Patient where Patient_id In (SELECT  Patient_id from Patient_Morbidity group By Patient_id Having COUNT(Patient_id)>1) And 2021-Patient.Date_of_birth>60",nativeQuery = true)
    List<Long> findPatientsOver65MultipleMorbs();

}
