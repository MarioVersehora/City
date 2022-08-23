package com.example.City.service;

import com.example.City.exception.NoCitizenException;
import com.example.City.model.Citizen;
import com.example.City.model.HospitalVisit;
import com.example.City.repository.CitizenRepository;
import com.example.City.repository.HospitalVisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HospitalVisitService {


    private final HospitalVisitRepository hospitalVisitRepository;
    private final CitizenRepository citizenRepository;

    public List<HospitalVisit> getAllHospitalVisits(Integer citizenId) throws NoCitizenException {
        Optional<Citizen> citizen = citizenRepository.findById(citizenId);
        if (citizen.isEmpty()) {
            throw new NoCitizenException("No citizen found");
        }

        return citizen.get().getHospitalVisits();

    }


}
