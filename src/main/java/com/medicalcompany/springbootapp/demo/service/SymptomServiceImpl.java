package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SymptomServiceImpl implements SymptomService {
    @Autowired
    SymptomRepository symptomRepository;
    @Override
    public Symptom register(String name,Patient patient,String dateOfOccurrence){
        Symptom symptom = new Symptom(name, patient,dateOfOccurrence);
        return symptomRepository.save(symptom);






    }
}
