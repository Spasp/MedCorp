package com.medicalcompany.springbootapp.demo.repository;

import com.medicalcompany.springbootapp.demo.domain.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {

}
