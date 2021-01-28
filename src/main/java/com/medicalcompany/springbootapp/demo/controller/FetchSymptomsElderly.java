package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.service.PatientService;
import com.medicalcompany.springbootapp.demo.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Controller to fetch all symptoms of Patients older than 65 and with multiple morbidities
@RestController
public class FetchSymptomsElderly {


        @Autowired
        private PatientService patientService;
        @Autowired
        private SymptomService symptomService;

    @RequestMapping(value = "/symptom/elderly", method = RequestMethod.GET)
    public List<List<Symptom>> fetchSymptEldr(){
        List<Long> patientsIds = patientService.findOver65MultiplMorbs();
        List<List<Symptom>> allSymptoms = new ArrayList<>();
        for (Long patientId : patientsIds) {
            List<Symptom> symptoms =symptomService.findSymptomById(patientId);
            allSymptoms.add(symptoms);

        }
        return allSymptoms;
    }


}
