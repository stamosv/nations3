package com.example.demo.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "country_languages")
@Data
@NoArgsConstructor
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    private Boolean official;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "language_id", insertable = false, updatable = false)
    private Language language;
}
