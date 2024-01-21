package com.example.demo.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "region_areas")
@Data
@NoArgsConstructor
public class RegionArea {

    @Id
    @Column(name = "region_name", nullable = false)
    private String regionName;

    @Column(name = "region_area", nullable = false)
    private Double regionArea;
}
