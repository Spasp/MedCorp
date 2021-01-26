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

    @RequestMapping(value="/test/{name}/{listOfMorbs}/{dateOfBirth}", method=RequestMethod.GET)
    @ResponseBody
    public Patient test(@PathVariable String name,@PathVariable String[] listOfMorbs,@PathVariable String dateOfBirth)
    {
        List<Morbidity> morbidities = new ArrayList<>();


        for (String morb:listOfMorbs){
            Optional<Morbidity> morbidity=morbidityService.findByName(morb);
            if (morbidity.isPresent()){
                morbidities.add(morbidity.get());



            }


        }


        Patient savedPatient = patientService.register(name,dateOfBirth,morbidities);



        return savedPatient;
    }
        // firstNameIds: [1,2,3,4]



//
//    @GetMapping(value = "/patient/{name}/{listOfMorb}/{dateOfBirth}")
//    @ResponseBody
    @RequestMapping(path="/patient/{name}/{listofMorb}/{dateOfBirth}", method = RequestMethod.GET)
    public Patient create(@PathVariable String name, @PathVariable String[] listOfMorb,@PathVariable String dateOfBirth){
        List<Morbidity> morbidities = new ArrayList<>();


        for (String morb:listOfMorb){
            Optional<Morbidity> morbidity=morbidityService.findByName(morb);
            if (morbidity.isPresent()){
                morbidities.add(morbidity.get());



            }


        }
        Patient dummy = new Patient();
        Patient patient = new Patient(name,dateOfBirth,morbidities);



        return dummy;
    }
}