package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import com.medicalcompany.springbootapp.demo.service.PatientService;
import com.medicalcompany.springbootapp.demo.service.SymptomService;
import com.medicalcompany.springbootapp.demo.service.SymptomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CreateSymptom {

    @Autowired
    SymptomServiceImpl symptomService;
    @Autowired
    PatientService patientService;

    // Using GET to simulate input Form data. The proper way is Get(URL)->Form->Post(URL)->Model->Mapper(ModeltoObject)->DB

    @RequestMapping(value="/symptom/{name}/{patientId}/{dateOfOccurrence}", method= RequestMethod.GET)
    public Symptom newSympt(@PathVariable String name, @PathVariable Long  patientId,@PathVariable String dateOfOccurrence){
        Optional<Patient> patient = patientService.findPatientById(patientId);
        if (patient.isPresent()){
            Symptom symptom = new Symptom(name,patient.get(),dateOfOccurrence);
            Symptom savedSymptom = symptomService.save(symptom);
            return savedSymptom;


        }
        else{
            // in case there is no patient with given id return an empty object.
            return new Symptom();
        }



    }

    @RequestMapping(value="/symptom",method = RequestMethod.POST)
    public Symptom newSympt(@RequestBody Symptom symptom){
         return symptomService.save(symptom);
    }



}
