package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDTO {

    private Long countryId;
    private String name;
    private Double area;
    private String countryCode2;

    public CountryDTO(Long countryId, String name, Double area, String countryCode2) {
        this.countryId = countryId;
        this.name = name;
        this.area = area;
        this.countryCode2 = countryCode2;
    }
}
