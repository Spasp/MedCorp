package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.service.MorbidityService;
import com.medicalcompany.springbootapp.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CreatePatient {
    @Autowired
    private PatientRepository patientRepository ;
    @Autowired
    private PatientService patientService;
    @Autowired
    private MorbidityService morbidityService;

    @RequestMapping(value = "/patient/{name}/{listOfMorbs}/{dateOfBirth}", method = RequestMethod.GET)
    public Patient newPat(@PathVariable String name, @PathVariable String[] listOfMorbs, @PathVariable String dateOfBirth) {
        List<Morbidity> morbidities = new ArrayList<>();

        //creating the Patient with the list of the morbidities with Jpa repository methods.


        for (String morb : listOfMorbs) {
            Optional<Morbidity> morbidity = morbidityService.findByName(morb);
            if (morbidity.isPresent()) {
                morbidities.add(morbidity.get());


            }


        }


        Patient savedPatient = patientService.register(name, dateOfBirth, morbidities);


        return savedPatient;
    }

// the proper way to create a Patient Instance. Of course we need an extra model(dto) , mappers, services
    //to establish the relation with Morbidity Instances.
    @RequestMapping(value="/patient",method=RequestMethod.POST)
    public Patient newPatient(@RequestBody Patient patient){
        return patientService.save(patient);
    }

}