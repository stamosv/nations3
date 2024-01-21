package com.example.demo.repository.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryStatId implements Serializable {

    @Column(name = "country_id")
    private Long countryId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryStatId that = (CountryStatId) o;
        return Objects.equals(countryId, that.countryId) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId);
    }
}