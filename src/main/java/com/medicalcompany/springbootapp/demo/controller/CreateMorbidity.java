package com.medicalcompany.springbootapp.demo.controller;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.repository.MorbidityRepository;
import com.medicalcompany.springbootapp.demo.service.MorbidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateMorbidity {
    @Autowired
    private MorbidityService morbidityService;

// the proper way to create an  new object is with Post, i use GET to quickly pass data through params rather  than writing complete objects.

    @GetMapping(value="/morbidity/{name}")
    public Morbidity create(@PathVariable String name){
        return morbidityService.register(name);

    }

    @PostMapping(value ="/morbidity")
    public Morbidity registerMorbidity(@RequestBody Morbidity morbidity){
        return morbidityService.save(morbidity);
    }

}


