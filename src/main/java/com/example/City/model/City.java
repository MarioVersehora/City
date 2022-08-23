package com.example.City.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    private List<Hospital> hospitalList = new ArrayList<>();

    @OneToMany
    private List<Citizen> citizenList = new ArrayList<>();

    @OneToMany
    List<MoveEvent> moveEvents = new ArrayList<>();


}
