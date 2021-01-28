package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SymptomService {
    Symptom save(Symptom symptom);

    Symptom register(String name, Patient patient,String dateOfOccurrence);
    List<Symptom> listOfSymptoms(Long id);
}
