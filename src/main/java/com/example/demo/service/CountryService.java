package com.example.demo.service;

import com.example.demo.domain.CountryDTO;
import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.domain.CountryStatDTO;

import java.util.List;

public interface CountryService {

    List<CountryDTO> getAllCountriesOrderedByName();

    List<String> findLanguagesByCountryId(Long countryId);

    List<CountryStatDTO> findCountryStatsWithMaxGdpPerPopulationRatio();

    List<CountryDetailsDTO> retrieveCountryDetails();

}
