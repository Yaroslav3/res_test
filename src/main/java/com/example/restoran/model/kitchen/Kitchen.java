package com.example.restoran.model.kitchen;


import com.example.restoran.model.unitsEnum.Units;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "kitchen")
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String name;

    private String countProducts;

    private String units;

}
