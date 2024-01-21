package com.example.demo.repository.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "vips")
@Data
@NoArgsConstructor
public class Vip {

    @Id
    @Column(name = "vip_id")
    private Long vipId;

    @Column(name = "name", nullable = false)
    private String name;
}
