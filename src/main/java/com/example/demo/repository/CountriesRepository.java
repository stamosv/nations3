package com.example.demo.repository;


import com.example.demo.domain.CountryDTO;
import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.domain.CountryStatDTO;
import com.example.demo.repository.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountriesRepository extends JpaRepository<Country, Long> {

    @Query("SELECT NEW com.example.demo.domain.CountryDTO(c.countryId, c.name, c.area, c.countryCode2)" +
            " FROM Country c" +
            " ORDER BY c.name")
    List<CountryDTO> findAllCountriesOrderedByName();

    @Query("SELECT cl.language.language " +
            "FROM com.example.demo.repository.entities.CountryLanguage cl " +
            "JOIN cl.country c" +
            " WHERE c.countryId = :countryId")
    List<String> findLanguagesByCountryId(@Param("countryId") Long countryId);

    @Query("SELECT NEW com.example.demo.domain.CountryStatDTO(c.name, c.countryCode3, csMax.year, csMax.population, csMax.gdp) " +
            "FROM com.example.demo.repository.entities.CountryStat csMax " +
            "JOIN csMax.country c " +
            "WHERE (csMax.gdp / csMax.population) = (" +
            "   SELECT MAX(cs2.gdp / cs2.population) " +
            "   FROM com.example.demo.repository.entities.CountryStat cs2 " +
            "   WHERE cs2.country = c" +
            ") " +
            "ORDER BY (csMax.gdp / csMax.population) DESC")
    List<CountryStatDTO> findCountryStatsWithMaxGdpPerPopulationRatio();

}
