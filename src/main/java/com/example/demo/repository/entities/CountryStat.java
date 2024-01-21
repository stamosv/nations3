package com.example.demo.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "country_stats")
@Data
@NoArgsConstructor
public class CountryStat {

    @EmbeddedId
    private CountryStatId id;

    @Column(name = "year")
    private Integer year;

    @Column(name = "population")
    private Integer population;

    @Column(name = "gdp")
    private Long gdp;

    @ManyToOne
    @MapsId("countryId")  // Refers to the "countryId" attribute in CountryStatId
    @JoinColumn(name = "country_id")
    private Country country;

//    @Transient
//    private double gdpPerPopulationRatio;

    public CountryStat(CountryStatId id, Integer year, Integer population, Long gdp) {
        this.id = id;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
//        this.gdpPerPopulationRatio = calculateGdpPerPopulationRatio();
    }

    private double calculateGdpPerPopulationRatio() {
        if (population != 0) {
            return gdp / population;
        } else {
            return 0;
        }
    }
}
