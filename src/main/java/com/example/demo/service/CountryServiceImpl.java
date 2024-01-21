package com.example.demo.service;

import com.example.demo.domain.CountryDTO;
import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.domain.CountryStatDTO;
import com.example.demo.repository.ContinentRepository;
import com.example.demo.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    private CountriesRepository countriesRepository;

    private ContinentRepository continentRepository;

    @Autowired
    public CountryServiceImpl(CountriesRepository countriesRepository, ContinentRepository continentRepository) {
        this.countriesRepository = countriesRepository;
        this.continentRepository = continentRepository;
    }

    public List<CountryDTO> getAllCountriesOrderedByName() {
        return countriesRepository.findAllCountriesOrderedByName();
    }


    public List<String> findLanguagesByCountryId(Long countryId) {
        return countriesRepository.findLanguagesByCountryId(countryId);
    }

    public List<CountryStatDTO> findCountryStatsWithMaxGdpPerPopulationRatio() {
        return countriesRepository.findCountryStatsWithMaxGdpPerPopulationRatio();
    }

    public List<CountryDetailsDTO> retrieveCountryDetails() {
        return continentRepository.retrieveCountryDetails();
    }


}
