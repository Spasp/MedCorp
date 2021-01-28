package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import java.util.List;
import java.util.Optional;


public interface SymptomService {
    Symptom save(Symptom symptom);

    Symptom register(String name, Patient patient,String dateOfOccurrence);
    List<Symptom> listOfSymptoms(Long id);
    Optional<Symptom> findById(Long id);

}
