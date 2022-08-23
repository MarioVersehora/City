package com.example.City.controller;

import com.example.City.model.Hospital;
import com.example.City.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("hospital")
public class HospitalController {

    private final HospitalService hospitalService;

    @PostMapping
    public Hospital saveHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }
}
