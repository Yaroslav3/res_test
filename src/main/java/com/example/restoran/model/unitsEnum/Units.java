package com.example.restoran.model.unitsEnum;


import com.example.restoran.model.wareHouse.WereHouse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "units")
public class Units {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "unitsName")
    private String unitsName;

    @OneToOne
    @MapsId
    @JoinColumn(name = "wereHouse_id")
    @JsonIgnore
    private WereHouse wereHouse;

}
