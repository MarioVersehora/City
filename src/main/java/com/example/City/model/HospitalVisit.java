package com.example.City.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class HospitalVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Hospital hospital;

    @ManyToOne
    private Citizen citizen;
}
