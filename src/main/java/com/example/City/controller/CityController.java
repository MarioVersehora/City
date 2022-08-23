package com.example.City.controller;

import com.example.City.exception.NoCityException;
import com.example.City.model.City;
import com.example.City.model.Hospital;
import com.example.City.repository.CityRepository;
import com.example.City.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("city")
public class CityController {

    private final CityService cityService;

    @GetMapping("{cityId}")
    public List<Hospital> getAllHospitalsFromCity(@PathVariable Integer cityId) throws NoCityException {
        return cityService.getAllHospitalsFromCity(cityId);
    }
}
