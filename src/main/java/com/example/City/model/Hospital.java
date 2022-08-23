package com.example.City.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private City city;

    @ManyToMany
    private List<Citizen> citizens;


}
