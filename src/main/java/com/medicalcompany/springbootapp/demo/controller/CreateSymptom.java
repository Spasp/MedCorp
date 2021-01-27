package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CreateSymptom {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    SymptomRepository symptomRepository;

    @RequestMapping(value="/symptom/{name}/{patientId}/{dateOfOccurrence}", method= RequestMethod.GET)
    @ResponseBody
    public Symptom newSympt(@PathVariable String name, @PathVariable Long  patientId,@PathVariable String dateOfOccurrence){
        Optional<Patient> patient = patientRepository.findById(patientId);
        if (patient.isPresent()){
            Symptom symptom = new Symptom(name,patient.get(),dateOfOccurrence);
            Symptom savedSymptom = symptomRepository.save(symptom);
            return savedSymptom;


        }
        else{
            return new Symptom();
        }



    }



}
