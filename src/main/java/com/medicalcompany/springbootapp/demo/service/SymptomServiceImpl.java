package com.medicalcompany.springbootapp.demo.service;

import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.domain.Symptom;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SymptomServiceImpl implements SymptomService {
    @Autowired
    SymptomService symptomService;
    @Autowired
    SymptomRepository symptomRepository;
    @Override
    public Symptom register(String name,Patient patient,String dateOfOccurrence){
        Symptom symptom = new Symptom(name, patient,dateOfOccurrence);
        return symptomRepository.save(symptom);

    }
    @Override
    public List<Symptom> listOfSymptoms(Long id){
       return symptomRepository.findSymptomById(id);

    }
    @Override
    public Symptom save(Symptom symptom){
        return symptomRepository.save(symptom);

    }
    @Override
    public Optional<Symptom> findById(Long id){
        return symptomRepository.findById(id);

    }
}
