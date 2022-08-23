package com.example.City.controller;

import com.example.City.service.CitizenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("citizen")
public class CitizenController {

    private final CitizenService citizenService;

    @DeleteMapping("{citizenId}")
    public void softDelete(@PathVariable Integer citizenId) {
        citizenService.softDelete(citizenId);
    }
}
