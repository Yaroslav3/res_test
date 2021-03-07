package com.example.restoran.model.unitsEnum;

import com.example.restoran.model.wareHouse.WereHouse;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Table(name = "count_product")
public class CountProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "count")
    private int count;

    @OneToOne
    @MapsId
    @JoinColumn(name = "wereHouse_id")
    @JsonIgnore
    private WereHouse wereHouse;

//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name="were_house_id", nullable=false)
//    private WereHouse wereHouse;

}
