package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FetchPatient {
    @Autowired
    private PatientRepository patientRepository ;
    @Autowired
    private PatientService patientService;
    @RequestMapping(value="/patient/find/{listOfMorbs}", method= RequestMethod.GET)
    public List<Patient> fetchPatient(@PathVariable String [] listOfMorbs){
       List<Integer> listOfPatients =patientService.findPatientByGivenList(listOfMorbs);
       List<Patient> patients = new ArrayList<Patient>();
        for (Integer id : listOfPatients) {
            Optional<Patient> patient = patientRepository.findById(id.longValue());
            patients.add(patient.get( ));

        }
       return patients;

    }
}
