package com.example.City.model;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SQLDelete(sql = "UPDATE citizen SET deleted = true WHERE id=?")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    List<HospitalVisit> hospitalVisits = new ArrayList<>();

    private boolean dead = false;

    @ManyToMany
    private List<Hospital> hospitals = new ArrayList<>();

    @OneToMany
    List<MoveEvent> moveEvents;


}
