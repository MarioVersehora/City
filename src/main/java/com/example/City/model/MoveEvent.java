package com.example.City.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MoveEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private City city;

    @ManyToOne
    private City exCity;

    @ManyToOne
    private Citizen citizen;
}
