package com.example.demo.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "continents")
@Data
@NoArgsConstructor
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id")
    private Long continentId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "continent")
    private List<Region> regions;


}