package com.example.demo.repository.entities;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "guests")
@Data
@NoArgsConstructor
public class Guest {

    @Id
    @Column(name = "guest_id")
    private Long guestId;

    @Column(name = "name", nullable = false)
    private String name;
}
