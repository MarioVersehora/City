package com.example.City.controller;

import com.example.City.exception.NoCitizenException;
import com.example.City.model.HospitalVisit;
import com.example.City.service.HospitalVisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("hospitalVisit")
public class HospitalVisitController {

    private final HospitalVisitService hospitalVisitService;

    @GetMapping("{citizenId}")
    public List<HospitalVisit> getAllHospitalVisits(@PathVariable Integer citizenId) throws NoCitizenException {
        return hospitalVisitService.getAllHospitalVisits(citizenId);
    }
}
