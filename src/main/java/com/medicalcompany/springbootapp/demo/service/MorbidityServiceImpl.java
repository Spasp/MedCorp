package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.repository.MorbidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MorbidityServiceImpl implements MorbidityService {
    @Autowired
    private MorbidityRepository morbidityRepository;

    @Override
    public Morbidity register(String name){

        Morbidity morbidity = new Morbidity(name);
        Morbidity savedMorbidity = morbidityRepository.save(morbidity);
        return savedMorbidity;



    }
    @Override
    public Optional<Morbidity> findByName(String name){
        return  morbidityRepository.findByName(name);

    }
    @Override
    public Morbidity save(Morbidity morbidity){
        return morbidityRepository.save(morbidity);
    }

}
