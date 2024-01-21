package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryStatDTO {

    private String name;
    private String countryCode3;
    private int year;
    private int population;
    private long gdp;

    public CountryStatDTO(String name, String countryCode3, int year, int population, long gdp) {
        this.name = name;
        this.countryCode3 = countryCode3;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }
}
