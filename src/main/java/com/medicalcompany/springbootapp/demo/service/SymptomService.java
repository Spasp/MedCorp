package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;

public interface SymptomService {
    Symptom register(String name, Patient patient,String dateOfOccurrence);
}
