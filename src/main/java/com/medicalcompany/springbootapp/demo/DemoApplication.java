package com.medicalcompany.springbootapp.demo;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import com.medicalcompany.springbootapp.demo.domain.Patient;
import com.medicalcompany.springbootapp.demo.repository.MorbidityRepository;
import com.medicalcompany.springbootapp.demo.repository.PatientRepository;
import com.medicalcompany.springbootapp.demo.service.MorbidityService;
import com.medicalcompany.springbootapp.demo.service.MorbidityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private MorbidityRepository morbidityRepository;
@Autowired
private PatientRepository patientRepository;
@Autowired
private MorbidityService morbidityService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);














	}
	@Override
	public void run(String... args) {
		morbidityRepository.save(new Morbidity("5"));

		ArrayList<Integer> morbs =new ArrayList();
		int[] intArray = new int[3];
		morbs.add(5);
		morbs.add(6);



	}
	}





