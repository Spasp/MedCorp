package com.medicalcompany.springbootapp.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "Symptom")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Symptom_id")
    private Long id;
    @Column(name = "Name")
    private String name;

    @Column(name = "Date_of_occurrence")
    private String dateOfOccurrence;
    @Column(name = "Value")
    private float value;

    @JsonIgnore
    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Patient_id")
    private Patient patient;

}
