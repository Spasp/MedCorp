package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FetchByAge {
    @Autowired
    private PatientService patientService;
    @RequestMapping(value="/patient/age/{age}", method = RequestMethod.GET)
    @ResponseBody
    public List<Patient> patients(@PathVariable int age){
        return patientService.findPatientByAge(age);
    }

}
