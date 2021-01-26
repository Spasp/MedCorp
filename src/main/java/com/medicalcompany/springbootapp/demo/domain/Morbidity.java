package com.medicalcompany.springbootapp.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Morbidity")
public class Morbidity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Morbidity_id")
    private Long id;
    @Column(name = "Name")
    private String name;
    @ManyToMany(mappedBy = "listOfMorbidities",fetch = FetchType.EAGER)
    private List<Patient> listOfPatients;

    public Morbidity(String name){
        this.name = name;
    }
    public Morbidity(){}


}
