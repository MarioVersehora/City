package com.example.City.service;

import com.example.City.model.PublicTransport;
import com.example.City.repository.PublicTransportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublicTransportService {

    private final PublicTransportRepository publicTransportRepository;

    public PublicTransport savePublicTransport(PublicTransport publicTransport) {
        return publicTransportRepository.save(publicTransport);
    }

    public void deletePublicTransport(Integer publicTransportId) {
        publicTransportRepository.deleteById(publicTransportId);

    }

}
