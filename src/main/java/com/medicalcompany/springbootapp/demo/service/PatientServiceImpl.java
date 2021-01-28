package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient register(String name, String dateOfBirth, List<Morbidity> morbidities){
        Patient patient = new Patient(name,dateOfBirth,morbidities);
        Patient savedPatient = patientRepository.save(patient);




        return savedPatient;


    }
    @Override
    public Optional<Patient> findPatientById(Long id){
       return patientRepository.findById(id);
    }
    @Override
    public List<Patient> findPatientByAge(int age){

        return patientRepository.findPatientByAge(age);

    }
    @Override
    public List<Integer> findPatientByGivenList(String[] morbidities){
        int length = morbidities.length;
        return patientRepository.findPatientByMorbList(morbidities,length);

    }
    @Override
    public Patient save(Patient patient){
        return patientRepository.save(patient);
    }


}
