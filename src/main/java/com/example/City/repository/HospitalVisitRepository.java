package com.example.City.repository;

import com.example.City.model.HospitalVisit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalVisitRepository extends JpaRepository<HospitalVisit, Integer> {
}
