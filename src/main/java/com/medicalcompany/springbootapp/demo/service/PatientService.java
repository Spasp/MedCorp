package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.domain.Patient;

import java.util.List;

public interface PatientService {
    Patient register(String name,  String dateOfBirth,List<Morbidity> morbidities);
}
