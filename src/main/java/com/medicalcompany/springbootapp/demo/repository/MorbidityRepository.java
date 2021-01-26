package com.medicalcompany.springbootapp.demo.repository;

import com.medicalcompany.springbootapp.demo.domain.Morbidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MorbidityRepository extends JpaRepository<Morbidity,Long> {
    Optional<Morbidity> findByName(String Name);

}
