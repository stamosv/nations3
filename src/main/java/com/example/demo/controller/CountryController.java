package com.example.demo.controller;

import com.example.demo.domain.CountryDTO;
import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.domain.CountryStatDTO;
import com.example.demo.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController implements CountryControllerAPI {

    private CountryServiceImpl countryServiceImpl;

    @Autowired
    public CountryController(CountryServiceImpl countryServiceImpl) {
        this.countryServiceImpl = countryServiceImpl;
    }

    @Override
    public List<CountryDTO> getAllCountriesOrderedByName() {
        return countryServiceImpl.getAllCountriesOrderedByName();
    }


    @Override
    public List<String> findLanguagesByCountryId(Long countryId) {
        return countryServiceImpl.findLanguagesByCountryId(countryId);
    }

    @Override
    public List<CountryStatDTO> findCountryStatsWithMaxGdpPerPopulationRatio() {
        return countryServiceImpl.findCountryStatsWithMaxGdpPerPopulationRatio();
    }

    @Override
    public List<CountryDetailsDTO> retrieveCountryDetails(){
        return countryServiceImpl.retrieveCountryDetails();
    }

}