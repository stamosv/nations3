package com.example.demo.repository.entities;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "countries")
@Data
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "area", nullable = false)
    private Double area;

    @Column(name = "national_day")
    private Date nationalDay;

    @Column(name = "country_code2", nullable = false)
    private String countryCode2;

    @Column(name = "country_code3", nullable = false)
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @OneToMany(mappedBy = "country")
    private List<CountryStat> countryStats;

}
