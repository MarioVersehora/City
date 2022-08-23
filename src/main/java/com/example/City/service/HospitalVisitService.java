package com.example.City.service;

import com.example.City.model.HospitalVisit;
import com.example.City.repository.HospitalVisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalVisitService {


    private final HospitalVisitRepository hospitalVisitRepository;

    public List<HospitalVisit> getAllHospitalVisits(Integer citizenId) {

    }




}
