package com.example.City.repository;

import com.example.City.model.PublicTransport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicTransportRepository extends JpaRepository<PublicTransport, Integer> {
}
