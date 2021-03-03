package com.example.restoran.model.wareHouse;

import lombok.Builder;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Builder
@Table(name = "were_house")
public class WereHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "count")
    private int count;
    @Column(name = "units")
    private String units;

}
