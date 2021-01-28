package com.medicalcompany.springbootapp.demo.controller;


import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import com.medicalcompany.springbootapp.demo.service.SymptomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FetchSymptoms {


    @Autowired
    private SymptomRepository symptomRepository;

    @Autowired
    private SymptomService symptomService;



    @RequestMapping(value = "/symptom/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Symptom> patients(@PathVariable Long id) {
        return symptomService.listOfSymptoms(id);
    }



}
