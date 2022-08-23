package com.example.City.controller;


import com.example.City.model.PublicTransport;
import com.example.City.service.PublicTransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("publicTransport")
public class PublicTransportController {

    private final PublicTransportService publicTransportService;

    @PostMapping
    public PublicTransport savePublicTransport(@RequestBody PublicTransport publicTransport) {
        return publicTransportService.savePublicTransport(publicTransport);
    }

    DeleteMapping("{publicTransportId}")
    public void deletePublicTransport(@PathVariable Integer publicTransportId) {
        publicTransportService.deletePublicTransport(publicTransportId);

    }

}
