package com.example.City.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PublicTransport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private TransportType transportType;

    @ManyToOne
    private City city;

}
