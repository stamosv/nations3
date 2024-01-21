package com.example.demo.repository;


import com.example.demo.domain.CountryDetailsDTO;
import com.example.demo.repository.entities.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

    @Query("SELECT NEW com.example.demo.domain.CountryDetailsDTO(" +
            "cont.name, reg.name, c.name, cs.year, cs.population, cs.gdp) " +
            "FROM Continent cont " +
            "JOIN cont.regions reg " +
            "JOIN reg.countries c " +
            "JOIN c.countryStats cs " +
            "WHERE (cs.gdp / cs.population) = (" +
            "   SELECT MAX(cs2.gdp / cs2.population) " +
            "   FROM CountryStat cs2 " +
            "   WHERE cs2.country = c" +
            ") " +
            "ORDER BY (cs.gdp / cs.population) DESC")
    List<CountryDetailsDTO> retrieveCountryDetails();


}
