package com.example.City.service;

import com.example.City.model.Hospital;
import com.example.City.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }
}
