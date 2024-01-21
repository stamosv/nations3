package com.example.demo.controller;

import com.example.demo.domain.CountryDTO;
import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.domain.CountryStatDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/countries")
@CrossOrigin(origins = "http://localhost:4200")
public interface CountryControllerAPI {

    @GetMapping("/all")
    List<CountryDTO> getAllCountriesOrderedByName();

    @GetMapping("/languages/{countryId}")
    List<String> findLanguagesByCountryId(@PathVariable Long countryId);

    @GetMapping("/country-stats")
    List<CountryStatDTO> findCountryStatsWithMaxGdpPerPopulationRatio();

    @GetMapping("/country-details")
    List<CountryDetailsDTO> retrieveCountryDetails();

}