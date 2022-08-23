package com.example.City.service;

import com.example.City.exception.NoCityException;
import com.example.City.model.City;
import com.example.City.model.Hospital;
import com.example.City.repository.CityRepository;
import com.example.City.repository.MoveEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    private final MoveEventRepository moveEventRepository;

    public List<Hospital> getAllHospitalsFromCity(Integer cityId) throws NoCityException {
        Optional<City> city = cityRepository.findById(cityId);
        if(city.isEmpty()) {
            throw new NoCityException("No city found!");
        }

        return city.get().getHospitalList();
    }

//    public Long numberOfAllCitizens(Integer cityId) {
//        return moveEventRepository.findAll().stream()
//                .filter(me -> me.)
//    }


}
