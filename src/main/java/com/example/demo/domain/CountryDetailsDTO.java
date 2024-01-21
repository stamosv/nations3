package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDetailsDTO {

    private String continentName;
    private String regionName;
    private String countryName;
    private int year;
    private int population;
    private long gdp;

    // Constructor

    public CountryDetailsDTO(String continentName, String regionName, String countryName, int year, int population, long gdp) {
        this.continentName = continentName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }
}
