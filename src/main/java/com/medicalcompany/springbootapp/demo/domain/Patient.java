package com.medicalcompany.springbootapp.demo.domain;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

    @Data
    @Entity
    @Table(name = "Patient")
    public class Patient {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Patient_id")
        private Long id;
        @Column(name = "Name")
        private String name;
        @OneToMany(mappedBy = "patient", targetEntity = Symptom.class)
        private List<Symptom>  symptoms;

        @Column(name = "Date_of_birth")
        @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
        private String dateOfBirth;
        @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        @JoinTable(name = "Patient_Morbidity",
                joinColumns = @JoinColumn(name = "Patient_id", referencedColumnName = "Patient_id"),
                inverseJoinColumns = @JoinColumn(name = "Morbidity_id", referencedColumnName = "Morbidity_id"))
        private List<Morbidity>  listOfMorbidities;






    }
