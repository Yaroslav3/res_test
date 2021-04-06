package com.example.restoran.model.wareHouse;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.unitsEnum.Units;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "were_house")
public class WereHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String name;

    @OneToOne(mappedBy = "wereHouse", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CountProduct countProducts;

    @OneToOne(mappedBy = "wereHouse", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Units units;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountProduct getCountProducts() {
        return countProducts;
    }

    public void setCountProducts(CountProduct countProducts) {
        this.countProducts = countProducts;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }
}
