package com.medicalcompany.springbootapp.demo;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.repository.MorbidityRepository;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.repository.SymptomRepository;
import com.medicalcompany.springbootapp.demo.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private MorbidityRepository morbidityRepository;
@Autowired
private PatientRepository patientRepository;
@Autowired
private PatientService patientService;
@Autowired
private	SymptomRepository symptomRepository;
@Autowired
private MorbidityService morbidityService;


@Autowired
private SymptomService symptomService;


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);














	}
	@Override
	public void run(String... args) {
		morbidityService.save(new Morbidity("6"));
		morbidityService.save(new Morbidity("7"));
		//patientService.register("Stavros","1948", {2,3});

		// Test for inputing data



	}
	}





