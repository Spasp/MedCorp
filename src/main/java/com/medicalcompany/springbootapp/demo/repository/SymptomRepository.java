package com.medicalcompany.springbootapp.demo.repository;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {

    @Query(value="SELECT  * FROM Symptom Where  Symptom.Patient_id=(:id)", nativeQuery = true)
    List<Symptom> findSymptomById(Long id);




}
