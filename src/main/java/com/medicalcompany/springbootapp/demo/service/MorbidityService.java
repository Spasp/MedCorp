package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;

import java.util.Optional;

public interface MorbidityService {
    Morbidity register(String name);
    Optional<Morbidity> findByName(String Name);
    Morbidity save(Morbidity morbidity);

}
