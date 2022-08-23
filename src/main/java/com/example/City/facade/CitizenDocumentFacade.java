package com.example.City.facade;

import com.example.City.model.HospitalVisit;
import com.example.City.service.HospitalVisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitizenDocumentFacade {
    private final HospitalVisitService hospitalVisitService;

    public List<HospitalVisit> issueDocument(Integer citizenId) {
        return hospitalVisitService.getAllHospitalVisits(citizenId);
    }



}
