package com.example.City.service;

import com.example.City.exception.NoCitizenException;
import com.example.City.model.HospitalVisit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitizenDocumentFacade {

    private final HospitalVisitService hospitalVisitService;

    public List<HospitalVisit> issueDocument(Integer citizenId) throws NoCitizenException {
        return hospitalVisitService.getAllHospitalVisits(citizenId);
    }
}
