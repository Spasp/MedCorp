package com.medicalcompany.springbootapp.demo.controller;


import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import com.medicalcompany.springbootapp.demo.service.SymptomService;
import com.medicalcompany.springbootapp.demo.service.TestInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FetchSymptoms {
@Autowired
    TestInter testInter;
//
//    @Autowired
//    private SymptomRepository symptomRepository;
//
//    @Autowired
//    private SymptomService symptomService;


//
//    @RequestMapping(value = "/symptom/id/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Symptom> patients(@PathVariable Long id) {
//        return symptomService.listOfSymptoms(id);
//    }



}
